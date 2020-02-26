def call (Map stageParams) {
      rtUpload (
          serverId: stageParams.Artifactory,
          buildName: 'DevSecOps_CICD',
          buildNumber: Env.BUILD_ID,
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
