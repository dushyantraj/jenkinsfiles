def move(String ip)
{
   sh "scp -i ~/.ssh/id_rsa /var/www/html/index.html  ubuntu@${ip}:/var/www/html/index.html"
}
