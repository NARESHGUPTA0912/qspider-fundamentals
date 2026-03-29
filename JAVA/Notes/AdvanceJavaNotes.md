<!-- 23-12-25 -->
# What is JAR file ?
* A jar file stand for Java Archieve file which is used in Java Development to bundle java .class files into a single compressed file.
* It is a similar to a zip file but designed specifically for java programs.
* Jar file is used to store compiled java classes, include resources like images, sounds, text files, it may store d/f libraries to make java programs easy to distribute and run.
* It is used to aggregate many java files, associated with metadata(in a manifest .mf files & resources(images, sound, configuration files)) into a single package.
  _Naming Convention to create a package_
  Syntax -> domainName.companyName.clientName.projectName (This is also known as base package).
  Ex -> com.tcs.sbi.loans

<!-- 24/12/25 -->
# How to use jar file in java project:
* Step-1 -> _Creation of jar file_ : Right click on package - go on export and then we have to search jar - go next then browse location then finish(jar created).
* Step-2 -> _For using jar file_ : Right click on package - go to property - go to buildpath - order and export - library - classpath then add jar file then select jar and apply and close. After this Referenced libraries shows the jar file.

* Note: If we use another package then we have to create jar file again & again that\`s why we use the concept of MicroServices Architecture.

<!--– MDN websites for reading notes -->
Application Server: 1) Tomcat       2) WebSphere

<!-- 26/12/25 -->
// HW -> Java Exception Hierarchy -> checked exception -> Unchecked Exception-> try, catch, finally , throw, throws.
-> Create 2 java projects : 1) Qspider        2) Jspider
-> Collection -> Generic -> List(I) -> ArrayList(C).

<!-- 29/12/26 -->
// Exception Hierarchy
//       MVN Repository -> mysqlconnector -> version 8.4
```
Connection(I)     // its in jdk java.sql package
    ^
    |  implements
JdbcConnection (Abstract Class)     // its in com.mysql.cj.jdbc 
    ^
    | extends
