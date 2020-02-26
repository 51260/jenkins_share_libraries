def call(Map config=[:], Closure body={}) {
    stage("Artifact Upload") {
        script { 
            def server = Artifactory.server('Artifactory')
            def uploadSpec = """{ 
            "files": [{ 
            "pattern": "${Env.PATTERN_ARTIFACTORY_FOLDER}", 
            "target": "${Env.TARGET_ARTIFACTORY_FOLDER}" 
            }] 
            }""" 
            server.upload(uploadSpec) 
        } 
        echo 'ARTIFACT UPLOADED TO THE ARTIFACTORY'
    }
    body()
}
