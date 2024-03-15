# Awesome API Server(Spring Boot)

## Installation
./src/resources/application.properties_example 파일을 복사하여 같은 위치에 application.properties 파일을 생성한다.   
각 항목에 해당하는 값을 서버 관리자에게 문의하여 입력한다.   
<pre>
<code>
server.port={SERVER_PORT}
server.charset=UTF-8

spring.datasource.driver-class-name=org.mariadb.jdbc.Driver
spring.datasource.url=jdbc:mariadb://{DBSERVER_HOST}:{PORT}/{DBNAME}?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC
spring.datasource.username={USERNAME}
spring.datasource.password={PASSWORD}
</code>
</pre>

## Running
<pre>
<code>
$ git pull origin main
$ gradlew bootRun
</code>
</pre>

## Build and Run
<pre>
<code>
$ git pull origin main
$ gradlew bootJar
$ java -jar ./build/libs/awesome-0.0.1-SNAPSHOT.jar
</code>
</pre>
