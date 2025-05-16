package org.example.TpPapeterie;

public class Ramette extends ArtUnitaire{
    public Ramette(int ref, String nom, double prix,Double gramage) {
        super(ref, nom, prix);
    }

    @Override
    public String toString() {
        return "Ramette{" +
                "ref=" + ref +
                ", nom='" + nom + '\'' +
                ", prix=" + prix +
                ", set=" + set +
                '}';
    }
}
