<!-- 09/02/26 -->
# *HIBERNATE (JPA)*
# What is Hibernate ?
- In Software development, hibernate is a java ORM (Object Relational Mapping) framework.
- It helps java programmers or programs to talk with databases without writing tons(multiple/several) of SQL Query. Beacuse it will generate 80% query automatically and rest off we have to write.
- Hibernate mapping java classes to databases tables and handles CRUD operations, manages databases connection and transaction.

# Why we use Hibernate ?
- It provide less boiler plate SQL queries. It is a database independent so we can switch db easily.
- it is commonly used with java, springboot, and JPA(Java/Jakarta Persistence API).

# What is ORM ?
- It stands for Object Relational Mapping. Its a way to connect Object-Oriented code like java, python, C# with relational databases like MySQL, ORACLE etc without writing a lot of SQL Queries.
- ORM converts classes into a tables and 
      converts classes attribute into a table column and 
      converts Object data into a database row.
- Ex:   class Student{
            int id;
            String names;
            String email;
        }
*Popular ORM Frameworks:*
1) Hibernate (JAVA)      2) JPA (JAVA)      3) Entity Framework (.Net)     4) Django (Python)

# What is JPA ?
- It stands for Java Persistence API, which is a java specification that defines how java objects are stored, retrived and managed in a relational databases.
- JPA is a set of rules not an actual tools. It doesn`t perform database operation by itself.
- It needs an implementations to work.
- Popular JPA implementstions are Hibernate(commomlu used), eclipse spring and Open JPA
- Before JPA every ORM work differently.
- JPA provides a standard way of ORM.
- It provides minimal code changes and easily can be switched with less implementaion.

# Advantages of JPA 
1) It reduces the boiler plate code of JDBC.
2) It is a database independent .
3) It integrates well Spring and SpringBoot to communicates with the database.

# Difference between Hibernate and JPA:
*Hibernate*:
- It is a ORM Framework.
- Hibernate support JPQL, HQL, and Native SQL.
- Hibernate can work alone.
*JPA*
- JPA is a rule and specification.
- JPA support only JPQL.
- JPA needs ORM tool.

# Classes and Interface of Hibernate & JPA
- JPA is a specification so it mostly provided interface not an implementation.
- Core interfaces of JPA:
        1) EntityManager (I)    2) EntityManagerFactory (I)    3) EntityTransaction (I)
        4) Query (I)      5) Persistence (C)     6) TypedQuery<T> (I)

- JPA Annotations:
      @Entity,    @Id,     @GeneratedValue,       @Column,      @OneToOne,     @OneToMany,    @ManyToOne,     @ManyToMany,     @JoinColumn,
      @JoinTable,     @Transient,     @CreateTimeStamp,    @UpdateTimeStamp,       @Table  etc.

# Hibernate interfaces and classes:
- It is an implementation so it has actual classes and interfaces.
        1) Session (I): It is equivalent to EntityManager of JPA.
        2) SessionFactory (I): It is equivalent to EntityManagerFactory.
        3) Transaction (I)     4) Query(I) <HQL>       5) Criteria (I)

<!-- 10/02/26 -->
# Persistence: 
- It is a class which is present in jakarta.persistence package. 
- It is provided by JPA(Jakarta Persistence API). It is also known as Utility class.
- It is used to read Connection from persistence.xml file with the help of Persistence.createEntityManagerFactory(String persistenceUnitName) and create the object of EntityManagerFactory(I).
        
Q) What is EntityManagerFactory ? 
- It is a thread-safe factory object that is used to create EntityManager(I) object.   Ex -> emf.createEntityManager();
- It is created once per application and reuse again and again. It also represents the entire Persistence unit. 
- It has method createEntityManager(): EntityManager .

Q) What is EntityManager ?
- It is an main Interface of JPA which is used to perform database operations(CRUD) on Entity classes.
- It represents a persistence context which is a working area where all entities are managed.
- It has multiple In-Built method such as: 
      1) persist(Object entity): It will generate Insert query against Entity class.
      2) merge(Object entity): It will generate Update query for existing Object.
      3) remove(Object entity): It will generate Delete query for existing Object.
      4) find(EntityClass.class, primaryKeyValue): It will generate Select query with Where clause against passed primaryKeyValue.
      5) createQuery(String jpql): Query(I) -> It will read and execute JPQL query. 
      6) createNativeQuery(String sql): Query(I) -> It will read and execute Native Query (SQL).
      7) getTransaction(): EntityTransaction(I) -> It will give the object of EntityTransaction for Transaction Management.

# EntityTransaction :
- It is a JPA Interface that is used to control database transaction manually while performing DML operations.
- It allows java developer to begin, commit, rollback a database transaction.
- It has multiple methods:
      1) begin(): It will start the transaction before DML.
      2) commit(): It will permanently save the data inside db after DML.
      3) rollback(): It will reverts the changes before commit after DML.
      4) isActive(): boolean -> It will checks the transactions is active or not. 
- In Spring framework for Transaction management we use @Transactional .

Q) Hibernate Annotations ?
Q) What is Lombok ?

<!-- 11/02/26 -->
Note: No inbuilt method for displayed whole table at once.

# JPQL : It stands for Java/Jakarta Persistence Query Language. 
- It is an Object-oriented Query Language defined by JPA Hibernate. 
- It is used to write Query on Entity classes not database tables directly.
- Hibernate implements JPQL and translates it into appropriate SQL for database. 

JPQL Syntax:
      @Entity
      class Employee{}
      Select: i)        SELECT aliasName FROM EntityClassName aliasName;
             ii)        FROM EntityClassName;

- For read and execute JPQL query, we use createQuery() method.

H/W : Project -> Hibernate Student CRUD Operation.

# Lombok: It is Java Library that provides annotations to simplify java development by automating the generation of boilerplate code. Key features include automatic generation of getters, setters, equals, hascode, and toString methods.

<!-- 12/02/26 -->
@Id, @Column, @Entity, @Table, @CreationTimeStamp, @UpdateTimeStamp, @Transient(transient),  
Q) D/F B/W Native Query vs JPQL ?
Note: JPQL is DATA Independent Query language which have one syntax but communicate with any database.

# Hibernate RelationShip Mapping:
- HRM are based on three main concepts:
1) Association Type
2) Direction (can be uni-directional or bi-directional)
3) Ownership (owning side and non-owning side)

# Association Type: Before Association we have two types of directions :
1) Uni-directional Mapping: the communication between multiple objects from anyone side. It is of Four types:
            1) One-To-One
            2) One-To-Many
            3) Many-To-One
            4) Many-to-Many  .

# 1) One to One Uni-Directional Mapping:
- When One entities connected(Associate) with only one entity from anyone side then it is known as One-toOne Uni-Directional Mapping.
            For Ex -> One user has one passport.

<!-- 16/2/26 -->
# Cascading in Hibernate: It is a mechanism which is used in hibernate relationship mapping when we perform any DML operation with parent Entity. The same operation is automatically applied to its child entities.
  For ex -> If we delete Person, automatically Passport will be deleted and
           when we Insert a Person automatically Passport will get Inserted without passing it inside persist() method.

# Why do we use Cascading ?
- Without Cascading, If we save Person and Passport together we have to call both inside persist() but with Cascading we have to call Person inside person() method.

# Types of Cascading:
- CascadeType is an enum which is used to perform DML operation automatically for child Entity.
- It is of Six types:
      1) CascadeType.PERSIST : when we persist(person) then child automatically persist.
      2) CascadeType.REMOVE
      3) CascadeType.MERGE
      4) CascadeType.REFRESH
      5) CascadeType.DETACH
      6) CascadeType.ALL
Ex -> If we want to persist Passport automatically with Person then we have to write Cascading in the top of Passport Reference variable

# Difference between JPQL vs SQL ?

<!-- 17/2/26 -->
# 2) One-to-Many Uni-Directional Mapping: 
- When one object is associated with multiple objects from anyone side is known as One-to-many unidirectional mapping.
For ex ->   One Country --> multiple States,
          One State --> multiple Districts
          One College --> multiple Branches
          One University --> multiple Colleges

@Entity
class Country{
      @Id
      int id;
      String name;
      String capital;
      @OneToMany
      List<State> states;
}

@Entity
class States{
      @Id
      int id;
      String name;
      long population;
      String capital;
}

<!-- 18/02/26 -->
Q) What is Logging Framework?
Q) What is Log4J ?
Q) What is SLF4J ?
Q) OrphanRemoval vs Cascade.REMOVAL

Note: mvn clean install

# orphanRemoval :
- It is a mechanism which is used to remove Child entity automatically whwn we remove Parent entity.
- Without orphanRemoval a child class only break the relationship and child records still remain same in the table.
- But with orphanRemoval removing a child from the collection, delete its from the database

<!-- 20/2/26 -->
# 4) ManyToMany Uni-Directional Mapping: Association between more than one object where multiple object connected with multiple object is called Many-To-Many Releationship mapping.
For Ex ->
      Subject                                           Student
      ___________________________________
 PK  | id  |  name       |   Author      | FK           id      name        email       SubjectId
     | 433 |  JAVA       |  Shambhu Sir  |              123     Arjun                   433, 533, 633
     | 533 |  HTML       |  Shresth Sir  |              933     Saket                   533,  633
     | 633 |  JavaScript |  Sarvesh Sir  |              435     Prince                  433, 533, 633
      ````````````````````````````````````
      Student-Subject
       _____________________________
      | StudentId   |     SubjectId |
      |   123       |      533      |
      |   123       |      433      |
      |   123       |      633      |
      |   433       |      533      |
      |   433       |      633      |
      ```````````````````````````````
