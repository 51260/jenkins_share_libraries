def call(Closure body={}) {
    stage("Artifact Upload") {
         rtUpload (
                serverId: 'Artifactory',
                buildName: 'DevSecOps_CICD',
                buildNumber: env.BUILD_ID,
                spec:'''{
                    "files": [
                        {
                        "pattern": "target/simple-spring-webapp-1.0.war",
                        "target": "DevSecOpspetclinic"
                        }
                    ]
                }'''
              )
    }
        body()
}
