def call(Map config=[:], Closure body={}){
       stage("Build") {
        switch(stageParams.buildTool){
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
}
