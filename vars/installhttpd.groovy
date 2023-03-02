def call() {
    sh 'sudo apt-get update'
    sh 'sudo apt-get -y install apache2'
}
