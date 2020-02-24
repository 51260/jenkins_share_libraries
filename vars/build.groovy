def call(Map stageParams){
        switch(stageParams.buildTool){
            case 'maven':
                mvn clean install
                break
            case 'mta':
                mtaBuild script: script
                break
            case 'npm':
                npmExecute script: script
                break
            case ['docker', 'kaniko']:
                DockerUtils dockerUtils = new DockerUtils(script)
                if (config.buildTool == 'docker' && !dockerUtils.withDockerDaemon()) {
                    config.buildTool = 'kaniko'
                    echo "[${STEP_NAME}] No Docker daemon available, thus switching to Kaniko build"
                }
                }
