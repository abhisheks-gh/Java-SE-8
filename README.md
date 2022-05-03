# Java SE 8

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

**Byte Code:**: The code that is going to run through the Java
compiler. 

So, that byte code is going to be interpreted.

It's threaded that helps it to achieve high performance & it's
dynamic meaning that it can resolve at the runtime how things 
should be linked together. 

*In other words, lets say we are writing some code that's going
to use a database service. At runtime, we can actually choose
what that database service is going to be & so that our code is
more dynamic.*

**Resources (Features of Java):**  
https://www.oracle.com/java/technologies/introduction-to-java.html 
