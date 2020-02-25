def call(Map config=[:], Closure body={}) {
 stage("Code Checkout")   
 checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }
    body()
}
