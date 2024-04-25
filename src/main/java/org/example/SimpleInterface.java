package org.example;


public interface SimpleInterface {

    void show();
    void get();

    default void AddNumber(){

    }
    static Integer getNumber(Integer number){
        return number;
    }
}
