package com.JavaCoursePackage;


//import some packages: (libraries)
import java.util.ArrayList;


public class Classes {

    //    properties/attributes/datas/fields:
    public String name; //public attribute: any class can use it
    int maxSpeed;  //default attribute: only the classes of JavaCoursePackage can use it
    private float price; //private attribute: only this class can use it
    protected int model; //protected attribute: only the classes of JavaCoursePackage and subclasses can use it
    static int numberOfWheels = 4; //static attribute: only one copy of this attribute for all instances of this class
    static int numberOfCars = 0;

    //    constructors:
//      we can use overloading to create many constructor types, such as:

    //1) default constructor: used when no constructor is defined

    public Classes(){  //2) no-arguments constructor: used when no arguments are passed to the constructor

        numberOfCars++;
        System.out.print("---------------\n");
        System.out.printf("\nNew Classes created (No%d)\n", numberOfCars);

        this.name = "default name";
        this.maxSpeed = 0;
        this.price = 0;
        this.model = 1999;

    }

    public Classes(String name, int maxSpeed, float price, int model){  //3) constructor with arguments: (as __init__ in python):

        numberOfCars++;
        System.out.print("---------------\n");
        System.out.printf("\nNew Classes created (No%d)\n", numberOfCars);

        this.name = name;
        this.maxSpeed = maxSpeed;
        this.price = price;
        this.model = model;

    }

    public Classes(Classes Obj){ //
        // 4) copy constructor: used to copy an object to another object

        numberOfCars++;
        System.out.print("---------------\n");
        System.out.printf("\nNew Classes created (No%d)\n", numberOfCars);

        this.name = Obj.name;
        this.maxSpeed = Obj.maxSpeed;
        this.price = Obj.price;
        this.model = Obj.model;

        //or we can use this() to copy all the attributes of the object in a single line:
        //this(Obj.name, Obj.maxSpeed, Obj.price, Obj.model);
    }


//    Methods/Behaviors/Actions/Functions:
    boolean isSportCar(){
        return maxSpeed > 500;
    }


//    Setter method:
    void setPrice(float price){
        if(price > 0)
            this.price = price;
    }
//    Getter method:
    float getPrice(){
        return this.price;
    }

//    toString method (overrided from Object class):
    @Override
    public String toString() {
        return """
                Name: %s
                MaxSpeed: %d
                Model: %d
                Price: %.2f$
                """.formatted(this.name, this.maxSpeed, this.model, this.getPrice());
    }

//  static method: (can be called without creating an instance of the class)
    static void printNumberOfCars(){
        System.out.printf("number of cars: %d\nnumber of wheels: %d\n", Classes.numberOfCars, Classes.numberOfWheels);
    }


    static public class gearBox{ //inner static class: can be used only in Classes class (nested class)
        public int numberOfGears;

        public gearBox(int numberOfGears) {
            this.numberOfGears = numberOfGears;
        }
        public void printNumberOfGears(){
            System.out.printf("number of gears: %d\n", this.numberOfGears);
        }
    }

//    passing a class as an argument:
    static public class ArgumentClass{
        public int x;
    }

    static public void increment(ArgumentClass obj) {
        obj.x++;
    }

//    return an object from a method:
    static public ArgumentClass add(ArgumentClass obj1, ArgumentClass obj2) {
        ArgumentClass obj3 = new ArgumentClass();
        obj3.x = obj1.x + obj2.x;
        return obj3;
    }

//    comparison between two objects:
    static public boolean isEquals(ArgumentClass obj1, ArgumentClass obj2) {
        return obj1.x == obj2.x;
    }


//    inheritance: (IS-A relationship)

//      Base class: (super class)
    static public class BaseClass{  // this is the base class
        private int x;

        public BaseClass(int x) {
            this.x = x;
        }
        public void setter(int x){
            this.x = x;
        }
        public int getter(){
            return this.x;
        }
    }

//  1) Simple inheritance: (derived class inherits from base class)
    static public class DerivedClass extends BaseClass{  //    Derived class: (sub class)

    protected float y;

        public DerivedClass(int x, float y){
            super(x);
        }
    }

//    2) Multilevel inheritance: (derived class can be a base class for another derived class)
    static public class DerivedClass2 extends DerivedClass{

        public int z;

        public DerivedClass2(int x, float y){
            super(x, y);
        }
    }

//    3) Hierarchical inheritance: (multiple derived classes can inherit from the same base class)
    static public class DerivedClass3 extends BaseClass{

        public int a;

        public DerivedClass3(int x){
            super(x);
        }
    }

    static public class DerivedClass4 extends BaseClass{

        public int a;

