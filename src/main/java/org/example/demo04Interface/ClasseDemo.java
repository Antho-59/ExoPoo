package org.example.demo04Interface;

public class ClasseDemo implements DemoBaseInterface {
    @Override
    public int giveMeANumber() {
        return 54;
    }

    @Override
    public void direBonjour(String nom) {
        System.out.println("Salut "+nom);
    }
}
