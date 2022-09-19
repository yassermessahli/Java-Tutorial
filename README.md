![Java tutorial](https://raw.githubusercontent.com/yassermessahli/Java-Tutorial/main/img/InfoCard.png)

# Java Tutorial

### Table of Content:

#### - [Introduction](#introduction)
- [Description](#description)
- [Who is this tutorial for?](#who-is-this-tutorial-for)

#### - [Installation](#installation)
#### - [Hello World](#hello-world)

#### 1. [Basics](#basics)
   - [Variables](#variables)
   - [Data Types](#data-types)
   - [Operators](#operators)
   - [Controle Statements](#conditions)
   - [Loops](#loops)
   - [Arrays](#arrays)
   - [Methods](#methods)

#### 1. [Object-Oriented Programming](#object-oriented-programming)
   - [Classes](#classes)
   - [Objects](#objects)
   - [Inheritance](#inheritance)
   - [Polymorphism](#polymorphism)
   - [Encapsulation](#encapsulation)
   - [Abstraction](#abstraction)
   - [Interfaces](#interfaces)
   - [Packages](#packages)

#### 3. [Advanced](#advanced)
   - [Exceptions](#exceptions)
   - [Generics](#generics)
   - [Collections](#collections)
   - [Threads](#threads)
   - [Lambda Expressions](#lambda-expressions)
   - [Streams](#streams)
   - [Files](#files)
   - [Networking](#networking)
   - [GUI](#gui)

#### 4. [Resources](#resources)
   - [Books](#books)
   - [Websites](#websites)
   - [YouTube](#youtube)
   - [Courses](#courses)
   - [Tutorials](#tutorials)

#### - [Contribute](#contribute)
#### - [About me](#about)
#### - [Contact](#contact)



## Introduction

### Description
This is a Quick tutorial for Java programming language, made by **[me](https://github.com/yassermessahli)** for myself,
but I decided to share it with you, so you can learn Java programming language basics in a short time.
It is a collection of notes and examples that I have gathered.
I have tried to make it as simple as possible and I hope it will be useful for you.

### Who is this tutorial for?
This tutorial is for:
- Beginners who want to learn Java programming language basics.
- People who want to refresh their knowledge.
- People who want to learn Java programming language from scratch.
- People who want to learn Java programming language in a short time.

## Installation

### Windows

- Download and install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
- Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=windows).
- Download and install [Git](https://git-scm.com/download/win).
- Download and install [GitHub Desktop](https://desktop.github.com/).
- Download and install [Visual Studio Code](https://code.visualstudio.com/download).

### Linux

- Download and install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
- Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=linux).
- Download and install [Git](https://git-scm.com/download/linux).
- Download and install [GitHub Desktop](https://desktop.github.com/).
- Download and install [Visual Studio Code](https://code.visualstudio.com/download).

### Mac

- Download and install [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html).
- Download and install [IntelliJ IDEA](https://www.jetbrains.com/idea/download/#section=mac).
- Download and install [Git](https://git-scm.com/download/mac).
- Download and install [GitHub Desktop](https://desktop.github.com/).
- Download and install [Visual Studio Code](https://code.visualstudio.com/download).

## Hello World

Java programming language is Object-Oriented Programming language, so anything in its program is a class. 
We need first to create a class to run our code. and all the classes are in folder called Package (begin with a capital letter "com").

#### Main structure of a Java program:
```java
package com.MyPackage;

public class MyClass{
    public static void main(String[] args){
        
        // Your code here...
        
    }
}
```

To print something in the console we use System.out.print("Hello World");.

#### Hello World program:
```java
package com.MyPackage;

public class MyClass {
    public static void main(String[] args) {

        System.out.println("Hello World");

    }
}
    
```

to read something from the console we use Scanner class.

#### Read from console program:

```java
package com.MyPackage;

import Scanner;

import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();

    }
}
```


#### To read:

- **int**: `input.nextInt();`
- **double**: `input.nextDouble();`
- **float**: `input.nextFloat();`
- **char**: `input.next().charAt(0);`
- **boolean**: `input.nextBoolean();`
- **byte**: `input.nextByte();`
- **short**: `input.nextShort();`
- **long**: `input.nextLong();`
- **String**: `input.nextLine();`

## 1) Basics

### Variables

#### Variable types:

- **Local variable**: A variable declared inside a method, constructor or block is called local variable.
- **Instance variable**: A variable declared inside a class but outside a method, constructor or block is called instance variable.
- **Class variable**: A variable declared inside a class, with the static keyword is called class variable.
- **Global variable**: A variable declared outside a class is called global variable.
- **Final variable**: A variable declared with the final keyword is called final variable(constant).
- **Static variable**: A variable declared with the static keyword is called static variable.

#### Variable declaration:

- **Local variable**: `type name = value;`
- **Instance variable**: `type name = value;`
- **Class variable**: `static type name = value;`
- **Global variable**: `type name = value;`
- **Final variable**: `final type name = value;`
- **Static variable**: `static type name = value;`
- **Primitive type**: `type name = value;`
- **Reference type**: `type name = new type();`
- **Array**: `type[] name = new type[size];`


### Data types

#### Primitive data types:

- `byte`: 8-bit signed two's complement integer.
- `short`: 16-bit signed two's complement integer.
- `int`: 32-bit signed two's complement integer.
- `long`: 64-bit signed two's complement integer.
- `float`: 32-bit IEEE 754 floating point.
- `double`: 64-bit IEEE 754 floating point.
- `boolean`: true and false.
- `char`: 16-bit Unicode character.
- `String`: sequence of characters.


#### Reference data types:

- `Class`: a user-defined blueprint or prototype from which objects are created.
- `Interface`: a blueprint of a class that has static constants and abstract methods.
- `Array`: a container object that holds a fixed number of values of a single type.
- `Enum`: a special "class" that represents a group of constants (unchangeable variables, like final variables).
- `Annotation`: provides data about a program that is not part of the program itself.


### Operators

#### Arithmetic operators:

- `+` addition.
- `-` subtraction.
- `*` multiplication.
- `/` division.
- `%` modulus.
- `++` increment.
- `--` decrement.


#### Relational operators:

- `==` equal to.
- `!=` not equal to.
- `>` greater than.
- `<` less than.
- `>=` greater than or equal to.
- `<=` less than or equal to.

#### Logical operators:

- `&&` logical and.
- `||` logical or.
- `!` logical not.
- `&` bitwise and.
- `|` bitwise or.
- `^` bitwise xor.
- `~` bitwise not.
- `<<` left shift.
- `>>` right shift.
- `>>>` zero fill right shift.

#### Assignment operators:

- `=` assignment.
- `+=` addition assignment.
- `-=` subtraction assignment.
- `*=` multiplication assignment.
- `/=` division assignment.
- `%=` modulus assignment.
- `<<=` left shift assignment.
- `>>=` right shift assignment.
- `&=` bitwise and assignment.
- `^=` bitwise exclusive or assignment.
- `|=` bitwise inclusive or assignment.
- `>>>=` zero fill right shift assignment.

#### Misc operators:

- `instanceof` checks if an object is an instance of a class.
- `.` member access operator.
- `[]` array access operator.
- `()` method invocation operator.
- `new` creates a new object.
- `::` method reference operator.
- `?` ternary operator.
- `:` ternary operator.
- `->` lambda operator.
- `...` variable arguments.
- `@` annotation operator.


### Control Statements

#### If statement:

this statement is used to test the condition. It executes the if block if condition is true.

```java
if(condition){
    // code to be executed...
}
```

#### If-else statement:

this statement is used to test the condition. It executes the if block if condition is true and else block if condition is false.

```java
if(condition){
    // code to be executed...
}else{
    // code to be executed...
}
```

#### If-else-if statement:

this statement is used to test the condition. It executes the if block if condition is true and else if block if condition is false.

```java
if(condition){
    // code to be executed...
}else if(condition){
    // code to be executed...
}else{
    // code to be executed...
}
```

#### Switch statement:

this statement is used to test the condition. It executes the case block if condition is true.

```java
switch(expression){
    case value1:
        // code to be executed...
        break;
    case value2:
        // code to be executed...
        break;
    default:
        // code to be executed...
}
```


### Loops

#### For loop:

```java
for(initialization; condition; increment/decrement){
    // code to be executed...
}
```

**Example**:

```java
for(int i = 0; i < 10; i++){
    System.out.print(i);
}
```

**output**:

```
0123456789
```

#### While loop:

```java
while(condition){
    // code to be executed...
}
```

**Example**:

```java
int i = 0;
while(i < 10){
    System.out.print(i);
    i++;
}
```

**output**:

```
0123456789
```

#### Do-while loop:

```java
do{
    // code to be executed...
}while(condition);
```

**Example**:

```java
int i = 0;
do{
    System.out.print(i);
    i++;
}while(i < 10);
```

**output**:

```
0123456789
```

### For-each loop:

```java
for(type name : array){
    // code to be executed...
}
```

**Example**:

```java
int[] numbers = {1, 2, 3, 4, 5};
for(int number : numbers){
    System.out.print(number);
}
```

**output**:

```
12345
```



### Arrays

#### Declaration:

```java
type[] name = new type[size];
```

#### Initialization:

```java
type[] name = {value1, value2, value3};
```

#### Accessing elements:

```java
name[index];
```

### Methods

#### Types of acsess modifiers:

- `public`: accessible from anywhere.
- `protected`: accessible within the package and outside the package through child class.
- `default`: accessible within the package.
- `private`: accessible within the class.

#### Declaration:

```java
access_modifier return_type method_name(parameter1, parameter2, ...){
    // code to be executed...
}
```

**Example**:

- **Function**:

```java
public static int increment(int number){
    return number + 1;
}
```

- **Method**:

```java
public static void hello(){
    System.out.println("Hello World!");
}
```


- **Call**:

```java
// function
variable = function_name(argument1, argument2, ...);

// method (function with no returned value)
function_name(argument1, argument2, ...);
```

**Example**:

```java
// function
int number = increment(5);

// method
hello();
```

## 2) Object-Oriented Programming

### Classes

A class is a blueprint for creating objects (a particular data structure), providing initial values for state (member variables or attributes), and implementations of behavior (member functions or methods).
for example, a class called Car can be used to manufacture many individual cars.

######
For a `Car` class, we have:
- `Attributes`: color, brand, model, year,speed, etc.
- `Methods`: start, accelerate, brake, etc.

#### Declaration:

```java
access_modifier class class_name{
    // code to be executed...
}
```

**Example**:

```java
public class Car{
    
    int speed;
    String color;
    String brand;
    String model;
    
    public void start(){
        // code to be executed...
    }
    public void accelerate(){
        // code to be executed...
        
    }
}
```

### Objects

An object is a software bundle of related state and behavior. Objects are often used to model the real-world objects that you find in everyday life.
#####
For example, `Mercedes` is an object of `Car` class. which have:
- `Attributes`: color = "black", brand = "Mercedes", model = "C200", year = 2019, speed = 0.
- `Methods`: start(), accelerate(), brake().

### instantiation

The process of creating an object from a class is called instantiation.

**Example**:

```java
Car car = new Car();
```

### Constructors

A constructor is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:

#### Declaration:

```java
access_modifier class_name(parameter1, parameter2, ...){
    // the name of the constructor must be the same as the name of the class
    
        public class_name(){
        this is a non-parameterized constructor
    }
    
    public class_name(parameter1, parameter2, ...){
        this is a parameterized constructor
    }
    
}
```

**Example**:

```java
public class Car{
    
    int speed;
    String color;
    String brand;
    String model;
    
    public Car(){
        System.out.printf("new car created");
    }
    
    public Car(int speed, String color, String brand, String model){
        this.brand = brand;
        this.color = color;
        this.model = model;
        this.speed = speed;
    }
}
```

**call**:

```java
Car car = new Car(); // for non-parameterized constructor
Car car = new Car(0, "black", "Mercedes", "C200"); // for parameterized constructor
```

### Inheritance

Inheritance is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system). It provides code reusability. It is used to achieve runtime polymorphism.

#### Types of inheritance:

- `Single inheritance`: A class can be derived from only one class.
- `Multilevel inheritance`: A class can be derived from more than one class.
- `Hierarchical inheritance`: A class can be derived from more than one class (but only one class can be the parent class).
- `Multiple inheritance`: A class can be derived from more than one class (not supported in java).
- `Hybrid inheritance`: A class can be derived from more than one class (not supported in java).

**Example**:

```java
class A{
    int a;
    
    public A(int a){
        System.out.print("New Object created...");
        this.a = a;
    }
    void display_a(){
        System.out.println(this.a);
    }
}
class B extends A{
    // all attributes and methods of A are inherited to B
}

class C extends B{ // (miltilevel inheritance)
    // all attributes and methods of A and B are inherited to C
}

A a = new A(2);
B b = new B(5);

a.display_a();
b.display_b();
```

**Output**:

```
New Object created...
2
New Object created...
5
```

### Polymorphism

Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.

#### Types of polymorphism:

- `Compile time polymorphism`: Method overloading.
- `Runtime polymorphism`: Method overriding.

#### Method overloading

Method overloading is a feature that allows a class to have more than one method having the same name, if their argument lists are different. It is similar to constructor overloading.

**Example**:

```java
class A{
    void display(int a){
        System.out.println(a);
    }
    void display(int a, int b){
        System.out.println(a + b);
    }
    void display(int a, int b, int c){
        System.out.println(a + b + c);
    }
}
```

#### Method overriding

Method overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature, and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.

**Example**:

```java
class A{
    void display(){
        System.out.println("New A");
    }
}
class B extends A{
    void display(){
        System.out.println("New B");
    }
}

A a = new A();
B b = new B();

a.display();
b.display();

```

**Output**:

```
New A
New B
```

### Encapsulation

Encapsulation is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.

#### Declaration:

```java
access_modifier class class_name{
    // code to be executed...
}
```

**Example**:

```java
public class Car{
    
    public int speed;
    private String color;
    protected String brand;
    protected String model;
    
    public void start(){
        // code to be executed...
    }
    public void accelerate(){
        // code to be executed...
        
    }
}
```

to access the private attributes and methods of a class, we can use `getter` and `setter` methods.

**Example**:

```java
public class Car{
    
    public int speed;
    private String color;
    protected String brand;
    protected String model;
    
    public void start(){
        // code to be executed...
    }
    public void accelerate(){
        // code to be executed...
        
    }
    
    // getter method
    public String getColor(){
        return this.color;
    }
    
    // setter method
    public void setColor(String color){
        this.color = color;
    }
}
```

### Abstraction

Abstraction is a process of hiding the implementation details and showing only functionality to the user. In other words, the user will have the information on what the object does instead of how it does it.

#### Declaration:

```java
abstract class class_name{
    
    public abstract void method_name1();
    public abstract void method_name2();
    // ...
}
```

**Example**:

```java
public abstract class Car{
    
    public abstract void start();
    public abstract void accelerate();
    public abstract void stop();
}
```

to use the abstract class, we have to create a subclass and implement the abstract methods.

**Example**:

```java
public class Mercedes extends Car{
    
    public void start(){
        // implementation of start method
    }
    public void accelerate(){
        // implementation of accelerate method
    }
    public void stop(){
        // implementation of stop method
    }
}
```

### Interface

An interface is a blueprint of a class. It has static constants and abstract methods. The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

#### Declaration:

```java
interface interface_name{
    // code to be executed...
}
```

**Example**:

```java
interface Car{
    void start();
    void accelerate();
    void stop();
}
```

to use the interface, we have to create a class and implement the interface.

**Example**:

```java
class Mercedes implements Car{
    
    public void start(){
        // implementation of start method
    }
    public void accelerate(){
        // implementation of accelerate method
    }
    public void stop(){
        // implementation of stop method
    }
}
```

### Packages

Packages are used in Java to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories:

- **Built-in Packages** (packages from the Java API)
- **User-defined Packages** (create your own packages)
- **Import Packages** (import packages to use them in your code)
- **Package Visibility** (public, protected, default, private)
- **Package Naming Conventions** (all small letters, no special characters, no numbers)
- **Package Declaration** ```package package_name;```
- **Package Access Modifier** (public, protected, default, private)

## Advanced

### Exceptions

An exception is an event, which occurs during the execution of a program, that disrupts the normal flow of the program's instructions.

#### Types of Exceptions:

- **Checked Exceptions**: Checked exceptions are checked at compile-time.
- **Unchecked Exceptions**: Unchecked exceptions are not checked at compile-time, but they might occur at runtime.
- **Error**: Errors are not exceptions at all, but problems that arise beyond the control of the user or the programmer.

to handle exceptions, we use `try-catch` blocks, and to throw exceptions, we use `throw` keyword, and to create our own exceptions, we use `throws` keyword.

#### Declaration:

```java
try{
    // code to be executed...
}
catch(Exception e){
    // code to be executed...
}
finally{
    // code to be executed...
}
```

**Example**:

```java 
try{
    int a = 10;
    int b = 0;
    int c = a / b;
}
catch(Exception e){
    System.out.println(e);
}
finally{
    System.out.println("Finally block");
}
```

**Output**:

```
java.lang.ArithmeticException: / by zero
Finally block
```

### Generics

Generics is a feature that allows us to use parameterized types. The idea behind generics is to allow type (Integer, String, … etc and user-defined types) to be a parameter to methods, classes and interfaces.

#### Declaration:

```java
class class_name<type>{
    // code to be executed...
}
```

**Example**:

```java
class Box<T>{
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
}
```

### Collections

Collections are containers that group multiple items into a single unit. Java provides several classes for implementing collections. The classes that implement collections are known as generic classes because they can work with different types of objects.

#### Types of Collections:

- **List**: An ordered collection (also known as a sequence). The user of this interface has precise control over where in the list each element is inserted. The user can access elements by their integer index (position in the list), and search for elements in the list.
- **Set**: A collection that contains no duplicate elements. More formally, sets contain no pair of elements e1 and e2 such that e1.equals(e2), and at most one null element. As implied by its name, this interface models the mathematical set abstraction.
- **Queue**: A collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations. Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special value (either null or false, depending on the operation). The latter form of the insert operation is designed specifically for use with capacity-restricted Queue implementations; in most implementations, insert operations cannot fail.
- **Map**: An object that maps keys to values. A map cannot contain duplicate keys; each key can map to at most one value.
- **Stack**: A last-in-first-out (LIFO) stack of objects. The usual push and pop operations are provided, as well as a method to peek at the top item on the stack, and a method to test for whether the stack is empty. When a stack is first created, it contains no items.
- **Vector**: A growable array of objects. Like an array, it contains components that can be accessed using an integer index. However, the size of a Vector can grow or shrink as needed to accommodate adding and removing items after the Vector has been created.

### Threads

A thread is a lightweight sub-process, the smallest unit of processing. Multiple threads can run concurrently within the same process. Each thread defines a separate path of execution.

#### Declaration:

```java
class class_name implements Runnable{
    // code to be executed...
}
```

**Example**:

```java
class ThreadDemo implements Runnable{
    private Thread t;
    private String threadName;
    ThreadDemo(String name){
        threadName = name;
        System.out.println("Creating " + threadName);
    }
    public void run(){
        System.out.println("Running " + threadName);
        try{
            for(int i = 4; i > 0; i--){
                System.out.println("Thread: " + threadName + ", " + i);
                Thread.sleep(50);
            }
        }
        catch(InterruptedException e){
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
```



### Lambda Expressions

Lambda expressions are used primarily to define inline implementation of a functional interface, i.e., an interface with a single method only. In the previous section, we have used anonymous inner class to override the abstract method of a functional interface. But, we can achieve this with lambda expression, which is more concise.

#### Declaration:

```java
(parameter_list) -> {body}
```

**Example**:

```java
interface Drawable{
    public void draw();
}
public class LambdaExpressionExample{
    public static void main(String[] args){
        int width = 10;
        Drawable d2 = () -> {
            System.out.println("Drawing " + width);
        };
        d2.draw();
    }
}
```

### Streams

A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result. Following are the characteristics of a Stream.

- **Sequence of elements**: A stream provides a set of elements of specific type in a sequential manner. A stream gets/computes elements on demand. It never stores the elements.
- **Source**: Stream takes Collections, Arrays, or I/O resources as input source.
- **Aggregate operations**: Stream supports aggregate operations like filter, map, limit, reduce, find, match, and so on.
- **Pipelining**: Most of the stream operations return stream itself so that their result can be pipelined. These operations are called intermediate operations and their function is to take input, process them, and return output to the target.
- **Automatic iterations**: Stream operations do the iterations internally over the source elements provided, in contrast to Collections where explicit iteration is required.
- **Internal Iterations**: Stream operations perform internal iterations over the source elements of the stream. Collection operations are externally iterated.
- **Laziness**: Stream operations are lazily executed which means their execution is deferred until required.
- **Parallelism**: Stream operations can be executed either sequentially or in parallel.
- **Infinite Stream**: Stream operations can be performed on infinite stream of elements.
- **Terminal Operations**: Terminal operations are either void or return a non-stream result. Collectors are used to return a non-stream result.

#### Declaration:

```java
Stream stream = Stream.of("a","b","c");
```

**Example**:

```java
List<String> list = Arrays.asList("a","b","c");
Stream<String> stream = list.stream();
stream.forEach(p -> System.out.println(p));
```

### Files

Java provides a File class to represent files and directories. The File class from the java.io package allows us to perform input and output (I/O) operations in Java. We can read and write data from files using the File class.

#### Declaration:

```java
File file = new File("file_name");
```

**Example**:

```java
File file = new File("file_name");
if(file.exists()){
    System.out.println("File name: " + file.getName());
    System.out.println("Absolute path: " + file.getAbsolutePath());
    System.out.println("Writeable: " + file.canWrite());
    System.out.println("Readable " + file.canRead());
    System.out.println("File size in bytes " + file.length());
}
else{
    System.out.println("The file does not exist.");
}
```

### Networking

Java provides a rich networking API that allows us to develop network applications. The java.net package contains all the classes required for networking.

#### Declaration:

```java
InetAddress address = InetAddress.getByName("host_name");
```

**Example**:

```java
InetAddress address = InetAddress.getByName("www.google.com");
System.out.println(address);
```

### GUI

Java provides a rich set of GUI components that can be used to develop graphical user interfaces. The java.awt and javax.swing packages contain all the classes required for GUI programming.

#### Import:

```java
import java.awt.*;
import javax.swing.*;
```

**Example**:

```java
import java.awt.*;
import javax.swing.*;
public class SwingExample{
    JFrame f;
    SwingExample(){
        f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new SwingExample();
    }
}
```

## 4) Resources

### Books

here are some books that you can read to learn Java:

- [Head First Java](https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208)
- [Java: The Complete Reference](https://www.amazon.com/Java-Complete-Reference-Herbert-Schildt/dp/0071808558)
- [Java: A Beginner's Guide](https://www.amazon.com/Java-Beginners-Herbert-Schildt/dp/0071809252)
- [Java: The Complete Reference, Eleventh Edition](https://www.amazon.com/Java-Complete-Reference-Herbert-Schildt/dp/1259589339)
- [Java: A Beginner's Guide, Seventh Edition](https://www.amazon.com/Java-Beginners-Herbert-Schildt/dp/1260440237)

### Websites

here is a website that you can visit to learn Java:

- [Java Tutorial](https://www.tutorialspoint.com/java/index.htm)

### YouTube Channels

here are some YouTube channels that you can follow to learn Java:

- [Programming with Mosh](https://www.youtube.com/channel/UCWv7vMbMWH4-V0ZXdmDpPBA)
- [Telusko](https://www.youtube.com/channel/UC59K-uG2A5ogwIrHw4bmlEg)
- [Java Brains](https://www.youtube.com/channel/UCY0xL8V6NzzFcwzHCgB8orQ)
- [Adel Nasim](https://www.youtube.com/watch?v=mNvJipMTKSM&list=PLCInYL3l2AajYlZGzU_LVrHdoouf8W6ZN)
- [Java-Course](https://www.youtube.com/watch?v=_l4pJ7HCrl4&list=PLrSOXFDHBtfHkq8dd3BbSaopVgRSYtgPv)

### Online Courses

here are some online courses that you can take to learn Java:

- [Java Programming: Solving Problems with Software](https://www.coursera.org/learn/java-programming)
- [Java Programming: Arrays, Lists, and Structured Data](https://www.coursera.org/learn/java-programming-arrays-lists-data)
- [Java Programming: Principles of Software Design](https://www.coursera.org/learn/java-programming-design-principles)
- [Java Programming: Build a Recommendation System](https://www.coursera.org/learn/java-programming-recommender)
- [Java Programming: Solving Problems with Software](https://www.coursera.org/learn/java-programming)

### Online Tutorials

here are some online tutorials that you can follow to learn Java:

- [Java Tutorial](https://www.tutorialspoint.com/java/index.htm)
- [Java Tutorial](https://www.javatpoint.com/java-tutorial)
- [Java Tutorial](https://www.geeksforgeeks.org/java-tutorial/)
- [Java Tutorial](https://www.javatpoint.com/java-tutorial)


## Conclusion


Java is a general-purpose programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible. It is a computing platform for application development. The compilation of the Java source code results in the bytecode that can run on any Java virtual machine (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++, but it has fewer low-level facilities than either of them. Java was originally developed by James Gosling at Sun Microsystems (which has since been acquired by Oracle) and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin for applets). Oracle has also released its own implementation of Java, which is used in Oracle's Java platform products. Java was originally designed for developing programs for set-top boxes and handheld devices, but it was not until the release of the Java 2 platform, Standard Edition (J2SE) in 1998 that Java became popular for writing desktop applications. Since then, Java has become one of the most popular programming languages in use, particularly for client-server web applications, with a reported 9 million developers. Java was originally developed by James Gosling at Sun Microsystems and released in 1995 as a core component of Sun Microsystems' Java platform. The language derives much of its syntax from C and C++, but it has fewer low-level facilities than either of them. The original and reference implementation Java compilers, virtual machines, and class libraries were originally released by Sun under proprietary licenses. As of May 2007, in compliance with the specifications of the Java Community Process, Sun had relicensed most of its Java technologies under the GNU General Public License. Others have also developed alternative implementations of these Sun technologies, such as the GNU Compiler for Java (bytecode compiler), GNU Classpath (standard libraries), and IcedTea-Web (browser plugin


## About me

please read my [README.md](https://github.com/yassermessahli) file to know more about me.

## Contact

if you have any questions, please contact me on: 
- [LinkedIn](https://www.linkedin.com/in/yassermessahli)
- [Twitter](https://twitter.com/yassermessahli)
- [Instagram](https://www.instagram.com/_ya6r/)
- [github](https://github.com/yassermessahli)

