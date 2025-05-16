package org.example.demo04Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        ClasseDemo classeDemo = new ClasseDemo();
//        ClassDemo2 classDemo2 = new ClassDemo2();
//
//
//      //  ClassDemo2[] classesDemos = {classeDemo , classDemo2};
//        DemoBaseInterface[] demoBaseInterfaces= {classeDemo , classDemo2};


//        IMessage message = new EnglishMessage();
//
//        message.okMessage();
//        message.warningMessage();
//        message.errorMessage();


        IMessage message;
        Scanner scanner = new Scanner(System.in);
        System.out.println("taper 1 pour fr - taper 2 pour En");
        int choix = scanner.nextInt();
        if (choix == 1){
            message = new MessageV1();
        }else{
            message = new EnglishMessage();
        }

        message.okMessage();
        message.warningMessage();
        message.errorMessage();

    }
}
