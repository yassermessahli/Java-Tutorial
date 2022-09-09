package com.JavaCoursePackage;
////    imports:
//
//
import java.util.*;

//
public class OOP_section{
//
    public static void main(String[] args){
//
////        setup input method from Scanner class:
        Scanner input = new Scanner(System.in);
//
////        New Instance/Object:
//        Classes myCar = new Classes();
//
////        myCar attributes:
//        myCar.name = "ferrari";
//        myCar.maxSpeed = 950;
//        myCar.model = 2022;
//        myCar.setPrice(2500000);
//
//
////        print myCar attributes:
//        System.out.printf(myCar.toString());
//
////        New Instance with initial values:
//        Classes myCar2 = new Classes("BMW", 500, 1000000, 2021);
//
////        print myCar2 attributes:
//        System.out.printf(myCar2.toString());
//
//
////        myCar Methods (example):
//        boolean isSport = myCar2.isSportCar();
//        System.out.printf("is sport car: %b\n", isSport);
//
//        System.out.print("enter new price: ");
//        myCar2.setPrice(input.nextFloat());
//
//        System.out.printf("new price: %.2f$", myCar2.getPrice());
//
////        New Instance with copy constructor:
//        Classes car3copy = new Classes(myCar2);
//        System.out.printf(car3copy.toString());
//
//        Classes.printNumberOfCars();
//
////        nested class example:
//        Classes.gearBox gearBox1 = new Classes.gearBox(5);
//        gearBox1.printNumberOfGears();
//
//
////        passing class as a parameter:
//        Classes.ArgumentClass obj1 = new Classes.ArgumentClass();
//        obj1.x = 5;
//        Classes.increment(obj1);
//        System.out.printf("x after being incremented: %d", obj1.x);
//
//
//
//        Classes.ArgumentClass obj2 = new Classes.ArgumentClass();
//        obj2.x = 10;
//
////        return an object from a method:
//        Classes.ArgumentClass obj3 = Classes.add(obj1, obj2);
//        System.out.printf("\nobj3.x = %d", obj3.x);
//
////      upcasting: (casting a child class to a parent class)
//        Classes.Class1 myObj = new Classes.Class1();
//        myObj.print();
////        casting:
//        myObj = new Classes.Class2();
//        myObj.print();
//
//
////      polymorphic array: (an array of objects with different types)
//        Classes.Class1[] myArray = new Classes.Class1[2];
//        myArray[0] = new Classes.Class1();
//        myArray[1] = new
//                Classes.Class2();
//        for (Classes.Class1 obj : myArray) {
//            obj.print();
//        }
//


//      ArrayList: (dynamic array)

        // declaration:
        ArrayList<Integer> list = new ArrayList<Integer>(); // the length of the array is by default 10, but the size is 0
        ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 90, 8, 9, 10)); // initialize the list with values of type int
        ArrayList list3 = new ArrayList(Arrays.asList(1, "hello", 3.14, 'A', true)); // can add different types of elements, if the type is not specified


        // some methods:

//        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)); // initialize the list with elements
//        list.add(12); // add an element 12 to the array, in the first empty cell
//        list.size(); // return the length of the array
//        list.get(0); // return the element in the index 0
//        list.remove(0); // remove the element in the index 0
//        list.clear(); // remove all the elements from the array
//        list.contains(12); // return true if the array contains the element 12
//        list.indexOf(12); // return the first index of the element 12
//        list.lastIndexOf(12); // return the last index of the element 12
//        list.set(0, 12); // set the element in the index 0 to be 12
//        list.isEmpty(); // return true if the array is empty
//        list.toArray(); // return an array of the elements in the ArrayList
//        list.addAll(list2); // add all the elements from list2 to list
//        list.remove(0); // remove the element in the index 0
//        list.removeIf(i-> i>5); // remove all the elements that are bigger than 5 (using lambda expression)
//        list.sort((i1, i2)-> i1.compareTo(i2)); // sort the array (using lambda expression)
//        list.removeAll(list2); // remove all the elements from list that are in list2
//        list.retainAll(list2); // remove all the elements from list that are not in list
//        list.subList(0, 5); // return a sub list of the elements from index 0 to index 5
//        list.iterator(); // return an iterator of the elements in the array
//        list.listIterator(); // return a list iterator of the elements in the array
//        list.listIterator(5); // return a list iterator of the elements in the array, starting from index 5
//        list.equals(list2); // return true if the two arrays are equal
//        list.hashCode(); // return the hash code of the array
//        list.toString(); // return a string of the elements in the array










    }
}
