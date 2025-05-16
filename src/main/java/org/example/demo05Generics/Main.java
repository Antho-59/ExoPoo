package org.example.demo05Generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Boite<String> boite = new Boite<>();
        boite.setContenu("coucou");

        System.out.println(boite.getContenu());

        Boite<Chat> chatBoite = new Boite<>();

        chatBoite.setContenu(new Chat(9,"toto"));

        System.out.println(chatBoite.getContenu());

        List<Chat> maListeDeChats = new ArrayList<>();

        List<String> list = new ArrayList<>();
        List<String> list1 = new LinkedList<>();

    }
}
