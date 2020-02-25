def call(Map stageParams) {
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
