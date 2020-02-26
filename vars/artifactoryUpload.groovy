def call() {
    stage("Artifact Upload") {
            def uploadSpec = """{ 
            "files": [
            { 
            "pattern": "${env.PATTERN_ARTIFACTORY_FOLDER}", 
            "target": "${env.TARGET_ARTIFACTORY_FOLDER}" 
            }
            ] 
            }""" 
            def server = Artifactory.server "Artifactory"
            server.upload spec: uploadSpec          
    }
}
