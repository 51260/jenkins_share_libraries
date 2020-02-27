def call(Closure body={}) {
    stage("Starting Zap") {
                startZap(
                    host: "127.0.0.1", 
                    port: '8090', 
                    zapHome: "/opt/ZAP_2.9.0",
                    allowedHosts:['http://ec2-34-211-215-31.us-west-2.compute.amazonaws.com:8080/simple-spring-webapp-1.0/'])
            sh "ps auxwww|grep -i zap"
    }
    body()
}

def call(Closure body={}) {
        stage('DAST scan') {
            steps {
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
}
    body()
}
