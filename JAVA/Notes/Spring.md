<!-- 6 mar -->

# What is Spring ?

* It is a Java popular framework used to build Enterprise Application, Web Application and MicroServices Application.
* It provides readymade tools and infrastructure so developer don't have to write everything from scratch.

# Why Spring framework was created ?

* Before Spring most Java Applications work build on JavaEE(Enterprise Ediition) Technologies and these technologies had problems such as:
  i) Very Complex Configuration
  ii) Lots of Boiler plate code
  iii) It was very difficult to fetch the application and it require heavy application server.
* To solve these issues Rod Johnson created Spring Framework in 2003.
* Spring Framework solve multiple problems such as :
  i) Dependency Management(DI)
  ii) Inversion of Control (IOC)
  iii) Simplifies Web Development with the help of Spring MVC(Model-View-Controller)
  iV) Database Integration with the help of Spring JDBC and Spring Data JPA.
  V) MicroServices Development with the help of Spring Cloud and SpringBoot.
  which modern system used to create java web application or mobile application.

# Key Features of Spring Framework:

1. DI
2. IOC
3. Aspect Oriented Programming (AOP)
4. Transaction Management
5. Web MVC Framework
6. Easy Testing

# Spring Core: Spring core technology is a fundamental concept of Spring ecosystem.

* It provides feature like: DI, IOC, Bean Management and Application context which simplify Java Enterprise Development.
  _Main Components of Spring Core Technologies_

1. Core Container: It is a heart of Spring framework which manages the lifecycle and configuration of application object.
   * DI is the one of the core container which inject one object to another object with the help of xml and annotation configuration.
2. Spring IOC Container: It is a core concept of Spring which manages the Java Object creation and Dependency Management.
   * The main responsibilies of IOC is creating Java Objects, Injecting dependencies, managing Java Object Lifecycle, Configuring Java Objects, and destroying Java Objects when application stops.
   * IOC reads configuration metadata from xml configuration file, Java configuration classes or Java Annotations.

_Types of IOC Container in Spring:_ There are two main types: 1) BeanFactory        2) ApplicationContext

1. BeanFactory(I): It is an interface which is present in springorg package and it is a basic IOC container which supports lazy initialization, beans(Object creation) \[bean=object], created only when request.

* It is rarely used directly in modern Spring application.

2. ApplicationContext(I): It is a Child interface of BeanFactory and it is the advanced IOC container which is most commonly used in modern application. It is built on the top of BeanFactory .

* It has some extra features such as: 1) Event Handling 2) AOP Integration 3) Easier Configuration
  4\) It supports both xml and annotation configuration.
* It has some common implementation classes such as: 1) ClassPathXmlApplicationContext
  2\) FileSystemXmlApplicationContext
  3\) AnnotationConfigApplicationContext
  4\) WebApplicationContext
  _Advantages of_

<!-- 7/3/26 -->

<!-- Source: https://mvnrepository.com/artifact/org.springframework/spring-web -->

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-web</artifactId>
    <version>7.0.3</version>
    <scope>compile</scope>
</dependency>

<!-- Source: https://mvnrepository.com/artifact/org.springframework/spring-context -->

<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>7.0.3</version>
    <scope>compile</scope>
</dependency>

<!-- myspring.xml file |spring core xml configuration|-->

<?xml version="1.0" encoding="UTF-8"?>

<beans xmlns="http://www.springframework.org/schema/beans"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xmlns:util="http://www.springframework.org/schema/util" xsi:schemaLocation="
     http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
     http://www.springframework.org/schema/util http://www.springframework.org/schema/util/spring-util.xsd"> <!-- bean definitions here -->

</beans>

# Full Flow of Program

```
Program Starts
    ↓
Spring Container loads myspring.xml
    ↓
Spring creates Employee bean
    ↓
getBean("emp") returns Employee object
    ↓
Print Employee ID
    ↓
Create Laptop object manually
    ↓
Set Laptop to Employee
    ↓
Print Laptop Name
    ↓
Close Spring Container
```

# Dependency Injection(association): it is a design pattern where an object receives its dependencies from an external sources instead of creating them itself.

