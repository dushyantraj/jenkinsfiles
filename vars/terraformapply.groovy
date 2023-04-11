def call()
{
  dir('/var/lib/jenkins/workspace/part1ECRcreateandpush/ECRfromterraform') {
                    sh 'terraform apply --auto-approve'
    }
}
