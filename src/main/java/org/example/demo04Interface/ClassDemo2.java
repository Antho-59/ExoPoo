package org.example.demo04Interface;

public class ClassDemo2 implements DemoBaseInterface{
    @Override
    public int giveMeANumber() {
        return 999;
    }

    @Override
    public void direBonjour(String nom) {
        System.out.println("Hello "+nom);

    }
}
