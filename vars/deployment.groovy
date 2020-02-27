def call(Map config=[:], Closure body={}) {
    stage("App Deployment") {          
          sh 'ansible-playbook deployment.yml -i hosts --private-key /home/ec2-user/DevSecOpsWebServer.pem'
    }
       body()
}