@Entity
class Student{
      @Id
      int id;
      String name;
      String email;
      @ManyToMany
      List<Subject> subject;
}

@Entity
class Subject{
      @Id
      int id;
      String name;
      String author;
}
Note: many to one same as one to one, one to many same as many to many.

<!-- 23/2/26 -->
# BiDirectional:

@Entity
class Person{
      @Id
      int id;
      String name;
      @OneToOne
      Adhar adhar;
}

@Entity
class Adhar{
      @Id
      long number;
      String address;
      LocalDate dob;
      @OneToOne
      Person person;
}

       Person
PK                  FK
id    name        adharId
330   ------        1234
430   ------         234

               Adhar
PK                              FK
id     address       dob     personId
1234   ------        ---         430
 234   ------        ---         330

# MappedBy : It is an attribute in Hibernate JPA which is used to decide owner(owning side) in Bi-directional mapping.
- we have to write MappedBy at the top of owning side reference variable.

# FetchType in Hibernate JPA: It is an enum in JPA which is used in Bi-directional relationship to load the related Entity data from the database to java code.
- It is of two types:
i) FetchType.LAZY       ii) FetchType.EAGER
- FetchType only works with DQL Query.
- Default Fetch Types of relationship mapping:
- OneToOne and ManyToOne default FetchType is EAGER and OneToMany, ManyToMany default FetchType is Lazy.

