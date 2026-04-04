# Exception: It is an unexpected situation which occurs at runtime and program will not maintain the normal flow of execution.

# Exception Handling: It is a mechanism by which program maintains the normal flow of execution even incase exception occurs in the program.
- Java provides different keywords to work with exceptions such as: try, catch, finally, throw, throws.

# Exception Hierarchy: 
- Throwable(C) is the top-most parent class in exception hierarchy. It has two child :
1) Exception                    2) Error

Q) Difference Between Exception and Error:

# Exception:
1) Exception is a class which is used to represent an unexpected situation. 
2) If exception occurs in the program then it can be caught by using try-catch and normal flow of the application can be maintained.
# Error:
1) Error is also a class but it is used to represent a serious problem in the application. 
2) If error occurs in the program then it cannot be caught by using try-catch and normal flow of the application cannot be maintained.
3) If Error occurs then application will be terminated. 

# Types of Exception:
1) Checked Exception
2) Unchecked Exception


<!-- 30 mar -->
- At a time only one exception can be thrown from try block.
- If first exception will not occur then only next exception can be thrown from try block.
- We can use multiple catch block with try block to handle different exceptions differently.
- When we use multiple catch with one try block then we have follow the child to parent catch block flow.
- We can declare multiple exceptions at one catch block by using single pipeline symbol(operator).
- We can use multiple try catch inside a program to create and handle multiple exceptions.

# finally block: It is a block which is used with try-catch block to execute some mandatoru=y conditions. The statements written inside finally block will always execute whether application terminates normally or abnormally.
    Syntax -> try{

    }catch(Exception e){

    }finally{
        // mandatory Condition
    }
_USE of Finally Block_:
1) used for resource closing such as scanner closing etc.
2) used for memory cleaning
3) used for file closing
4) used fot Database connection closing
5) If we want to execute some code compulsarily than we should write that code in finally block.

*In which situation finally block will not execute ?*
- If System.exit(0); executes before finally then finally block will not execute.
- if try-catch block has Infinite loop then in that case finally block may not execute.
- If exceptions occurs inside finally block then finally block will not execute.
- If JVM crashes while in execution then finally block will not execute.

*Can we use try without catch ?*
- Yes, we can use try block without catch block in that case try block should be used with finally block.
- try with finally will execute normally if exception does not occur. If exception occurs then normal flow will not be maintained. 
Note: If return statement is provided from try-catch-finally then the return value will always go from finally block.

# Nested try-catch block:
- If a try-catch block is used inside another try-catch block then it is called nested try- catch block.
- try-catch block can be used inside try block, catch block, or inside finally block.

# throw and throws:
_throw:_ throw is a keyword which is used to throw the object of Exception.
- throw keyword only creates the Exception in the program.
- Ex: throw new ArithmeticException();      throw new InsufficientFundException();

_throws Keyword / Exception Declaration:_ It is a keyword which is used to declare the exception of a method. When exception is declared on method then it will be the responsibility of caller to handled the exception using try-catch block. 
- we can declare multiple exceptions by using one throws keyword.
- Ex: public static void checkEligibility(int age) throws UnderAgeException, ArithmeticException {
        if(age>=18) 
            Sop("you are eligible to vote");
        else
            throw new UnderAgeException();
      }
      -----------------------------------------
      try{
        check/eligibility(23);
      }catch(Exception e){
        Sop(e.getMessage());
      }

# Difference b/w throw and throws:
- It is used to throw the exception object but throws is used to declare the exception.
- Only one object can be thrown by using one throw keyword while In throws, multiple exceptions can be declared using one throws keyword.
- throw is used inside method but throws is used at method declaration.
- throw keyword is followed by instance of exception but throws keyword is followed by the name of exception.

# Custom Exception:
- An Exception created by user is called Custom Exception. 
- If Custom Exception is craeted using RuntimeException then it will for Unchecked Exception otherwise if it is formed using Exception then it will for checked exception.

# try-with-resources:
- we can use multiple resource inside try-with-resource by using `?` .
**











































