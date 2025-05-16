package org.example.ExoAnnuaire;

public class Entreprise {
    private String nom;
    private long nbrSiret;
    private String adresse;
    private String webSite;

    // constructeur

    public Entreprise(String nom, long nbrSiret, String adresse, String webSite) {
        this.nom = nom;
        this.nbrSiret = nbrSiret;
        this.adresse = adresse;
        this.webSite = webSite;
    }

    // get / set

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getNbrSiret() {
        return nbrSiret;
    }

    public void setNbrSiret(long nbrSiret) {
        this.nbrSiret = nbrSiret;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nom='" + nom + '\'' +
                ", nbrSiret=" + nbrSiret +
                ", adresse='" + adresse + '\'' +
                ", webSite='" + webSite + '\'' +
                '}';
    }
}
