package org.example;



public class Main {
    // Java 8 UP
    /* Java Functional Interface */
    /*
    *  Interface :
    * - can have body by using : default or static before return type of function
    * - why interface need body :
    * - functional interface is a interface method that has only one abstract method (SAM : Single Abstract Method)
    * - @FunctionalInterface annotation helper provide by java 8
    * - interface can't create object but
    *   + can reference to it is implementation
    *   + implement with anonymous class
    *   + lambda expression
    * */
    public static void main(String[] args) {

        // with Implement Class
        AddNumber addNumber = new AddNumberImpl();
        int add = addNumber.add(100);
        System.out.println(add);
        System.out.println("--------------------------------");

        // implement with anonymous class
        AddNumber anonymous = new AddNumber() {
            @Override
            public int add(int number) {
                return number + 200;
            }
        };
        int add2 = anonymous.add(100);
        System.out.println(add2);
        System.out.println("--------------------------------");

        // implement with lambda expression
        AddNumber lambda = (int n) -> n + 300;
        int add3 = lambda.add(100);
        System.out.println(add3);

    }
}