package com.JavaCoursePackage;
////    imports:
//
//
import java.nio.charset.StandardCharsets;
import java.util.*;

import static java.lang.Integer.parseInt;

//
public class OOP_section{
//
    public static void main(String[] args){
//
////        setup input method from Scanner class:
        Scanner input = new Scanner(System.in);

//        New Instance/Object:
        Classes myCar = new Classes();

//        myCar attributes:
        myCar.name = "ferrari";
        myCar.maxSpeed = 950;
        myCar.model = 2022;
        myCar.setPrice(2500000);


//        print myCar attributes:
        System.out.printf(myCar.toString());

//        New Instance with initial values:
        Classes myCar2 = new Classes("BMW", 500, 1000000, 2021);

//        print myCar2 attributes:
        System.out.printf(myCar2.toString());


//        myCar Methods (example):
        boolean isSport = myCar2.isSportCar();
        System.out.printf("is sport car: %b\n", isSport);

        System.out.print("enter new price: ");
        myCar2.setPrice(input.nextFloat());

        System.out.printf("new price: %.2f$", myCar2.getPrice());

//        New Instance with copy constructor:
        Classes car3copy = new Classes(myCar2);
        System.out.printf(car3copy.toString());

        Classes.printNumberOfCars();

//        nested class example:
        Classes.gearBox gearBox1 = new Classes.gearBox(5);
        gearBox1.printNumberOfGears();


//        passing class as a parameter:
        Classes.ArgumentClass obj1 = new Classes.ArgumentClass();
        obj1.x = 5;
        Classes.increment(obj1);
        System.out.printf("x after being incremented: %d", obj1.x);



        Classes.ArgumentClass obj2 = new Classes.ArgumentClass();
        obj2.x = 10;

//        return an object from a method:
        Classes.ArgumentClass obj3 = Classes.add(obj1, obj2);
        System.out.printf("\nobj3.x = %d", obj3.x);

//      upcasting: (casting a child class to a parent class)
        Classes.Class1 myObj = new Classes.Class1();
        myObj.print();
//        casting:
        myObj = new Classes.Class2();
        myObj.print();


//      polymorphic array: (an array of objects with different types)
        Classes.Class1[] myArray = new Classes.Class1[2];
        myArray[0] = new Classes.Class1();
        myArray[1] = new
                Classes.Class2();
        for (Classes.Class1 obj : myArray) {
            obj.print();
        }



//      ArrayList: (dynamic array)

//         declaration:
        ArrayList<Integer> list = new ArrayList<Integer>(); // the length of the array is by default 10, but the size is 0
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 90, 8, 9, 10)); // initialize the list with values of type int
        ArrayList list3 = new ArrayList(Arrays.asList(1, "hello", 3.14, 'A', true)); // can add different types of elements, if the type is not specified


//         some methods:

        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // initialize the list with elements
        list.add(12); // add an element 12 to the array, in the first empty cell
        list.size(); // return the length of the array
        list.get(0); // return the element in the index 0
        list.remove(0); // remove the element in the index 0
        list.clear(); // remove all the elements from the array
        list.contains(12); // return true if the array contains the element 12
        list.indexOf(12); // return the first index of the element 12
        list.lastIndexOf(12); // return the last index of the element 12
        list.set(0, 12); // set the element in the index 0 to be 12
        list.isEmpty(); // return true if the array is empty
        list.toArray(); // return an array of the elements in the ArrayList
        list.addAll(list2); // add all the elements from list2 to list
        list.remove(0); // remove the element in the index 0
        list.removeIf(i-> i>5); // remove all the elements that are bigger than 5 (using lambda expression)
        list.sort((i1, i2)-> i1.compareTo(i2)); // sort the array (using lambda expression)
        list.removeAll(list2); // remove all the elements from list that are in list2
        list.retainAll(list2); // remove all the elements from list that are not in list
        list.subList(0, 5); // return a sub list of the elements from index 0 to index 5
        list.iterator(); // return an iterator of the elements in the array
        list.listIterator(); // return a list iterator of the elements in the array
        list.listIterator(5); // return a list iterator of the elements in the array, starting from index 5
        list.equals(list2); // return true if the two arrays are equal
        list.hashCode(); // return the hash code of the array
        list.toString(); // return a string of the elements in the array


//          anonymous inner class: (c class without name)
        Classes.NewClasss object = new Classes.NewClasss() {
            @Override
            public void move() {
                System.out.println("anonymous inner class");
            }
        };
        object.move();


//          var keyword: (the type of the variable is determined by the value)
        var x = 5; System.out.println(x + " is of type: " + ((Object)x).getClass().getSimpleName());
        var y = "hello"; System.out.println(y + " is of type: " + ((Object)y).getClass().getSimpleName());
        var z = 3.14; System.out.println(z + " is of type: " + ((Object)z).getClass().getSimpleName());



