# SimpleJPAwithREST
Demonstrates creation of a simple JPA Order, OrderLine and Product relationship, exposed as REST endpoints.

## Step 1: Create a Spring Boot Project
Create a simple Spring Boot project, we'll add the required dependencies, in the next step.

## Step 2: Configuring the pom.xml file.
Make sure you have all these dependencies;
```xml
       <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>2.1.214</version>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
            <optional>true</optional>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
```
## Configurering H2 Memory Database
Set the ***resources/application.properties*** file to

```properties
logging.level.org.springframework.jdbc.datasource.init.ScriptUtils=debug
spring.jpa.hibernate.ddl-auto=create-drop

# Enabling H2 Console
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:mem:mydb
spring.data.jpa.repositories.bootstrap-mode=default

spring.datasource.hikari.jdbc-url=jdbc:h2:mem:mydb
spring.datasource.hikari.username=sa
spring.datasource.hikari.password=
spring.jpa.show-sql=true
spring.jpa.hibernate.use-new-id-generator-mappings=true
```

### Add Order classes
[Order](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/model/Order.java)
[OrderRepository](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/model/OrderRepository.java)
[OrderService](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/service/OrderService.java)
[OrderController](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/controller/OrderController.java)

### Add OrderLine classes

### Add Product classes

