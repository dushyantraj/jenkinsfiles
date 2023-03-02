def call()
{
   sh ' echo "Hello world" > /var/www/html/index.html'
   sh 'scp -i ~/.ssh/id_rsa /var/www/html/index.html  ubuntu@13.233.123.183:/var/www/html/index.html'
}