//        enums: (enumeration, a special "class" that represents a group of constants, as a data type)

        enum Color { // simple enum
            RED, GREEN, BLUE, YELLOW, BLACK, WHITE, PINK, ORANGE, PURPLE, BROWN, GRAY, GOLD, SILVER
        }

        enum Days { // enum with constructor
            SUNDAY("weekend"), MONDAY("workday"), TUESDAY("workday"), WEDNESDAY("workday"), THURSDAY("workday"), FRIDAY("workday"), SATURDAY("weekend");

            private final String type;

            Days(String typeOfDay) {
                this.type = typeOfDay;
            }

            public String dayOf() {
                return type;
            }
        }

        enum Months { // enum with methods
            JANUARY(31), FEBRUARY(28), MARCH(31), APRIL(30), MAY(31), JUNE(30), JULY(31), AUGUST(31), SEPTEMBER(30), OCTOBER(31), NOVEMBER(30), DECEMBER(31);

            private final int days;

            Months(int daysInMonth) {
                this.days = daysInMonth;
            }

            public int getDays() {
                return days;
            }
        }

        enum Animals implements SelfDrivable.enum_interface{ // enum implements an interface
            DOG("barks"), CAT("meows"), COW("moos"), HORSE("neighs"), CHICKEN("clucks");

            private final String sound;

            Animals(String soundOfAnimal) {
                this.sound = soundOfAnimal;
            }

            public String getSound() {
                return this.sound;
            }
        }

        enum Cars { // enum with abstract method
            BMW("BMW"){ // anonymous inner class (implements the abstract method type())
                @Override
                public String type() {
                    return "Sport Car";
                }
            },MERCEDES("Mercedes"){ // anonymous inner class (implements the abstract method type())
                @Override
                public String  type() {
                    return "Luxury Car";
                }
            };

            private final String type;
            Cars(String type) { // constructor
                this.type = type;
            }

            abstract String type(); // abstract method
        }

        enum Planets { // enum with static method
            MERCURY(3.303e+23, 2.4397e6), VENUS(4.869e+24, 6.0518e6), EARTH(5.976e+24, 6.37814e6);

            private final double mass; // in kilograms
            private final double radius; // in meters
            private static final double G = 6.67300E-11;

            Planets(double mass, double radius) {
                this.mass = mass;
                this.radius = radius;
            }

            public double surfaceGravity() {
                return G * mass / (radius * radius);
            }

            public static double surfaceWeight(Planets p, double otherMass) {
                return otherMass * p.surfaceGravity();
            }
        }





//        EnumSet: (a specialized Set implementation for use with enum types)

        EnumSet<Months> month = EnumSet.of(Months.APRIL, Months.DECEMBER); // create an EnumSet with the elements APRIL and DECEMBER
        EnumSet<Months> month = EnumSet.allOf(Months.class); // create an EnumSet with all the elements of the enum Months
        EnumSet<Months> month = EnumSet.noneOf(Months.class); // create an empty EnumSet
        EnumSet<Months> month = EnumSet.range(Months.APRIL, Months.SEPTEMBER); // create an EnumSet with the elements from APRIL to DECEMBER
        EnumSet<Months> month = EnumSet.complementOf(EnumSet.range(Months.APRIL, Months.SEPTEMBER)); // create an EnumSet with all the elements except APRIL to DECEMBER

//        some methods in EnumSet:
        month.add(Months.JANUARY); // add JANUARY to the EnumSet
        month.remove(Months.JANUARY); // remove JANUARY from the EnumSet
        month.contains(Months.JANUARY); // return true if the EnumSet contains JANUARY
        month.size(); // return the size of the EnumSet
        month.isEmpty(); // return true if the EnumSet is empty
        month.clear(); // clear the EnumSet
        month.clone(); // return a copy of the EnumSet
        month.equals(month); // return true if the two EnumSets are equal


//        Exception handling: (try, catch, finally, throw, throws)

        try{ // (try to execute the code in the try block, if an exception is thrown, the code in the catch block will be executed)
            int x = 5/0;
        }catch (Exception e){ // catch the exception (e is the exception object)
            System.out.println("Exception: " + e);
        } // the code execution will continue after the catch block


        try{ // try with multiple catch blocks
            int x = 5/0;
        }catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e);
        }catch (ArrayStoreException e) {
            System.out.println("Exception: " + e);
        } // the code execution will continue after the catch block


        try{ // try with return statement (the code execution will end after the return statement)
            int x = 5/0;
        }catch (Exception e){ // catch the exception (e is the exception object)
            System.out.println("code execution ended with exception: " + e);
            return;
        }

        try{ // try with finally (the final block will always be executed, even if an exception is thrown)
            int x = 5/0;
        }catch (Exception e) {
            System.out.printf("Exception: %s\n", e);
            return;
        }finally {
            System.out.println("finally block executed");
        }

//        throws: (used to declare an exception, the method that throws an exception must be surrounded by a try-catch block or the method must be declared with the throws keyword)
        public static float method(int n) throws ArithmeticException, ArrayStoreException {
            return  5/n;
        }

//        we can also use try and catch with errors
        try{
            while (true)
                System.out.println("Hello");
        }catch (Error e){  // stackOverFlowError
            System.out.println("Error: " + e);
        }

//        throw: (used to throw an exception, the exception is an object from an exception class, and we can create our own exception class)
        System.out.print("enter a number: ");
        int n = input.nextInt();
        if (n == 0)
            throw new ArithmeticException("n cannot be 0"); // throw an exception (as raise in python)
        else
            System.out.println((float) 5/n);


//        and we can create our own exception class
        System.out.print("enter a number: ");
        int n = input.nextInt();
        if (n == 0)
            throw new Classes.MyException("n cannot be 0"); // throw an exception (as raise in python)
        else
            System.out.println((float) 5/n);




        String text = """
                ali ahmad 16 yo 02342343423
                ahmad ali 17 yo 02342343423
                rayan mohamed 18 yo 02342343423
                kamal ali 19 yo 02342343423
                """;

        for(String line : text.split("\n")){
            String[] spl = line.split(" ");
            System.out.print("=========================\n");
            System.out.printf("""
                    first name: %s
                    last name: %s
                    age: %s %s
                    number: %s\n
                    """, spl[0], spl[1], spl[2], spl[3], spl[4]);
        }










    }
}
