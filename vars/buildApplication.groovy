def call(Map config=[:], Closure body={}) {
    stage("Maven Build") {          
           sh 'mvn clean install'
    }
       body()
}
