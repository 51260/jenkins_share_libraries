def call(Map config=[:], Closure body={}) {
    stage("SonarQube Code Analysis") {            
           withSonarQubeEnv('Sonarqube') {
            sh 'mvn verify sonar:sonar'
          } 
        echo "SONARQUBE ANALYSIS DONE"
    }
    body()
}