* In simple words, mmer dont create object inside class but they provide configuration to take the object from outside and this is have we used in spring framework and springboot.
* There are three types of Dependency Injection: i) Constructor DI,     ii) Field DI      iii) setter() dependency injection

1. Constructor Injection: It is one of the DI where the required dependency of a class are provided to its constructor(parameterized) when the object is created. It is commonly used in spring framework ecosystem.
   \- Constructor Injection means passing dependent object through the constructor of a class.
   \- For ex ->
   class Employee{
   Laptop laptop;
   public Employee(Laptop laptop){
   this.laptop = laptop;
   }
   }
   class Laptop{}
   \- Constructor injection can be achieved with the help of xml and annotation configuration.
   \- XML configuration Ex ->
     <!-- bean definitions here -->
   <bean id="Laptop" class="com.tcs.spring_core_technology_examples.beans.Laptop"></bean> <bean id = "emp" class="com.tcs.spring_core_technology_examples.beans.Employee"> <constructor-arg index="0" value="99000"></constructor-arg> <constructor-arg index="1" ref="Laptop"></constructor-arg> </bean>

```
- With the help of xml configuration, String will create Laptop object and pass into Employee object and then IOC container will create the object of Employee class.
```

2. Setter Injection: It is a type of DI where the required objects are provided through the setter methods.

   * In simple words, setter injection menas passing dependent object through the setter method of a class. So spring creates the object and  required dependencies through the setter methods.
   * For Ex ->
     class Employee{
     Laptop laptop;
     public void setLaptop(Laptop laptop){      // setter of Laptop class
     this.laptop = laptop ;
     }
     }
     class Laptop{

     }

   Note: BeanCreationException : it comes because of wrong xml configuration

# Spring Core Technology Annotations:

```
1) @Component: This is the stereotype annotation which tells Spring IOC container that class is a Spring bean(Java object) and it should be automatically detected during component scanning.
- It is equivalent to : <bean id="Laptop1" class="com.tcs.spring_core_technology_examples.beans.Laptop"></bean>
- It is a class level annotation.
- If it is used without annotated then it gives NoSuchBeanDefinitionException.

2) @Autowired: It is a reference variable , constructor, setter method level annotation.
- It is equivalent to : <property name="Laptop" ref="Laptop1"></property>
- Autowired is used for DI which is automatically injects the required bean with the help of variable, constructor, setter injection.

3) @Configuration: It is a class Level annotation which indicates that a class contains spring bean definitions.
- It replaces XML configuration.

4) @Bean: It is method level annotation which is used inside configuration class. the method which is annotated with @Bean executes before main execution. Spring will register this method and return object as a bean automatically.

5) @ComponentScan: It is a class level annotation which is used for component scanning and declare the package as a base package in a spring framework. (It internally create @Configuration in Spring core but it is good to written it).

6) @Value: This is a variable, constructor, setter method level annotation. It is used to provide the default value to a specific variable.
```

<!-- 10/3/26 -->

# SpringBoot: It is a java framework which is built on top of spring framework that simplifies the development of java web application.

* It removes most of the configuration which was used in traditional spring framework.
* It is widely used to built REST API's, MicroServices and web appllications.

# Why SpringBoot was created ?

* Before SpringBoot, Developers used spring framework but it used large XML configuration, External Application Server(like Apache Tomcat), Complex dependency set up but with the help of SpringBoot we can achieve Auto-Configuration, it provided embedded server, production ready features, and removes 100% XML Configuration, it also provides starter dependencies that's why it was created.

# SpringBoot Architecture:

* Internally SpringBoot used Servlet API to perform (request, response) and it uses multiple Component or Application to perform various tasks such as Spring Core, Spring MVC, Spring Data JPA, Spring Security, Embedded Server, Spring Dev Tool, Spring Actuator, Spring WebFlux, Spring Cloud.

# Different types of Project Layers to create and design REST API's(SpringBoot Application):

```
    Controller Layer
            |
    Service Layer
            |
    Repository Layer
            |
    DataBase Layer
            |
    Response Layer
            |
    Exception Layer..... etc
```

# StereoTypes : They are those annotation which create Java Components to Spring annotation.

# SpringBoot Annotations:

