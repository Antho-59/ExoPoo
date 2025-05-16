package org.example.TpPapeterie;

import java.util.HashSet;
import java.util.Objects;

public class Stylo extends ArtUnitaire {

    private String color;
    public Stylo(int ref, String nom, double prix,String color) {
        super(ref, nom, prix);
        this.color=color;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Stylo{" +
                "ref=" + ref +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}

