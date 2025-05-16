package org.example.ExoAnnuaire;

public class Main {
    public static void main(String[] args) {

        AnnuaireEntreprise annuaireEntreprise = new AnnuaireEntreprise();
        annuaireEntreprise.addEntrepriseToAnnuaire("Total",123456789,"Lille","www.total.fr");
        annuaireEntreprise.addEntrepriseToAnnuaire("M2i",125556789,"Lille","www.m2i.fr");
        annuaireEntreprise.addEntrepriseToAnnuaire("match",123456789,"Lille","www.match.fr");
        annuaireEntreprise.addEntrepriseToAnnuaire("La.famille",1006456789,"Lille","lafamille.fr");

        annuaireEntreprise.showAllNameEntreprise();

        System.out.println("000000000000");
        annuaireEntreprise.showDetailsEntreprise(99);
        annuaireEntreprise.showDetailsEntreprise(1);

    }
}