1. @SpringBootApplication:  It is a Class-Level Annotation which is a main annotation of SpringBoot. It is a Combination of three more annotation.
   i) @Configuration   : removes XML Configuration
   ii) @EnableAutoConfiguration    :   Automatically Enabled the Configuration.
   iii) @ComponentScan     :

2. @RestController:  It is a Class Level Annotation which we write at the top of Component class to create REST API's endpoints.

3. @Component:  It is a class level annotation we write this at the of Simple Java class to make that class of a Spring Component. It has multiple Sub-Annotation such as:\
   i) @Service:  It is also a class level which we write at the top of Service and Business Logic class to make that class of Spring IOC Component.
   ii) Repository: It also a class level annotation which we write at the top of repository layer to enable all the database related exception.

# What is REST API ?

* REST stands for Representational State Transfer API.
* It is a way or design for two or more application to communicate over Http by using standard web methods.
* In java, we can create REST API with the help of SpringBoot and Spring MVC.
* For ex -> suppose you build an E-commerce web application we have created frontend web app by using react, and mobile app by using kotlin, server-side we have created with SpringBoot.

# REST API HTTP Methods and Annotations:

1. GET -> @GetMapping : It is a method level annotation which is used to take the Get request.
   Ex->  @GetMapping(value="/getId/{id}")

2. POST -> @PostMapping: It is used to send the Post request from client to server to save the data inside the database and it is also a method level annotation.
   Ex-> @PostMapping(value="/saveEmployee")

3. PUT -> @PutMapping: It is used to send the update request from client to server to update the data inside db.
   Ex -> @PutMapping(value="/updateEmployee")

4. DELETE -> @DeleteMapping: It is used to send the delete request from client to server to delete the data.
   Ex -> @DeleteMapping(value = "/deleteEmployee/{id}")

5. PATCH -> It is used for partial update but PutMapping internally it is calls automatically.

6. @RequestMapping(value="/url"): It is a method level annotation and it can handle all kind of request. But we use RequestMapping to avoid the conflicts between base url(to avoid ambiguity problem).

# Steps to create SpringBoot project:

1 -> go to spring initializer and generate project
2 -> download generated project and extract in sts eclipse workspace
3 -> open project in eclipse and update it.

<!-- 11/3/26 -->

# What is JSON ?

* It stands for JavaScript Object Notation. It is a lightweight data interchange format which is used to extend data from client and server.
* For spring developer JSON is one of the most important data format because it is the default format used by REST API.
* It is a user readable, language independent, we used it based on key:value pair.
  Note: In SpringBoot, JSON is automatically handlded by Jackson library.

_Syntax to create a JSON:_
{
"key":"Value",
"key":"Value",
}

_JSON Structure:_ It has two main structure :-
1\) Single Json value(Single object):
{
"key":"value"
}

```
2) Multi Json value(Multiple object of array):
    [
        {
            "key":"value"
        },
        {
            "key":"value"
        }
    ]
```

_How to Convert Java object to Json and Json to java object:_

* With the help of SpringBoot it can be converted automatically.
* With the help of Jackson object mapper.
* Java to JSON known as Serialization and JSON to Java known as Deserialization.

For Ex:
class Employee{     // Java
int id;
String name;
String email;
String password;
}        ^
|
{
"id":123,       // Json
"name":"arun",
"email":"<arun@gmail.com>
}

_Important JACKSON Annotation:_ Jackson Library provide multiple annotation to control out json mapped to java object.

