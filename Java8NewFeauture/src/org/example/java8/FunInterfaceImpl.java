package org.example.java8;

public class FunInterfaceImpl {
    public static void main(String[] args) {
        SimpleInterface simpleInterface = () -> System.out.println("Say Something");
        simpleInterface.doSomething();
    }
}
