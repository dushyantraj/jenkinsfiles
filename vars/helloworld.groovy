def call(Map config = [:]){
    sh "echo hello world"
    sh "echo ${config.name} and ${config.day}"
}

