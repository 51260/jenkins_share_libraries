def call(Closure body={}) {
        stage('DAST scan') {
                script {
                   sh 'zap-cli quick-scan --spider http://ec2-34-214-172-180.us-west-2.compute.amazonaws.com:8080/simple-spring-webapp-1.0/'
                }
            }
    post {
        always {
            script {
                archiveZap(failAllAlerts: 0, failHighAlerts: 0, failMediumAlerts: 0, failLowAlerts: 0)
            }
        }
}
    body()
}
