def call(Closure body={}) {
    stage("Artifact download") {
        rtDownload (
          serverId: 'Artifactory',
          buildName: 'DevSecOps_CICD',
          buildNumber: env.BUILD_ID,
          spec: '''{
                "files": [
                  {
                    "pattern": "DevSecOpspetclinic/",
                    "target": "./"
                  }
                ]
          }''',
      )
    }
        body()
}