1. @JsonProperty: It is used to map Json field name to java field name.
   For Ex -> @JsonProperty("emp-name)
2. @JsonIgnore: It ignore java field during serialization during the response.
   Ex -> @JsonIgnore
   String password;
3. @JsonFormats: It is used for date formatting such as , DOB,DOJ, DOD.
   Ex -> @JsonFormat("mm-dd-yyyy)
   LocalDate dob;

_JSON validation in SpringBoot:_ SpringBoot uses the jakarta api to validate the Json data.
_Validation Annotation:_

1. @NotNull
   Ex -> @NotNull
   String name;
2. @Email
   Ex -> @Email
   String email;
3. @Size(min=0, max=10)

_Nested JSON_: Writing a Json inside a Json is known as Nested Json. We use Nested Json in java relationship mapping.
Note:Relationship is Has-A which is of 2 types (unidirectional, bidirectional) which includes 4 types : 1:1, 1:N, N:1, M:N.
For Ex -> Suppose we have,
class Person{
int id;
Strimh name;
Car car;
}
class Car{
int id;
String name;
String type;
}

```
    {                   // Json of Person
        "id":123456,
        "name":"sumit",
        "car":{
            "id":123,
            "name":"skoda",
            "type":"CNG"
            
        }
    }


    {                       // Json of Car
        "id":123,
        "name":"Nano",
        "type":"Petrol"
    }
```

<!-- 12/3/26 -->

# Read about swagger UI(with its annotations), Open API.

# Swagger UI: It is used as a middleware for between the backend and frontend developer.

```
For ex -> Let suppose the backend developer create the REST API and Frontend developer creates the frontend but he does not know the backend variables and return types of methods.
So here the swagger api helps to create the documentation for backend api that is very useful for frintend developer and for tester also to understand how backend api was created.
```

<!-- 13/3/26 -->

# Spring Data JPA

* SpringBoot JPA is a module of Spring framework that makes easier to work with database.
* It reduce the amount of boiler plate code required for database operation.
* It works on the top of JPA which is a standard for mapping java objects to relational databases.
* Without Spring Data JPA repetetive code by using hibernate and jpa.
* Spring data jpa mainly works with three layers:
  1. Entity: Java class mapped to a database table .
  2. Repository: It is aka Data Access Layer. Instead of writing DAO code we create an Interface that is known as Repository (I).
  3. Service: Here we inject the Repository and used for database operations.
  4. : Here we create REST API endpoints to take the request from client to server.

# Key Features of Spring Data JPA:

1. Automatic CRUD operation: Spring Data JPA provided different type of interfaces which has inbuilt methods to perform CRUD operation automatically.
2. Query methods: Spring can generate query from methods name. So, no need to write select query from programmer side.
3. Custom Query: If developer wants to write query against some requirement they can use JPQL or SQL Native Query inside Repository(I).
4. Pagination and Sorting: Spring Data JPA supports pagination and sorting so developers no need to do it manually.
5. TransactionManagement: It is integrated with SpringBoot Transaction System by @Transactional annotation.

# Important Interfaces of Spring Data JPA:

* To use Spring Data JPA Interfaces we have to add its dependency inside pom.xml file.
* We can use mongodb atlas with springboot application but with the help of spring data jpa.
  1. CrudRepository\<T, ID>: It is a simple interface of the Spring Data JPA which is used to perform simple operation such as Insert, Update, Delete, Display. It has multiple methods save(S entity), saveAll(Iterable<S> entities), findById(Id id), existById(ID id), findAll(), findAllById(), count(), deleteById(Id id), delete(), deleteAll(), deleteAllById() .

  2. PagingAndSortingRepository\<T, ID>: It is used to achieve sorting such as ascending and descending order with the help of findAll(Sort sort) method. and it also use for pagination to display the chunks of data pagewise with the help of findAll() .

  3. JpaRepository\<T, ID>: It is a child interface of all the spring data JPA interfaces which is used to perform simple crud operation, pagination, sorting. It has dofferent types of method such as flush(), saveAndFlush(), saveAllAndFlush(), deleteAllInBatch(), deleteAllByIdInBatch(), findAll() .

Note: In Spring Data JPA interfaces T belongs to Entity type Object name(Entity Classname) and ID belongs to primary key data Type wrapper className

<!-- 22 -->

-> If we want to check tomcat server is open or not so we just searxh on browser: localhost:8080 . It shows the tomcat page.
-> The two server cannot run on same port number.
-> Stop server: search services on window search bar and then stop the service of server.
-> For checking server is stop or not check again localhost:8080 then it shows 404.
-> If our local server is on then spring inbuilt server can not run. for this we have to stop our local tomacat server.

<!-- 11 mar -->

springmain -> CustomerController -> EmployeeController -> Postman API
\#BeanCreationException, Ambiguous mapping,  1
@RequestMapping for providing base url and @GetMapping for providing last url path
-> we can access only GetRequest from browser if we want to access DeleteRequest, PostRequest or PutRequest then we have to use Postman API.
-> UpdateRequest and DeleteRequest can access from browser but parameter
-> 405 method not allowed (if call post instead og get request)
-> 404 status Not found code comes when url not found
-> 200 Ok when everything is fine
-> 500 Internal server error
-> patch means partial update and put means full update

<!-- 12 mar -->

-> @RequestBody used json convert to java
-> copy spring devtooldependency from spring initializer website so everytime we changes on code then server restart automatically
-> @PathVariable used when pass data through url
-> ResponseEntity(C) used to show response while fetching. It have one ResponseEntity.ok().
-> Cross horizon (we have instead of Cors in springboot).
-> SwaggerUI works same as Postman API . copy dependency from maven dependency
i) copy swagger ui dependency on pom.xml
ii) check localhost:8183/swagger-ui/index.html -> it opens ui which shows our project all endpoints.

