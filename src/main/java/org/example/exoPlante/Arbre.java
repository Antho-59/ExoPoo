package org.example.exoPlante;

public class Arbre extends Plante {
    private int circonference;
    public Arbre(String nom, int hauteur, String couleurFeuilles, int circonference) {
        super(nom, hauteur, couleurFeuilles);
        this.circonference = circonference;
    }

    public void info(){
        System.out.println("c'est un(e) "+nom+" de "+hauteur+" cm de hauteur et avec les feuilles "+couleurFeuilles+
                " et une circonference de "+circonference+ " cm");
    }
}