        public DerivedClass4(int x){
            super(x);
        }
    }

//  note: all the classes in java are derived from Object class (built-in class in Java)
//  so we can use all the methods of Object class in our classes (such as toString(), equals(), hashCode(), etc..)



//    Polymorphism: (same method name with different implementations)
    static public class Class1{
        public void print(){
            System.out.println("Class1");
        }
    }
//    1) Method overriding: (overriding a method of the base class in the derived class)
    static public class Class2 extends Class1{
        @Override
        public void print(){
            System.out.println("Class2");
        }
    }
//  2) Method overloading: (using the same method name with different arguments)
    static public class Class3{
        public void print(int x){
            System.out.println("x = " + x);
        }
    }


//  types of relationships between classes: (IS-A, HAS-A, USES-A, etc..)

    static public class PersInfo{ // personal information class
        String name;
        int age;
        String address;
        public PersInfo(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

//  1) IS-A relationship: (inheritance)
//      (already explained above)

//  2) USES-A relationship: (aggregation) (a class within another class, but the inner class can be used independently)
    static public class Depart{  // department class
        String name;
        Employee1 manager;

        public Depart(String name, Employee1 manager) { // create an instance of manager class outside this class then just use it
            this.name = name;
            this.manager = manager;
        }
    }

//  3) PART-OF relationship: (composition) (a class within another class, and the inner class can't be used independently)
    static public class Employee1{ // employee class
        int salary;
        PersInfo information;

        public Employee1(int salary, String name, int age, String address) {
            this.salary = salary;
            this.information = new PersInfo(name, age, address); // creating an instance inside another instance
        }
    }


//  4) USES-A relationship: (association) (a class uses an attribute of another class)
    public static class Employee2{
        int salary;
        String name;
        int age;
        String address;

        public Employee2(int salary, PersInfo info) { // just call an instance of PersInfo class to use its attributes directly
            this.salary = salary;
            this.name = info.name;
            this.age = info.age;
            this.address = info.address;
        }
    }



//  final keywords: (constant variable, final method, final class)

    // 1) final variable: (constant variable)
    static final int ID = 210538792;

    // 2) final parameters: (can't be changed inside the method)
    static public int increment(final int x){
        return x+1;
    }

    // 3) final method: (can't be overridden in the derived class)
    static public class BaseClass2{
        final public void print(){
            System.out.println("BaseClass2");
        }
    }

    // 4) final class: (can't be inherited)
    final static public class FinalClass{
        int i=0;
        public void setter(int i){
            this.i = i;
        }
    }

    // 5) final reference: (can't be changed to point to another object)
    final FinalClass finalObj = new FinalClass();


//  abstract keywords: (abstract method, abstract class)

//    abstract class: (can't be instantiated, can only be inherited) (full abstraction)
    abstract static public class AbstractClass{
        int i=0;
        float f=0;

        public AbstractClass(int i, float f) {
            this.i = i;
            this.f = f;
        }
        abstract public void print(); // abstract method
        abstract public float add();
        abstract public void sub();
    }

//    abstract class : (partial abstraction)
    abstract static public class AbstractClass2{
        int i=0;
        float f=0;

        public void print(){ // concrete method
            System.out.println("AbstractClass2");
        }
        abstract public float add();
        abstract public void sub();
    }


//    concrete class from abstract class: (must implement all the abstract methods)
     public static class NewClass extends AbstractClass{
        public NewClass(int i, float f) { //the constructor of the base class must be called
            super(i, f);
        }
        @Override
        public void print(){
            System.out.print("i = " + i+2);
        }
        @Override
        public float add(){
            return this.i + this.f;
        }
        @Override
        public void sub() {
            this.i -= 1;
        }
    }


//    interface: (can't be instantiated, can only be inherited) (full abstraction)
//    all the methods in an interface are abstract by default, and all the variables are final by default

    public static class NewClasss implements SelfDrivable{
        @Override
        public void move(){
            System.out.println("NewClasss");
        }
        @Override
        public boolean atteint_destination(){
            return true;
        }
        @Override
        public boolean is_safe(){
            return true;
        }
    }


//    public static class NewClass2 implements Interface1, Interface2{ // multiple inheritance (implementing multiple interfaces)
//        @Override
//        public void print() {
//            System.out.println("NewClass2");
//        }
//        @Override
//        public void print2() {
//            System.out.println("NewClass2");
//        }
//    }

//    public static class NewClass3 extends Class1 implements Interface1{ // multiple inheritance (extend a class and implement an interface)
//        @Override
//        public void print() {
//            System.out.println("NewClass3");
//        }
//    }

//    public static class NewClass4 implements Interface1.Interface2{ // implementing an inner interface
//        @Override
//        public void print() {
//            System.out.println("NewClass4");
//        }
//    }

    public static class NewClass5 implements SelfDrivable.MarkerInterface{ // implementing a marker interface
        //can be empty
    }

    public static class NewClass6 <T> implements SelfDrivable.GenericInterface <T> { // implementing a generic interface
        @Override
        public T get(){
            return (T) new NewClass5();
        }
    }

    public static class MyException extends RuntimeException{

        public MyException(String ex){
            super(ex);
        }
    }














}