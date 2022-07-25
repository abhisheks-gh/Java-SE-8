# Java SE 8 - Long Term Support (LTS)
The current LTS versions of Java are Java 7, Java 8, Java 11,
and soon, Java 17. Java 11 and Java 17

*A Java LTS (long-term support) release is a version of Java
that will remain the industry standard for several years. To
give you an example of this, Java 8 was released in 2014, it
will continue to receive updates until 2020, and extended
support will end by 2025.*

## Why Java is "Robust" ?
When we write code, we are going to go through many
processes. We are going to write what's called source
code & then we can run that source code through compiler.
A compiler is another program that takes our source code
and turns it into something that the Java Platform can
understand & then eventually it will run that code. So,
with it being robust, there are actually different checks
that happen to make sure that our code run well.

There is **COMPILE TIME CHECKING**, so we can find out if
we did anything syntactically wrong at that time & then
there is **RUNTIME CHECKING**, things that can be resolved
until the program is actually running.

*For example, if a database is down, we don't really know that when we are
compiling the program, we can only discover that when the
program is running.*

## Why Java is "Secure" ?
* Everything in Java is **Sandboxed**. A sandbox is an isolated
  testing environment that enables users to run programs or open
  files without affecting the application, system or platform on
  which they run. Software developers use sandboxes to test new
  programming code. Cyber-security professionals use sandboxes to
  test potentially malicious software.


* There are lots of efforts in protecting the memory that is being
  used by Java & so on.

## Why Java is "Architecturally neutral" & "Portable" ?
This is also known as platform independence. Java popularise the term
**"WRITE ONCE RUN ANYWHERE"**. So, the idea is that we can write
a program on Windows & we can run it on UNIX or on MAC PC &
we can use the same code that we wrote for both. The way that
they are able to achieve platform independence is that we never
compile our programs into a machine code that's made up for a
specific architecture. Let's say we want to create an .exe file
for windows in other programming languages, we'll write the code
then we'll compile it for that underline architecture or the underline
operating system.

But, with Java we don't have to do that, we write our code once,
it gets compiled into something that java platform understands
(Java bytecode) & that way it achieves platform independence.

## Why Java is "interpreted", "threaded" & "dynamic" ?
Java platforms includes an interpreter & so it's going to interpret
the bytecode that we write.

**Byte Code:** The code that is going to run through the Java
compiler.

So, that byte code is going to be interpreted.

It's threaded that helps it to achieve high performance & it is
dynamic means that it can resolve at the runtime how things
should be linked together.

*In other words, lets say we are writing some code that's going
to use a database service. At runtime, we can actually choose
what that database service is going to be & so that our code is
more dynamic.*

**Resources (Features of Java):**  
https://www.oracle.com/java/technologies/introduction-to-java.html

## The Java Platform
Java platform has two different components:
* ***The Java Virtual Machine (JVM)*** - What's actually going to run
  our program. JVM is coded in such a way that it's going to interpret
  our source code for the underlying operating system.
  The JVM for different architectures are different.
  ***For example, JVM in a MAC operating system and a Windows
  64-bit system are going to be different.*** In this way it helps us
  to achieve platform independence.


* ***The Java Application Programming Interface (API)*** -
  We can think of API as code written by someone else that we
  get to use. It's just bunch of libraries of code.


*NOTE: Another thing that is interesting about Java platform
is that it can be used to run languages that are Java.
So, if you have ever heard of programming languages like **Groovy,
Scala, Clojure, etc.** These are programming languages that
are Java but have been return for the Java platform.

So at higher level, this is how we are going to interact with the
Java platform. First, we are going to write a Java
application, which is in part going to use the Java API. The
great thing about the Java API is that it not only uses the
code that we did right, but the Java API is already bundled with
the Java platform. If we are using a ton of code from the Java
API, we don't have to bundle it with our own application. It's
already on the client's computer which has the Java platform.

            Our JAVA APPLICATION
            JAVA API
            JAVA VIRTUAL MACHINE
            HARDWARE / OS

## Java Runtime Environment (JRE)
Java API and Java Virtual Machine (JVM) together makes JRE.

## The Java Platform Cont.
In Java, applications are both compiled and interpreted.
* The Java compiler compiles our application source code to an intermediate
  language that is interpreted by the JVM.
* The intermediate language is called bytecode.
* Bytecode is **not** machine code that gets executed directly.
* Instead, the JVM translates (i.e., interprets) the bytecode into machine code,
  which gets run by the actual platform.
