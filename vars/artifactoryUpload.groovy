def call() {
    stage("Artifact Upload") {
        script { 
            def server = Artifactory.server "Artifactory"
            def spec = """{ 
            "files": [
            { 
            "pattern": "${env.PATTERN_ARTIFACTORY_FOLDER}", 
            "target": "${env.TARGET_ARTIFACTORY_FOLDER}" 
            }
            ] 
            }"""
           server.upload(spec) 
        } 
        echo 'ARTIFACT UPLOADED TO THE ARTIFACTORY'
    }
    body()
}
