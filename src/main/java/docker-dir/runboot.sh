sleep 100
java -Djava.security.egd=file:/dev/./urandom -jar -Xmx4g -Xms4g -Xmn2g -XX:PermSize=128M -XX:MaxNewSize=512m -XX:MaxPermSize=512m /app/app.jar