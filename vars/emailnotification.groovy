def email(String emailid) {
 mail bcc: '', body: 'Succesfully Deploy Webserver on Slave', cc: '', from: '', replyTo: '', subject: 'Jenkins mail', to: "${emailid}"
}
