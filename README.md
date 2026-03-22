
# JAVA

## What is Java ?

Java is a high-level, object-oriented programming language developed by Sun Microsystems in 1995. It is mostly used for building desktop applications, web applications, Android apps and enterprise systems.

- Object-Oriented Programming (OOP): Java supports OOP concepts to create modular and reusable code.
- Platform Independence: Java programs can run on any operating system with a JVM.
- Robust and Secure: Java ensures reliability and security through strong memory management and exception handling.
- Multithreading and Concurrency: Java allows concurrent execution of multiple tasks for efficiency.
- Rich API and Standard Libraries: Java provides extensive built-in libraries for various programming needs.
- Frameworks for Enterprise and Web Development: Java supports frameworks that simplify enterprise and web application development.
- Open-Source Libraries: Java has a wide range of libraries to extend functionality and speed up development.
- Maintainability and Scalability: Java’s structured design allows easy maintenance and growth of applications.

## JDK, JRE and JVM


The development environment of Java consists of three components mainly:

- JVM (Java Virtual Machine): JVM is the engine that runs Java programs. It converts Java bytecode (compiled code) into machine code (understandable by the OS).
- JRE (Java Runtime Environment): JRE = JVM + Libraries + Other components needed to run Java applications.
- JDK (Java Development Kit): JDK = JRE + Development Tools. It is required for developing Java applications.

### JDK (Java Development Kit) :

JDK is a software development kit used to build Java applications. It contains the JRE and a set of development tools.

- Includes compiler (javac), debugger, and utilities like jar and javadoc.
- Provides the JRE, so it also allows running Java programs.
  Required by developers to write, compile, and debug code.

### JRE (Java Runtime Environment) :

JRE is the environment that runs Java programs.
It provides everything needed to execute Java code, but not to develop (compile) it.

Components of JRE:
- JVM (Java Virtual Machine):
  The core engine that runs Java bytecode
  Functions:

        - Converts bytecode → machine code
        - Manages memory
        - Handles execution

- Class Libraries (Java API):
  Pre-written code provided by Java
  Examples:

        - java.lang (basic stuff like String)
        - java.util (collections, ArrayList)
        - java.io (file handling)


- Class Loader
  Loads .class files into memory

- Runtime Data Areas (Memory structure)

    - JRE allocates memory into parts:

        - Heap → Objects stored here

        - Stack → Method calls, local variables

    - Method Area → Class metadata

    - PC Register → Tracks execution

    - Native Method Stack → For native code

- Execution Engine:
  Executes bytecode using:
  - Interpreter → Line-by-line execution
  - JIT (Just-In-Time Compiler) → Converts frequently used code to native for speed.

- Garbage Collector (GC):
  Automatically frees memory
  - Removes unused objects
  - Prevents memory leaks

### JVM (Java Virtual Machine) :

JVM is the engine that runs Java bytecode and converts it into machine code.JVM makes Java platform-independent
(Write once, run anywhere).

Major Components of JVM:

- Class Loader Subsystem:
  Loads .class files into memory

  Types:
    - Bootstrap ClassLoader → Loads core Java classes (java.lang)
    - Extension ClassLoader → Loads extension libraries
    - Application ClassLoader → Loads your program classes

- Runtime Data Areas (Memory):
  JVM divides memory into parts:
    - Heap
    - Stack
    - Method Area
    - PC Register
    - Native Method Stack

- Execution Engine : Executes bytecode
  Includes:
    - Interpreter
    - JIT Compiler (Just-In-Time)

- Garbage Collector (GC)
  Automatically deletes unused objects from heap
  Prevents memory leaks
  Runs in background


## Full Work Flow :

1. Writing the Java Code

User writes code in a .java file:

    public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
    }
    👉 This is human-readable (high-level code)

2. Compilation (javac):

   User compile using:

        - javac Main.java

   What happens:

        Compiler checks:
        -Syntax errors
        -Type errors
   Converts code → bytecode

   👉 Output file:
   -Main.class

3. Bytecode (Platform Independent)

   👉 .class file contains bytecode
   Not machine code
   Not human-readable
   Intermediate code

   👉 This is why Java is:
   “Write Once, Run Anywhere”