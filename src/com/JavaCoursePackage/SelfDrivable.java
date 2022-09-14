package com.JavaCoursePackage;

public interface SelfDrivable{  // interface is a class that contains only abstract methods, which have nobody.

    int fuel = 50;  // interface variables are final by default.
    int maxSpeed = 100;
    String zone = "Algeria";

    boolean atteint_destination();
    void move();                // abstract methods: to be implemented.
    boolean is_safe();
    default void stop(){        // default methods: already implemented, but can be overridden.
        System.out.println("stop");
    }
    static void start(){        // static methods: already implemented, but can't be overridden.
        System.out.println("start");
    }

    interface SelfDrivable2{    // nested interface.
        boolean alert();
    }

    interface MarkerInterface{  // marker interface: an interface with no methods.
    }

    interface GenericInterface<T>{  // generic interface.
        public T get();
    }

    interface enum_interface{   // enum interface.
        public String getSound();
    }

}