* In other words, bytecode is like the "machine code" for the JVM.
    * The bytecode is platform independent and can therefore be interpreted
      by any JVM.
    * JVMs are built specific to particular platforms (hardware and OS).


## Rules for main method are
A) It must be public and static (in any order, as long as it is to the
left of the return type). <br>
B) It must return "void." <br>
C) The name "main" must be written in all lowercase. <br>
D) It must declare a String array parameter (where the square brackets may
be written to the right of String or to the right of the identifier). <br>
E) The identifier for the String array may be named anything we'd like
(though, by convention, it is typically "args"). <br>

## Objects vs. Primitives
* Primitives behave differently in that they don't have procedures (behaviour). <br>
*  Primitives only have state (no methods), and they are limited to one piece of state (data).

## Primitive types in Java
Java has 8 primitive data types; char, boolean, byte, short, int, long, float, and double. For this exercise, we'll work with the primitives used to hold integer values (byte, short, int, and long):

* A byte is an 8-bit signed integer. <br>
* A short is a 16-bit signed integer. <br>
* An int is a 32-bit signed integer. <br>
* A long is a 64-bit signed integer. <br>

## Default Values
It's not always necessary to assign a value when a field is declared. Fields that are declared but not initialized will be set to a reasonable default by the compiler. Generally speaking, this default will be zero or null, depending on the data type. Relying on such default values, however, is generally considered bad programming style.

The following chart summarizes the default values for the above data types. <br><br>
![image](https://user-images.githubusercontent.com/95921032/167284114-b137b1f3-0cf2-41fa-838c-241468c1099d.png) <br>


## Creating (Instantiating) object
* The following code creates three different types of Java objects: <br>

      String s = new String();
      Customer c = new Customer();
      Circle circle = new Circle();

Lets consider <br>

        Customer c = new Customer(); 
// Customer = Reference Type <br>
// c = Reference Variable <br>
// new = "new" Keyword <br>
// Customer() = Object Type <br>

* The technical term for creating an object is
  ***instantiation***. <br>
* Another important note about creating objects is to
  understand when the object is actually created.
    * When a reference is defined, this does **not** create
      the object.
    * Defining a reference only means that it is ready to point
      to an object.
    * The object is created when "new" is used.

          Circle c;           // No object exists yet
          c = new Circle();   // Object created and assigned to 'c'
    * Single reference can be reused over & over again. <br>

            Customer c = new Customer("CID10394");   // Same reference - different objects
            Customer c = new Customer("CID23511");
            Customer c = new Customer("CID39203");
            Customer c = new Customer("CID88374");
        * Depending on other code in our application, the old object that our
          reference was pointing to may be destroyed. <br>
        
    * When you create an object with the "new" keyword,
      you are actually calling a method called a constructor.<br>
    * The constructor is responsible for the initialization of an
      object when it is created.
    * Constructor methods can only be called during instantiation.<br>
    * All object have at least one constructor but can have as many as they want or need.<br>
    * The benefit of multiple constructor is flexibility.<br>
      * Depending on what information you have when you create an object, you may have the ability to pass in all,
        some, or no data.<br>

## Default Constructors
* *For every class, Java provides a default constructor. But, if we create our own constructor for that class then that default constructor is no longer there. So, if someone calls that default constructor anymore in the program (after the creation of our new constructor), the whole code for that particular class will break at the point where the default constructor is called & the program will not even compile.*<br>

## Default vs. "No-Arg" Constructor
* A "no-arg" constructor is one that lists no parameters (it takes no arguments).  A "default" constructor is a "no-arg" constructor that is created by the compiler, in the event that you don't explicitly create one yourself.
      
# Creating Object Types
 There are plenty of object types (like String and Point) created in Java and ready for you to use.
 These object types are part of Java API.<br>
 * An object type is called a class.<br>

# Static methods have two primary purposes:
1) They are used to access (update or fetch) class variable data.

    * Although this can be done with any instance of the class, it is considered more appropriate to use class method for this purpose.

    * In some cases, we may not have an instance of an object created before the data is needed.

    * We don't have to create an object just to be able to access class variables.

2) Static methods provide functionality without the need for an object / instance.
   * For example, mathematical formulas are great reasons to have static methods.
   * Should you have to create an instance of some object to compute sine, cosine, or tangent?
   * Examine the Math class (java.lang.Math) to see some excellent use of static methods.<br>

# Static Reference Variables and null
If the reference variable you are working with has a null value (meaning it is not referring to an object), it's in a dangerous state.  Specifically, if you access an instance member with it, you will see the dreaded "NullPointerException."  This is an exception created by the JVM and unless special exception handling code is written, will result in your program quitting prematurely.

