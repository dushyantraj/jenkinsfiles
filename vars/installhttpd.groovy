def call(String name) {
    sh 'sudo apt-get update -y'
    sh "sudo apt-get -y install ${name}"
    sh "sudo  systemctl start ${name}"
    sh "sudo  systemctl enable ${name}"
}
