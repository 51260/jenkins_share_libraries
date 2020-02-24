def call(Map stageParams){
        switch(stageParams.buildTool){
            case 'maven':
                sh 'mvn clean install'
                break
            case 'mta':
                mtaBuild script: script
                break
            case 'npm':
                npmExecute script: script
                break
                }
                }
