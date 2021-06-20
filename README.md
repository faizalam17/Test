# Test
CRUD Application


#INTRODUCTION

The applicate performs the CRUD(Create, Read, Update and Delete) operation using Java 11, Spring Boot, REST API.

#Technologies & Tools
Java 11
REST API
Spring Boot
Tomcat Apache
SQL Developer Tool
Eclipse
**********
#CONFIGURATION

Configure Database :
  
1 - Open SQL Developer and create new database connection.
2 - Once connection is created successfully. Run the following query :
  
 create table user_accounts(id number,name varchar(150),phone number(12),email varchar(200),address varchar(200),country varchar(56),department varchar(50));
 
 insert into user_accounts values(?,?,?,?,?,?,?);
 
 Note : In place of ? you need to specify values.
-------------
Configure Application :

1 - Download and install all the technologies and tools mention above for the project.
2 - Download project from github using url : https://github.com/faizalam17/Test.git
3 - Import project project in eclipse.
4 - Once project is imported successfully. Open property file application.properties and set the following properties as per your database schema:

    spring.datasource.url=
    spring.datasource.username=
    spring.datasource.password=
    
5 - Open file CrudApplication.java. 
    Right Click->Run As->Java Application
    
6 - Open Chrome and hit url: https://localhost:8080/userAccounts 
    Note - Apllication port 8080 can vary as per your server configuration. 
    
7 - Testing CRUD operation using CURL in terminal for MacOS user :
    Note - For MacOS CURL is already preinstalled in terminal.
    
    Open Terminal in macOS and type command as mentioned.
    
    Create : curl -X POST -H "Content-Type : application/json" "{\"id\":1,\"name\":\"Jhon\",\"phone\":9876543210,\"email\":\"jhon@abc.com\",\"address\":\"Street         42,Delhi\",\"country\":\"INDIA\",\"department\":\"CSE\"}" http://localhost:8080/userAccounts
    
    Read : curl http://localhost:8080/userAccounts
    
    Update : curl -X PUT -H "Content-Type : application/json" "{\"id\":1,\"name\":\"Jhon\",\"phone\":8876553210,\"email\":\"jhon@abc.com\",\"address\":\"Street    42,Delhi\",\"country\":\"INDIA\",\"department\":\"ME\"}" http://localhost:8080/userAccounts/1
    
    Delete : curl -X DELETE http://localhost:8080/userAccounts/1
**********
#Important packages
CRUD/src/main/java/com/example/demo/

The above package contains all the java classes and interface required for CRUD.
    
