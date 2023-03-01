def call(Map config = [:]){
    sh "echo hello world"
    sh "echo ${name.config} and ${day.config}"
}

