def call(Map config=[:], Closure body={}) {
    stage("Maven Build") {
        switch(Env.buildTool){
            case 'maven':
                sh 'mvn clean install'
                break
            case 'gradle':
                 sh 'gradle build'
                break
            case 'npm':
                  sh 'npm install'
                break
                }
                }
    body()
}
