import org.environment.Env;

def call(Map config=[:], Closure body={}) {
    stage("Code Checkout") {
        checkout([$class: 'GitSCM', 
                    branches: [[name: '*/master']], 
                    userRemoteConfigs: [[url: Env.GIT_REPO]]])

        echo 'GIT CHECK OUT DONE'
    }
    body()
}
