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
        reference was pointing to may be destroyed.
