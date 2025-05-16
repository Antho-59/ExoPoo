package org.example.TpPapeterie;

import java.util.HashSet;

public class ArtUnitaire {

    protected int ref;
    protected String nom;
    protected double prix;

    // construcuteur


    public ArtUnitaire(int ref, String nom, double prix) {
        this.ref = ref;
        this.nom = nom;
        this.prix = prix;
    }

    // methodes
HashSet<ArtUnitaire> set =new HashSet<>();

    public void setArticle(HashSet<ArtUnitaire> set) {
        this.set = set;
    }


    // getter /setter

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }


    @Override
    public String toString() {
        return "ArtUnitaire{" +
                "ref=" + ref +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", set=" + set +
                '}';
    }
}