<!-- 23 mar -->

@ComponentScan,\
Optional interface: used for NullPointerException.  isPresent(),   isEmpty(),    get().

# How to validate Json data

* mandatorty to jakarta dependency
*

-> MethodArgumentNotValidException  : @NotFound validation'
-> @Validated

<!-- 25 mar -->

pagination and sorting

<!-- 26 mar -->

# Mapping in SpringBooot :

-> Every entity have mandatory to have separate extends JpaRepository(I).
-> we have to create dto in between and applying validatiin .
-> First we have to pass Parent Json

# Spring Security:

-> It is a part of Spring Ecosystem which is a powerful Authentication and Authorization framework for Java application.
-> It protects application from common security threats and it controls who can access your application.
-> Key Features of Spring Security:\
1\) Authentication(Use for Login System)
2\) Authorization(Use for Role-based Access)
3\) Protection against attacks such as CSRF, XSS, Session, FixedSession.
4\) Password encoding(Encrypt and Decrypt the password)
5\) Outh2 and JWT.

# Authentication:

It is a process verify  the identity of a user or a system at the time of user login.
-> It supports multi Authentication mechanism :
1\) Form Based Login
2\) Http Basic
3\) LDAP/OUTH2/JWT .
-> It can integrate with custom authentication provider.

# Authorization:

-> It controls access to resources based on roles such as:
\- user, admin, productowner
-> It supports method level security using annotations such as :
@PreAuthorize,      @PostAuthorize,      @Secured

# Password Management:

-> Spring security securely stores and manages passwords in database and provides password encoding strategies such as:
1\) BCryptPasswordEncoder
2\) ScryptPasswordEncoder

-> It helps to prevent common attacks such as: Password Leaks and Brute Force Attack.

# Protection against common threats:

-> Spring security provide built in support for security attacks Mitigation such as:
CSRF,   XSS,   Session Fixation,  ClickJaking etc.

Note: Spring security seamless integration with spring-boot,  spring mvc,  spring data jpa,  and spring oauth.
Spring security simplifies securing REST API\`s, web applications and Microservices.

# Customizable Spring Security Filter:

Spring security uses a Filter chain to handle security for incoming request where developers can add, remove, or customize filters as needed.

# What is CSRF ?

-> It stands for Cross-site-Request-forgery. It is a type of web security attack where malecious website tricks a user browser into performing an unwanted action from a trusted site where the user is already authenticated.

# How CSRF works ?

-> Step 1 -> User Login sbi.com and receive the session
-> Step 2 -> User visits a malecious website abc.com
-> Step 3 -> The malecious website contains a hidden request (to withdrawal the amount) and it will hit and send the request to sbi.com.
-> Step 4 -> sbi.com thinks the request is original and it will transfer the amount or change the password or change the bank details.

# Characteristics of CSRF:

-> User must be logged in and it uses cookies or tokens automatically with the help of cookies and session it will tricks the browser.

# How to prevent CSRF ?

* Spring security provides builtin CSRF protection such as: CSRF Tokens, Avoid get request or state changes, same site cookies .

# How Spring security handles CSRF:

* It is enabled default by web application but for REST API we have to disabled it with automatically generates CSRF Tokens and validate them.
* It works with Forms and Ajax requests.

# JsonManagedReference : It is a jackson annotation which is used to handle infinite recursion when you have one-to-many bi-directional relationship .

* We used this annotation in owning side relationship at the top of owning reference variable.

# JsonBackReference: It is used to ignore Serialization and prevent infinite looping. we write.
