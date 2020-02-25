def call() {
rtUpload (
                def server = Artifactory.server('Artifactory'),
                buildName: 'DevSecOps_CICD',
                buildNumber: Env.BUILD_ID,
                spec:'''{
                    "files": [
                        {
                        "pattern": "${Env.PATTERN_ARTIFACTORY_FOLDER}", 
                        "target": "${Env.TARGET_ARTIFACTORY_FOLDER}" 
                        }
                    ]
                }'''
                )
                echo 'ARTIFACT UPLOADED TO THE ARTIFACTORY'
 }
