def call() {
    stage("Artifact Upload") {
        script { 
            def server = Artifactory.server "Artifactory"
            def uploadSpec = """{ 
            "files": [
            { 
            "pattern": "${env.PATTERN_ARTIFACTORY_FOLDER}", 
            "target": "${env.TARGET_ARTIFACTORY_FOLDER}" 
            }
            ] 
           }"""
            server.upload(uploadSpec) 
        } 
        echo 'ARTIFACT UPLOADED TO THE ARTIFACTORY'
    }
    body()
}
