package org.example.demo04Interface;

public class MessageV1 implements IMessage{
    @Override
    public void okMessage() {
        System.out.println("Tout est ok");
    }

    @Override
    public void warningMessage() {
        System.out.println("Attention nous avons un problème");
    }

    @Override
    public void errorMessage() {
        System.out.println("Attention nous avons une erreur");
    }
}