For example, the following code will result in a **NullPointerException** :

    public static void main(String[] args) { 
    String s = null;
    s = s.toUpperCase(); // Oops! s is null! 
    }
<br>
Static members are different.  While you shouldn't write sloppy/confusing code like this, you should know (especially for the exam) that accessing static members with a null Class reference will not throw a NullPointerException.  For example, the java.lang.Math class has a static method called floor:   <br> 
    
    public static void main(String[] args) {   
    Math m = null;  
    double result = m.floor(28.15); // Confusing code, but it works.
    }
<br>
I want to stress, while the preceding code won't throw a NullPointerException, you shouldn't write code like that. It is much clearer to use the class name:

    public static void main(String[] args) {   
    double result = Math.floor(28.15);   
    }
See the "Exception Handling" section for more details on exceptions.<br>

# Static vs Regular Initialization Block
* Static initialization block is executed only once (when the class is loaded by JVM) 
  whereas the regular initialization blocks are executed every time a object is initialized.
* A static block just like an static method can only load static variables & methods.

# 'this' keyword
* 'this' keyword is used to bypass the local variable (searching of value in local frame on stack) and
  directly go to the object associated with it.

# Rules for Constructor chaining    
* *this()* is used for constructor chaining.
* Parameters passed inside 'this()' decides to which constructor call should be generated.
* Need to be done in first line of constructor.
* Can't place it inside a method.

# Automatic Garbage Collection
The java runtime environment manages memory for us! <br>
* We never have to destroy an object explicitly or manage the memory it uses.
* The java runtime environment deletes objects when it determines that they are no longer being used.
  This process is known as ***garbage collection***.
* The java runtime environment's garbage collector periodically searches memory for "free" (unreferenced) objects 
  that are no longer needed.
* When it finds one, it removes it from the heap.
* ***Garbage Collection Command*** <br>
  Used to give hint to Garbage Collector that it should run.<br>
  But, it's just a hint or suggestion and garbage collector choose to ignore it if it decides that now it's
  not a optimal time to run. <br>
          
      System.gc();

# Memory Leaks
* In general, a Java memory leak happens when an application unintentionally (due to logical errors in code) holds
  on to object references that are no longer required. These unintentional object references prevent the built-in
  Java garbage collection mechanism from freeing up the memory consumed by these objects.

# Default Packages in a Java Application
1) The package that you are currently in
2) The java.lang package <br>
    The java.lang has classes that are fundamental to nearly every program you write. <br>
    For example, ***System***, ***String***, and ***Integer***, etc. are all part of java.lang package.<br>

# Classpath
* A classpath is a system variable that allows you to tell the compiler and class loader where you store your files
  (the bytecode and other application files).
* A classpath can contain multiple directories, JAR files, or zip files.
* Separate files in the classpath with the correct operating system path separator(e.g., semicolons for Windows,
  for *nix). <br>
* When you compile, you can also explicitly designate a classpath for the compiler by including the classpath option.<br>

            javac -classpath c:/temp/myclasses;. SomeClass.java
* Although, it is possible to set the "classpath" environment variable, it is not recommended
  * Most projects will have unique classpath locations and if you don't change that, you might be looking for the code 
    in an outdated directory
  
# More on classpath
A classpath says: "here is a list of root/top level folders where code may be found."  You don't have to list every single directory that has code... just the root folder(s) the compiler & JVM should start their search from.  All of the subfolders are determined by package & import statements in the class.

For example, imagine that we have code in two different directories

    c:\src\com\intertech\transport\Truck.class

    c:\libraries\com\intertech\util\VINFormatter.class

The root code folders are: <br> 
             
    c:\src and c:\libraries

