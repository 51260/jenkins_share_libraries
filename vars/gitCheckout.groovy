import org.environment.Env
def call(Map config=[:], Closure body={}) {
 stage("Code Checkout")   
 checkout([
        $class: 'GitSCM',
        branches: [[name:  '*/master' ]],
        userRemoteConfigs: [[ url: ENV.giturl ]]
    ])
  }
    body()
}
