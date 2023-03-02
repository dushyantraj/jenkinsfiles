def call() {
    sh 'sudo apt-get update -y'
    sh 'sudo apt-get -y install apache2'
    sh 'sudo  systemctl start apache2'
    sh 'sudo  systemctl enable apache2'
}