Each class would list the subdirectories they live in, via their package statements (note that the package statement is relative from the root code folder... in other words, you don't write "src" or "libraries" as part of the package statement):

    package com.intertech.transport;   
    public class Truck {        
    }   

and <br>

    package com.intertech.util; 
    public class VINFormatter { 
    }   
Now, let's say we want to compile a class in another root folder: <br>

    c:\myapp\com\intertech\inventory\InventoryManager.java
<br>

    package com.intertech.inventory;    
    import com.intertech.transport.Truck;   
    import com.intertech.util.VINFormatter; 
    public class InventoryManager { 
    private Truck truck;    
    private VINFormatter formatter; 
    // ... more code    
    public static void main(String[] args) { //... }    
    }   
If we navigated to the <br>

    c:\myapp directory and just wrote

    javac com\intertech\inventory\InventoryManager.java

or

    java com.intertech.inventory.InventoryManager

...the compiler and JVM, respectively, would try to find Truck in c:\myapp\com\intertech\transport and VINFormatter in c:\myapp\com\intertech\util... which are the wrong directories.

So instead, we use the following compile command w/ classpath to let the compiler know it should search for the classes in different root folders: javac -classpath c:\src;\c:\libraries;. com\intertech\inventory\InventoryManager.java  (the "." means the current directory is also a root folder).

... and we'd run the class with: <br>

    java -classpath c:\src;\c:\libraries;. com.intertech.inventory.InventoryManager

This classpath, combined with the package/import statements, are used by the compiler AND the JVM at runtime to find a given class.

# Rules for BigInteger and BigDecimal (java.math)
* BigInteger and BigDecimal can't use operators (like +, -, *, /) as they are objects not primitives.
* So, instead of these operators we use methods that are present to perform the calculations.

# StringBuilder and StringBuffer Classes
* Strings in Java are **MUTABLE** i.e. every time we modify the value of string, the modified value is stored in a new string.
* Java developers are encouraged to use  **StringBuilder** and **StringBuffer** classes when an application needs to
  manipulate a lot of strings.
* **StringBuilder** and **StringBuffer** (both in java.lang) provide a mutable sequence of characters but without the 
  fancy string literals and operators.
* **StringBuffer** is thread-safe whereas **StringBuilder** is not thread-safe.

# "Protected" Keyword
Protected access means that the state or behavior is available to code in the same class, same package, and to subtypes in any other package.  Let's look at some examples that use the following class: <br>

    package com.intertech.examples;
    public class Person {
        protected void doSomething() {
            System.out.println("Doing something");
        }
    }
In this first example, calling doSomething() is legal, because it is being invoked from a class in the same package. <br>

    package com.intertech.examples; 
    public class PersonTester {
        public static void main(String[] args) {
            Person p = new Person();
            p.doSomething();
       }
    }
Although this next example defines a class in a different package than the one which contains Person, calling doSomething() is legal because Employee extends Person <br>

    package com.something.else;
    import com.intertech.examples.Person;
    public class Employee extends Person {
        public void testingProtectedMethod() {
            doSomething();
        }
    }
When dealing with code that is in a different package from the one that contains the protected state or behavior, it's not enough for the call to be made with a subtype object. The object must be called within a subtype class.  For example, the following is illegal. Even though the object being used is an Employee (a subtype of Person), the code has been defined in a class that is not a subtype of, nor in the same package, as Person. <br>

    package com.something.else;
    public class EmployeeTester {
        public static void main(String[] args) {
            Employee e = new Employee();
            e.doSomething() // ILLEGAL
        }
    }
The most surprising rule, however, is that when accessing protected state or behavior from a different package, it can only be accessed with an object reference that is the same type as the class it is defined in.  For example, here we have an Employee class.  The class is defined in a different package from Person, but it is a subtype of Person.  Therefore, the doSomething() method is available to Employee.  It is NOT, however, available for a Person object (where the method is defined!) or a Musician object (another subtype of Person) when they are used in this Employee class: <br>

    package com.something.else;
    import com.intertech.examples.Person;
    import com.intertech.examples.Musician; /* Musician extends Person */
    public class Employee extends Person {
        public void testingProtectedMethod() {
            doSomething();  // LEGAL
        }

        public static void main(String[] args) {
            Employee e = new Employee();
            e.doSomething(); // LEGAL
            Person p = new Person();
            p.doSomething(); // ILLEGAL
            Musician m = new Musician();
            m.doSomething(); // ILLEGAL
      }
    }
# "super" keyword and First Statement Rule
I mentioned that when chaining constructors, the call to the super constructor must be the first statement in the constructor.  And that's true.  Assuming the Person class contains a no-arg constructor, the following constructor is valid: <br>

    public Employee() {
        super();
        deptId = 281;
    }
...whereas this one is not: <br>

    public Employee() {
        deptId = 281;
        super();
    }
I want to clarify that using super with the dot operator, to invoke a super type's method (other than a constructor) or access its state, is NOT bound by the first statement rule. <br>

Both of these examples are valid: <br>

    public void driveLikeDad() {
        super.drive();
        doSomethingElse();
    }
and...  <br>

    public void driveLikeDad() {
        doSomethingElse();
        super.drive();
    }
