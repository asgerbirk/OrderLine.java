# SimpleJPAwithREST
Demonstrates creation of a simple JPA Order, OrderLine and Product relationship, exposed as REST endpoints.

## Step 1: Create a Spring Boot Project
Create a simple Spring Boot project, we'll add the required dependencies, in the next step.

- Select ***File/New Project*** in the IntelliJ menu.
- Select Spring Initializer.
> For simplicity, please use the values in the dialog below (it's ok if you want to save it to another location).
- Click Next.

![image](https://user-images.githubusercontent.com/8819076/187045753-d8177225-8f3c-4e4e-8fd6-af4d7068f9ba.png)

## Step 2: Select dependencies

![image](https://user-images.githubusercontent.com/8819076/187045853-a906fd4e-7f89-4dad-9d3d-412ddae86083.png)

Select the following modules: 
- Lombok (category: Developer Tools)
- Spring Web (category: Web)
- Spring Data JPA (category: SQL)
- H2 Database (category: SQL)
- Validation (category: I/O)

## Step 3: Configuring the pom.xml file.
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
## Step 4: Configurering H2 Memory Database
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
## Step 5: Copy/Paste the classes
Now, for simplicity, for each class,
- Go to the link.
- Click Raw (to see the raw code text).
- Copy the code.
- Place youself on the java folder, in the project, and paste the code.
- Go to the first line, in the new java file.
- Click ALT-ENTER, and select Move, to move the file into the correct sub package.

### Add Order classes
- [Order.java](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/model/Order.java)
- [OrderRepository](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/model/OrderRepository.java)
- [OrderService](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/service/OrderService.java)
- [OrderController](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/order/controller/OrderController.java)

### Add OrderLine classes
- [OrderLine.java](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/model/OrderLine.java)
- [OrderLineRepository](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/model/OrderLineRepository.java)
- [OrderLineService](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/service/OrderLineService.java)
- [OrderLineController](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/orderline/controller/OrderLineController.java)

### Add Product classes
- [Product.java](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/product/model/Product.java)
- [ProductRepository](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/product/model/ProductRepository.java)
- [ProductService](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/product/service/ProductService.java)
- [ProductController](https://github.com/RonniKahalani/SimpleJPAwithREST/blob/master/src/main/java/com/example/demo/product/controller/ProductController.java)

