package org.example.exoPlante;

public class Main {
    public static void main(String[] args) {
        Plante plante =new Plante("tulipe",15,"jaune");
        Arbre arbre = new Arbre("chene",240,"verte",92);

        plante.info();
        arbre.info();
    }
}
