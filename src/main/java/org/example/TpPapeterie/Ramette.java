package org.example.TpPapeterie;

public class Ramette extends ArtUnitaire{

    private double gramage;
    public Ramette(int ref, String nom, double prix,double gramage) {
        super(ref, nom, gramage);
        this.gramage = gramage;
    }

    @Override
    public String toString() {
        return "Ramette{" +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", set=" + set +
                '}';
    }
}
