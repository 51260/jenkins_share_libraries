def call(Map config=[:], Closure body={}) {
    stage("Code Checkout") {
        checkout([$class: 'GitSCM', 
                    branches: [[name: '*/master']], 
                    userRemoteConfigs: [[url: env.GIT_REPO]]])
                    clearWorkspace: true

        echo 'GIT CHECK OUT DONE'
    }
    body()
}
