def call() {
    stage("Artifact Upload") {
            def server = Artifactory.server "Artifactory"
            def uploadSpec = """{ 
            "files": [
            { 
            "pattern": "${env.PATTERN_ARTIFACTORY_FOLDER}", 
            "target": "${env.TARGET_ARTIFACTORY_FOLDER}" 
            }
            ] 
            }""" 
            server.upload spec: uploadSpec          
    }
}
