mkdir /usr/local/tomcat/webapps/myApp/
rm -rf /usr/local/tomcat/webapps/myApp/*
cp -r myApp/* /usr/local/tomcat/webapps/myApp/
javac -cp .:/usr/local/tomcat/lib/servlet-api.jar -d /usr/local/tomcat/webapps/myApp/WEB-INF/classes/ myApp/src/*.java
catalina.sh run