def call (Map stageParams) {      
rtUpload (
    serverId: 'Artifactory',
    spec: '''{
          "files": [
            {
              "pattern": "target/simple-spring-webapp-1.0.war",
              "target": "DevSecOpspetclinic"
            }
         ]
    }''',
)
    }