Connection (class)      // its in com.mysql.cj.jdbc
```
<!-- 30-12-25 -->
# API : Application Pogramming Interface is a collection of classes and interfaces and it helps in communication with one application to another application.
_Types of API_ :
1. Web API : It allows different applications & websites to interact over internet.
2. Library/Framework API : it is used to interact with pre-built libraries or tools.
3. Operating System API : (System API use)

# JDBC: It stands for Java Database Connectivity for connection.
* It is an API which is used to connect java application with any relational databases with the help of its classes and interfaces.
* Note: All the classes and interfaces of JDBC API is present in java.sql package.

_Classes and Interfaces of JDBC API_ : JDBC provides standard interfaces and classes for connecting databases, executing sql queries and processing results.
1. DriverManager : This is a class present in java.sql package and it is use to establish a connection to a database with the help of
   Connection(class)[static method]: getConnection(String url, String user, String pass): Connection(return type).
* It also manages the JDBC Driver that are loaded with the help of registerDriver(Driver d):(Driver is in com.mysql.cj.jdbc).

2. Connection interface : It is an interface to open connection between java application and database.
* It allows Java Developer to manage the Connection, create statement, handle transaction, and close the connection once operation is completed.

_Methods of Connection interface_:
1. createStatement(): Statement(I)
   This method create a Statement object for executing static SQL Queries.
   Connection conn = DriverManager.getConnection(url,  user,  pass);
   Statement stat = conn.createStatement();

2. prepareStatement(String query): PreparedStatement(I)
   -> It creates the object of PreparedStatement for executing Dynamic/Parameterized SQL Queries.

3. setAutoCommit(boolean b) : Boolean
   This is used to set the Commit true or false. (By default is false).

4. close(); After all operations, it is mandatory to closed the open connection.
------------------------------------------------------------------------------------------------------------------------
<!-- 31/12/25 -->
Q) What is Driver Software ?
* Driver Software in JDBC is the piece of software that lets a java program talk to a specific database such as MySql, Oracle, PostgreSql etc.
* Driver Software is a translator which translates java instruction into database native language(SQL Language).

Q) What is a JDBC Driver ?
* It is a java library(.jar file) that converts JDBC method call from java into database specific commands and it returns the result back to java in a format of java understandable.
* Note : Withot a Driver, java app cannot connect to database. As we are using MySql database, so we have to use JDBC driver for MySql.
  For MySql database, the driver name is : mysql-connector/j version-9.0.0
<!-- visit MVN Repository -> mysqlconnector -> click on 9.0.0 version then click on jarfile -> setLocation-> save -> install. -->

Q) How JDBC Driver works ?
* Step(I) -> When your java programs getConnection() calls then
* Step(II) -> mysql-jdbc driver converts all method call statement into mysql protocol, and sends them to the mysql database.
* Step(III) -> MySql process the query and sends result back to the java program.

Q) Why Software Driver is important:

_JDBC Connection step_:
<!-- Load Driver -> Create URL -> getConnection() -> CreateStatement -> ExecuteQuery -> Process Result -> Close connection.  -->

* Step(I) -> Load/Register Driver class from Driver Software.
  import java.sql.\*;
  Class.forName("com.mysql.cj.jdbc.Driver");

* Step(II) -> Create Connection with database by url, user, and password.
  String url = "jdbc:mysql://localhost:3306/jdbc-a14";
  String user = "root";
  String password = "abc123";
  Connection conn = DriverManager.getConnection(url,user,password)

* Step(III) -> Create Statement to send sql query to db. We can Create statement in 3ways: Statement/PreparedStatement/CallableStatement(I).
  1\) By using Statement (I) : It is used for static query.
  Statement s = conn.createStatement();
  2\) By using PreparedStatement(I) : It is used for dynamic query.
  String query = "SELECT \* from students";
  PreparedStatement ps = conn.prepareStatement(query); <!-- String query = "SELECT * from students where id = ?";      we use placeholder instead of values
              ps.setInt(1,1); -->
  3\) CallableStatement : It is used to call stored procedures and stored functions in a db.
  CallableStatement cs = conn.prepareCall("{call getStudent(?)}"); <!-- getStudent() is a db function -->

* Step(IV) -> Execute Sql Queries: Depending on the SQL statement use one of the following method :
  1\) execute() : for DDL.
  2\) executeUpdate() : for DML.
  3\) executeQuery() : for DQL.

* Step(V) -> Process the Result : If the query return a ResultSet(I) iterate it through:
  ResultSet next():boolean -> It is use to move the cursor from current position to next position and check data availability if data present return true else false.
  Ex->   ResultSet rs = ps.executeQuery();
  while (rs.next()){\
  System.out.println(rs.getInt("id"));\
  }

* Step(VI) -> closed the open resources: Always close resources to prevent memory leaks.
  1\) rs.close();      2) ps.close();      conn.close();

<!-- 2-1-26 --> 
# Two types/ways of create project : 1) GRADLE      2) MAVEN

# Apache maven: It is a build automation and project management tool, mainly used for java projects.
- Maven helps java developers to build, test and manage java libraries for software development automatically from maven central repository.

* Why Developers Use Maven: 1) No need to manually download libraries.
  2\) Easy integration with IDE's(eclipse, VSCode).
  3\) It works well with CI/CD tools.

* How to create maven project by Eclipse IDE:
  Open eclipse - file - New - other - search(maven projects) - click\&Next - Next - Catalog: All catalog - filter - org.apache.maven - scroll - maven-architect-type - webapp - Click & Next. -> GroupId: com.hcl(domainName) - ArtifactId: jdbc-servlet-crud-operation(projectName) - finish.
  Check Console Window Downloading of files -> After full download - inlast type y(means yes) and Enter(it shows Build Success).

* After maven project creation:
  Go-on-project -> rightclick -> properties -> java build path -> order & export -> check all box -> Apply & close.
* Java Resources -> JRE System Library: If JDK version change -> Project - Rightclick - maven - update - force checkbox - Done.
* open pom.xml -> check dependencies (JDK 17 or greater version)

# Maven setup Commands:
* Browser -> Apache maven document - click - scroll -> binary zip archive -> location - folder - apachemaven - rightclick - extract all - browsechoose folder (apachemaven) - extract - openfile - bin - path copy - _Setup Path Apache Maven_ -> goto env. variable -> environment variable -> user variable -> path - edit - save - ok - system variable - edit - path - new - paste - save - ok.
* cmd -> mvn - enter - if show build failure -> successfully set in environment variable.
# Apache Maven Commands:
1. MVN clean install:
   clean -> it will remove target folder which contain all .class file & jar files.
   install -> it will compiles project again & generate .class files .
2. MVN clean package: (for spring framework)
   It is use to generate jar file inside target folder of current project.

*Command used in two ways:*
1) CMD    2) Terminal(eclipse)

# How to delete .metadata folder:
1. close eclipse IDE -> workspace -> delete .metadata folder.
2. After deletion open eclipse again with workspace and open existing project by clicking on file -> open project from file system -> click directory -> go to workspace and select specific project -> click on select folder -> finish.

Second way: open existing project
file -> import -> general -> select existing project into workspace -> click & next -> browse -> go to workspace -> specific project -> finish.
-----------------------------------------------------------------------------------------------------------------------------------------------
<!-- 5/1/26 -->
HW - ClassNotFoundException, SQLException, CommunicationException.
Note: mysql-connector can directly download by using xml code in pom.xml file.

Q) What is pom.xml ?
# StackOverFlow : It is one of the largest website for developers which is used for solution of exceptions.

1. ClassNotFoundException:
   -> Occur when JDBC driver jar is missing from classpath or wrong driver name used.
   -> To fix this issue, add the proper JDBC driver to classpath and use the correct driver name.

2. SQLException:
   -> Occur when it found wrong credentials(Connection details), invalid SQL syntax or database not running.
   -> To fix this, check SQL syntax, Database Connection details and server status.

3. CommunicationException:  communication link failure
   -> Occur when Database server down, wrong host or portno, network and connectivity issue.
   -> To fix this, start database server, check URL, or port, verify network connection.

4. SQLSyntaxErrorException: occur when sql syntax is wrong.

<!-- 6/1/26 -->
Q) What are the DDL commands: Create, Alter, Drop, Truncate.
Q) What is the importance of interface type reference variable.
Q) Database Engine, SQL injections, Types of DB Engines, InnoDB.

Statement -> createStatement()
\|--> java.sql  -> we have to use this. (because Statement is in two different package.)
\|--> java.beans

# Statement: It is an interface present in java.sql package. it is used to read and execute sql static query with the help of its methods:
1) execute(String query): boolean -> It is used for DDL commands.
2) executeUpdate(String query): int -> (it return 0 or > 0). It is used to DML commands.
3) executeQuery(String query): ResultSet -> It is used for DQL command.

* Three ways to create table: 1) by using terminal   2) by using MySQL GUI   3) by using Java Code
  Note: Create table

<!-- 7/1/26 -->
Q) What are the DML commands: Insert, Update, Delete.
Note: InsertProductController.

<!-- 8/1/26 -->
Note: DisplayProductController

<!-- 9/1/26 -->
Note: DeleteProductController.

<!-- 12/1/26 -->
# PreparedStatement: It is a JDBC interface which is used to execute parameterized SQL queries.
* Instead of writing values directly in SQL Statement, we use placeholder(?) and pass the value at runtime with thr help of setters() methods.
* Ex -> Insert: Insert into Product(id, name) values(?,?);
  Update: Update Product Set name = ? where id = ? ;

Q) Why we use PreparedStatement?
1. Security: It prevents SQL injection. When user give some input to perform DML operations, it handled safely.
2. Fast Performance: Here, Sql Queries compiled once and execute many times with different values.
3. Clean Code: For Parameterized Query, No need for String Concatenation. Easy to read and maintain.

Q) Can we use Statement for Parameterized Query?
* Yes we can.

Q) D/F B/W Statement & PreparedStatement ?
1. Statement is a Parent interface and PreparedStatement is a child interface.
2. Statement is used for static query and PreparedStatement is used for dynamic query.
3. For Statement we used createStatement(query) and For PreparedStatement we used prepareStatement(query).

_Setter Methods of PreparedStatement_ : It is a child interface of Statement.
1. void setInt(int parameterIndex, int x) throws SQLException : where parameterIndex = the placeholder(?) position(start from 1) from L to R.
------------------------------------------------------------------------------------------------------------------------
<!-- 19/1/26 -->
# What is Servlet API
* It is a Server-side program that runs on a web-browser with the help of web server and handled client request by using HTTP and it sends the response to the client with the help of application or webserver.
* Servlet are used to build dynamic web application.
* Servlet is an API that is a set of Classes and Interfaces provided by Java/Jakarta EE(Enterprise Edition).
* It have multiple packages:
  1. jakarta.servlet (new version)
  2. jakarta.servlet.http (new version)
  3. javax.servlet (old version)

# Why Servlet API is needed?
* Because it will connect client-side program with server-side program by a web or application server.
* It also provides:     1) Server Communication      2) Session Management       3) Request Handling
  4\) Response Generation       5) Security Support

# Servlet Architecture : Picture
# Servlet Lifecycle: Loading -> initialize -> service -> destroy

# Responsibility of Servlet Container :
* It will automatically load all the servlet classes and create the object and then manage the lifecycle of servlet classes.
* It also handles multithreading and at the last it will destroy servlet classes.

# Servlet Interfaces & Classes:
1. Servlet(I): It is an interface present in jakarta.servlet package and it is used for request and response froomclient to server and vice-verse.
   It has some important methods :
   1\) init()
   2\) service(ServletRequest req, ServletResponse resp)
   3\) destroy()
   4\) getServletConfig()
   5\) getServletInfo()

2. GenericServlet(Abstract Class): It implements all the properties of Servlet. All methods implements by servlet interface.

3. HttpServlet(Class): It extends all the properties of GenericServlet which is used for HttpRequests.
* This is most commonly used Servlet class in Dynamic web application.
* It have multiple Http methods.
  i) doGet(HttpServletRequest req,  HttpServletResponse res): It is used for get the request from client to server.
  ii) doPost(HttpServletRequest req,  HttpServletResponse res): It is used for post request.
  iii) doPut(HttpServletRequest req,  HttpServletResponse res): It is used for update request.
  iv) doDelete(HttpServletRequest req,  HttpServletResponse res): It is used for delete request.

Q) D/F B/W Get and Post ?
Q) What is Session Management and Session Management Techniques.
Q) What is name attribute in HTML ?
Q) What is web.xml (Deployment Descriptor) ?
Q) D/F B/W web.xml and Annotation ?
Q) D/F B?W web.xml and pom.xml file ?

# Request & Response Classes and Interfaces:
1. HttpServletRequest(I): It is an interface which is used to get data from client(htmlforms/pages) to server with the help of important menthods:
   i) getParameter(String nameAttribute): String -> It is used to get data from html form to java code with the help of name Attribute.
   ii) getSession(): HttpSession -> With the help of this method we can achieve session management.

2. HttpServletResponse(I): It is an interface which is used to send response from server to client with the help of these methods:
   i) getWriter(): PrintWriter -> This is used to send response from server to client.
   ii) sendRedirect("jsp-page.jsp"); It will opens up the new JSP page.

_Advantages of Servlet API_:
1\) It is better than CGI.
2\) It is Faster and Platform Independent.
3\) It Provides security to dynamic web application with the help of session management.

<!-- 20/1/26 -->
1. workspace -> .metadata and server delete.
2. Open Eclipse -> OpenProject -> Server did not show-> addServer -> goto search -> Search server -> cleck show below no server -> select server
   -> select tomcat from file -> finish.
3. Below file show -> change port 8181/8182 then save and close.

<!-- 22/1/26 -->
Q) What is web container ?
* In Servlet API, a web container also called a Servlet Container which is a part of web server or application server and that is responsible for managing servlet classes, jsp pages and web applications.
* Web Container is a runtime environment that:
  -> Loads and manages the servlet classes
  -> It handles Http Requests and Responses.
  -> It manages the Lifecycle of servlet and web components.
  -> It provides services like: Security, Session management.
  -> It acts as a middle layer between client & Servlet classes and it also map URL to servlet classes with the help of web.xml or @WebServlet.

<!-- 23/1/26 -->
# RequestDispatcher(I):
1. forward(req, resp)
2. void include(req, resp): It include the responses in the current resources and it does not stop the current servlet class execution.
   Q) D/F B/W forward and include ?
------------------------------------------------------------------------------------------------------------------------

<!-- 29/1/26 -->
# JSP (Java/Jakarta Server Page):
* It is a server side web technology used to create dynamic webpages in java development.
* It is used to write/embedded java code inside html page to generate dynamic content.
* It is used in Monolithic design pattern.
* JSP runs on the server & it is converted into a servlet by the webcontainer(Tomcat, JBoss, WebSphere etc).

Q) Why we use JSP ?
* To Create Dynamic webpages.
* To Separate Presentation(UI) from business logic.
* It supports Java, JDBC, MVC.

# JSP Tags: JSP provides multiple tags to write java code inside html pages.
1. Scriptlet \[ <%  %> ] -> It is used to declare java variable, create java looping statement, object creation statement, method call statement etc.
   Ex -> <%    String msg = new String("Hello JSP");
   System.out.println(msg); // print on console
   out.println(msg);        // print on browser
   %>

2. Expression Tag \[ <%=  %> ] -> It is an alternate of out.println() which is used to display data or value on webbrowser. But we cannot write this tag inside scriptlet tag.
   Ex-> <h4 style="color:red;"> <%=  msg  %> </h4>

   looping statement example: <%  for(int i=0; i<=10; i++){ %> <h4 style="color:red;"> <%= i %> </h4>
   <%  }  %>
   Assignment: Print number on browser as even no in gray, odd no in red.

3. Declaration Tag: \[ <%!  %>] -> It is used to declare variable and method.
   Ex -> <%! public int addTwoNumber(int a, int b){
   return a+b;
   } %>
   <%= addTwoNumber(10,5); %>

4. Directive Tag

5. Action Tag

Q) What is Query String ?
* A query string is a part of URL that contains data (parameter) same as name attribute of JSP forms which send from the client(browser) to server(backend) by using the get method.
  _Syntax to create Query String_: URL ? anyvariable = data/value
  Ex -> delete ? id = 123

<!-- 2/2/26 -->
# Implicit Objects in JSP
* In JSP, Implicit objects are predefined objects that the JSP container automatically creates and makes available for java developers so they don\`t need to declare or instantiate them.
  _List of Implicit Objects_:
1. request      2) response     3) out      4) config       5) page     6) pageContext      7) application      8) session      9) exception .
   Note: Data read from client to server by using req.getParameter();

<!-- 4/2/26 -->
Q) What is Session in Servlet API ?
* A Session is a way to store user specific data on the server across multiple http requests.
* Since Http is stateless protocol, the server does not remember the previous request by default. So, Session is used to solve this problem.

# Different ways to achieve Session
1. Cookies      2) URL ReWriting       3) Hidden Form Field     4) HttpSession

Q) What is Cookies ?
* It is a small piece of data that stores in the user\`s browser via web application.
* Cookies helps a website to remember information about the user across multiple request.

Q) Why cookies are needed ?
* Because Http is a stateless protocol, it means the server forgets everything after sending a response.
* So Cookies solve this problem by identifying users, maintaining sessions, storing preferences, tracking logging status.

Q) How Cookies works ?
1. Client sends the request to the server.
2. Server creates a cookie memory abd sends it in the response.
3. Browser stores the cookies.
4. Browser send the cookie back in every next request, server reads the cookie and recognized the user.

Q) How to achieve session with the help of HttpSession ?
* It is an interface that allows java developers to store user specific data.
* Retrieve user data across multiple request. It keeps user logged-in and it also tracks shopping carts, preferences etc.

  getSession(): It is a function that returns the object of HttpSession.
  HttpSession httpSession = req.getSession();
  This will create a new session object or give all session object if it is called second time.
  httpSession.setAttribute("userSession",email);
  This method is used to set user specific data in created session.
------------------------------------------------------------------------------------------------------------------------
# Summary Revision:
* Jar -> JDBC -> API -> JDBC(I,C) -> DriverManager -> Connection(I) with 4 methods.
* Driver SW -> JDBC Driver(working 3steps) -> Steps of JDBC Connection(6steps) -> Maven/Gradle -> (4 Exceptions) -> SQL CMDs
* Servlet API -> Architecture -> Lifecycle -> Servlet -> GenericServlet -> HttpServlet -> Request & Response (C, I).
* Web Container -> RequestDispatcher(I) --------------
* JSP -> JSP Tags -> Query String -> Implicit Objects with List .
* Session with DF ways -> Cookies -> HttpSession.
