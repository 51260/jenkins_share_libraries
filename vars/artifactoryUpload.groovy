def call (Map stageParams) {      
rtUpload (
    serverId: 'Artifactory',
    failNoOp: true,
    spec: '''{
          "files": [
            {
              "pattern": "target/simple-spring-webapp-1.0.war",
              "target": "DevSecOpspetclinic"
            }
         ]
    }'''
)
    }
