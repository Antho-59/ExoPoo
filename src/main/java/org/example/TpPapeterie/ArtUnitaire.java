package org.example.TpPapeterie;

import java.util.HashSet;

public class ArtUnitaire extends Article {

    protected String nom;
    protected double prix;

    public ArtUnitaire(int refUnique, String nom, double prix) {
        super(refUnique);
        this.nom = nom;
        this.prix = prix;
    }

    // methodes


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

    public HashSet<ArtUnitaire> getSet() {
        return set;
    }

    public void setSet(HashSet<ArtUnitaire> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "ArtUnitaire{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                ", set=" + set +
                ", refUnique=" + refUnique +
                '}';
    }

    public void setArticle(HashSet<ArtUnitaire> set) {
        this.set = set;




    }
}





