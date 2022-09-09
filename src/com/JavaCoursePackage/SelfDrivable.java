package com.JavaCoursePackage;

public interface SelfDrivable{  // interface is a class that contains only abstract methods, which have nobody.
    void destination(String Dest);
    void move();                // abstract methods: to be implemented.
    void stop();
    void left_turn();
    void right_turn();
    boolean is_safe();
}
