# Event-Management-System
:house: **Event-Management-System**

### ***Framework***
---------
- spring boot

-------------

### ***Project management tool***
-------
- Maven


-----------------
### ***DataBase***
****************
- H2
****************

### **use of dependency**
-----
- <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-data-jpa</artifactId>
      </dependency>
- <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-web</artifactId>
     </dependency>

- <dependency>
       <groupId>org.springframework.boot</groupId>
       <artifactId>spring-boot-devtools</artifactId>
	<scope>runtime</scope>
	<optional>true</optional>
	</dependency>
- <dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
	</dependency>
- <dependency>
       <groupId>org.projectlombok</groupId>
       <artifactId>lombok</artifactId>
       <optional>true</optional>
	</dependency>
- <dependency>
     <groupId>org.springframework.boot</groupId>
     <artifactId>spring-boot-starter-test</artifactId>
     <scope>test</scope>
     </dependency>
<!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-validation -->
- <dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-validation</artifactId>
	<version>3.0.6</version>
	</dependency>





--------

### **packages and class**

---------
- model 
  - Student
  - Event

- controller
   - StudentController
   - EventController

- service
   - StudentService
   - EventService
- Repository
  - StudentDao
  - EventDao
 
-------------


### **Run tests**

------

⭕ postman 

:globe_with_meridians: chrome browser

********

### **Data structure And programming language**

-----

 - core java
 
 --------

  :point_down: **Summary**
*****
The project creates a user management system in Spring with five endpoints for adding, getting, updating, and deleting users. The User model has attributes for userId, username, dateOfBirth, email, phoneNumber, date, and time. The UserController class has methods that correspond to each endpoint, with appropriate implementation to interact with a database. The code also includes validation annotations for the User model attributes, such as @NotBlank, @NotNull, @Pattern, and @Email.
*****

### **Show your Support** 
****
:star: Thankyou 

****
