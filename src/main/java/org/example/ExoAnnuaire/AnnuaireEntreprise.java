package org.example.ExoAnnuaire;

import java.util.ArrayList;
import java.util.List;

public class AnnuaireEntreprise {
  //  private List<Entreprise> entreprises = new ArrayList<>(); // facon 1 de le faire

// facon 2
private List<Entreprise> entreprises;

    public AnnuaireEntreprise (){
        entreprises = new ArrayList<>();
    }

    // methodes

    public void addEntrepriseToAnnuaire(String nom, long nbrSiret, String adresse, String webSite) {
        if (webSite.startsWith("www")) {
            Entreprise entreprise = new Entreprise(nom, nbrSiret, adresse, webSite);
            this.entreprises.add((entreprise));
        }
    }

    public void showAllNameEntreprise(){
           for (int i = 0; i<this.entreprises.size();i++){
               System.out.println(i+") +"+this.entreprises.get(i).getNom());
           }
        }



    public void showDetailsEntreprise(int indice){
        if (indice < this.entreprises.size()){
        System.out.println(this.entreprises.get(indice));
    }
    }

}
