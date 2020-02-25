def call() {
rtUpload (
                def server = Artifactory.server('Artifactory'),
                buildName: 'DevSecOps_CICD',
                buildNumber: Env.BUILD_ID,
                def uploadSpec :'''{
                    "files": [
                        {
                        "pattern": "${Env.PATTERN_ARTIFACTORY_FOLDER}", 
                        "target": "${Env.TARGET_ARTIFACTORY_FOLDER}" 
                        }
                    ]
                }'''
                server.upload(uploadSpec)
                )
                echo 'ARTIFACT UPLOADED TO THE ARTIFACTORY'
 }
