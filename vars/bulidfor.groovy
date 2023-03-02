def call(String ip)
{
   sh ' echo "Hello world" > /var/www/html/index.html'
   sh 'scp -i ~/.ssh/id_rsa /var/www/html/index.html  ubuntu@"${ip}":/var/www/html/index.html'
}