i) FetchType.LAZY: It is a default FetchType of OneToMany and ManyToMany. It loss related Entity data from database to Java code when we manually accessing.
ii) FetchType.EAGER: OneToOne and ManyToOne default FetchType is EAGER. It loss the related Entity immediately alongwith the parent Entity from db to Java APP.

Q) JoinTable, JoinColumn, MappedBy, Cascading, FetchType, orphanRemoval,  AnnotationException .

<!-- 24/2/26 -->
Note: OneToMany: Compiler decide owner
Note: OneToOne, ManyToMany: Developer decide owner

# ManyToMany BiDirectional Mapping:

class Student{
      @Id
      int id;
      String name;
      String email;
      @ManyToMany
      List<Subject> subject;
}

class Subject{
      @Id
      int id;
      String name;
      String author;
      @ManyToMany
      List<Student> student;
}

# Attributes: Cascade, FetchType, MappedBy
# Annotations:
- lombok: @Data, @Setter, @Getter, @EqualsAndHashcode, @ToString, @AllArgConstructor, @NoArgConstructor, @RequiredArgConstructor .
- Hibernate JPA: @Entity,  @Table,  @Id,  @Column,  @JoinColumn,   @JoinTable,   @Transient,  @createtimestamp,   @UpdateTimeStamp,  @GeneratedValue,  @OneToOne
- Composite-key-annotation: @IdClass,   @EmbeddedId,    @Embeddable

