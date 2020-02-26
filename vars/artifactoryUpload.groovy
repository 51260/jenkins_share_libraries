def call(Map config=[:], Closure body={}) {
    stage("Artifact Upload") {
        script { 
            def server = Artifactory.newServer url: 'http://ec2-34-223-129-121.us-west-2.compute.amazonaws.com:8081/', username: 'admin', password: 'DevSecOps'
            def uploadSpec = """{ 
            "files": [{ 
            "pattern": "${env.PATTERN_ARTIFACTORY_FOLDER}", 
            "target": "${env.TARGET_ARTIFACTORY_FOLDER}" 
            }] 
            }""" 
            server.upload(uploadSpec) 
        } 
        echo 'ARTIFACT UPLOADED TO THE ARTIFACTORY'
    }
    body()
}
