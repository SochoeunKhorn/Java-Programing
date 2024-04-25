package org.example;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    // SAM : single abstract method
    // have only method interface
    // method interface is method no body
    void show();
    default void get(){
        System.out.println("get");
    }
    static String getName(String name){
        return name;
    }
}
