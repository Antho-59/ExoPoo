package org.example.demo06List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //syntaxe pour la collection List -- on peut mettre ce quon veut a la place de String

        List<String> prenoms = new ArrayList<>();

      //  List<Double>  // tjr une liste objet => pour les primitifs on utilise les classes wrapper

        // la méthode add() pour add des elements
        prenoms.add("toto");
        prenoms.add("tutu");
        prenoms.add("taz");

        // la methode get pour acceder a un element par son indice

        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(1));
        System.out.println(prenoms.get(2));

        // la methode set qui permet de modif un elmt a son index precis
        prenoms.set(2,"tyty");
        System.out.println(prenoms.get(2));

        // la methode remove permet de supr

        prenoms.remove(0);
        System.out.println(prenoms);

        // la methode size() qui êrmet de retourner la taille de la liste
        System.out.println(prenoms.size());

        //parcourir avc la boucle for each
        for (String p : prenoms){
            System.out.println(p.toUpperCase());
        }

        // parcourir avec la boucle for
        for (int i = 0; i < prenoms.size(); i++){
            System.out.println(prenoms.get(i));
        }

    }
}
