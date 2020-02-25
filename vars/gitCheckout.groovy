import org.environment.Env
def call(Map stageParams) {  
 checkout([
        $class: 'GitSCM',
        branches: [[name:  '*/master' ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
    body()
}