<!-- Throwable -->
/**
 * The {@code Throwable} class is the superclass of all errors and
 * exceptions in the Java language. Only objects that are instances of this
 * class (or one of its subclasses) are thrown by the Java Virtual Machine or
 * can be thrown by the Java {@code throw} statement. Similarly, only
 * this class or one of its subclasses can be the argument type in a
 * {@code catch} clause.
 *
 * For the purposes of compile-time checking of exceptions, {@code
 * Throwable} and any subclass of {@code Throwable} that is not also a
 * subclass of either {@link RuntimeException} or {@link Error} are
 * regarded as checked exceptions.
 *
 * <p>Instances of two subclasses, {@link java.lang.Error} and
 * {@link java.lang.Exception}, are conventionally used to indicate
 * that exceptional situations have occurred. Typically, these instances
 * are freshly created in the context of the exceptional situation so
 * as to include relevant information (such as stack trace data).
 *
 * <p>A throwable contains a snapshot of the execution stack of its
 * thread at the time it was created. It can also contain a message
 * string that gives more information about the error. Over time, a
 * throwable can {@linkplain Throwable#addSuppressed suppress} other
 * throwables from being propagated.  Finally, the throwable can also
 * contain a <i>cause</i>: another throwable that caused this
 * throwable to be constructed.  The recording of this causal information
 * is referred to as the <i>chained exception</i> facility, as the
 * cause can, itself, have a cause, and so on, leading to a "chain" of
 * exceptions, each caused by another.
 *
 * <p>One reason that a throwable may have a cause is that the class that
 * throws it is built atop a lower layered abstraction, and an operation on
 * the upper layer fails due to a failure in the lower layer.  It would be bad
 * design to let the throwable thrown by the lower layer propagate outward, as
 * it is generally unrelated to the abstraction provided by the upper layer.
 * Further, doing so would tie the API of the upper layer to the details of
 * its implementation, assuming the lower layer's exception was a checked
 * exception.  Throwing a "wrapped exception" (i.e., an exception containing a
 * cause) allows the upper layer to communicate the details of the failure to
 * its caller without incurring either of these shortcomings.  It preserves
 * the flexibility to change the implementation of the upper layer without
 * changing its API (in particular, the set of exceptions thrown by its
 * methods).
 *
 * <p>A second reason that a throwable may have a cause is that the method
 * that throws it must conform to a general-purpose interface that does not
 * permit the method to throw the cause directly.  For example, suppose
 * a persistent collection conforms to the {@link java.util.Collection
 * Collection} interface, and that its persistence is implemented atop
 * {@code java.io}.  Suppose the internals of the {@code add} method
 * can throw an {@link java.io.IOException IOException}.  The implementation
 * can communicate the details of the {@code IOException} to its caller
 * while conforming to the {@code Collection} interface by wrapping the
 * {@code IOException} in an appropriate unchecked exception.  (The
 * specification for the persistent collection should indicate that it is
 * capable of throwing such exceptions.)
 *
 * <p>A cause can be associated with a throwable in two ways: via a
 * constructor that takes the cause as an argument, or via the
 * {@link #initCause(Throwable)} method.  New throwable classes that
 * wish to allow causes to be associated with them should provide constructors
 * that take a cause and delegate (perhaps indirectly) to one of the
 * {@code Throwable} constructors that takes a cause.
 *
 * Because the {@code initCause} method is public, it allows a cause to be
 * associated with any throwable, even a "legacy throwable" whose
 * implementation predates the addition of the exception chaining mechanism to
 * {@code Throwable}.
 *
 * <p>By convention, class {@code Throwable} and its subclasses have two
 * constructors, one that takes no arguments and one that takes a
 * {@code String} argument that can be used to produce a detail message.
 * Further, those subclasses that might likely have a cause associated with
 * them should have two more constructors, one that takes a
 * {@code Throwable} (the cause), and one that takes a
 * {@code String} (the detail message) and a {@code Throwable} (the
 * cause).



 <!-- Exception -->
 /**
 * The class {@code Exception} and its subclasses are a form of
 * {@code Throwable} that indicates conditions that a reasonable
 * application might want to catch.
 *
 * <p>The class {@code Exception} and any subclasses that are not also
 * subclasses of {@link RuntimeException} are <em>checked
 * exceptions</em>.  Checked exceptions need to be declared in a
 * method or constructor's {@code throws} clause if they can be thrown
 * by the execution of the method or constructor and propagate outside
 * the method or constructor boundary.
 *
 * @author  Frank Yellin
 * @see     java.lang.Error
 * @jls 11.2 Compile-Time Checking of Exceptions
 * @since   1.0
 */