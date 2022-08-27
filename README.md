# SimpleJPAwithREST
Demonstrates creation of a simple JPA Order, OrderLine and Product relationship, exposed as REST endpoints.

## Step 1: Create a Spring Boot Project
Create a simple Spring Boot project, we'll add the required dependencies, in the next step.

- Select ***File/New Project*** in the IntelliJ menu.
- Select Spring Initializer

![image](https://user-images.githubusercontent.com/8819076/187045753-d8177225-8f3c-4e4e-8fd6-af4d7068f9ba.png)


- Select Spring Web
- Select Spring Data JPA
- Select Lombok

![image](https://user-images.githubusercontent.com/8819076/187045853-a906fd4e-7f89-4dad-9d3d-412ddae86083.png)



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
- [Order.java](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/model/OrderLine.java)
- [OrderRepository](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/model/OrderRepository.java)
- [OrderService](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/service/OrderService.java)
- [OrderController](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/controller/OrderController.java)

### Add OrderLine classes
- [OrderLine.java](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/model/OrderLine.java)
- [OrderLineRepository](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/model/OrderlineRepository.java)
- [OrderLineService](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/service/OrderLineService.java)
- [OrderLineController](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/controller/OrderLineController.java)

### Add Product classes
- [Product.java](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/product/model/Product.java)
- [ProductRepository](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/product/model/ProductRepository.java)
- [ProductService](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/product/service/ProductService.java)
- [ProductController](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/product/controller/ProductController.java)

