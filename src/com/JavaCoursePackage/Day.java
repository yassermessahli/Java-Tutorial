package com.JavaCoursePackage;

//  enum: (enumeration: a special class that represents a group of constants, as a set of predefined data types)

//public enum Day {  // simple enum.
//    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
//}

public enum Day{  // enum with constructor.
    SUNDAY("weekend"), MONDAY("weekday"), TUESDAY("weekday"), WEDNESDAY("weekday"), THURSDAY("weekday"), FRIDAY("weekend"), SATURDAY("weekend");

    private final String type;

    Day(String type){
        this.type = type;
    }

    public String dayOf(){
        return this.type;
    }
}