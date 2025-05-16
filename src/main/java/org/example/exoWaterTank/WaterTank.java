package org.example.exoWaterTank;

//Créer une classe WaterTank
//2. Ajouter les attributs suivants: poids à vide, capacité maximale, niveau de
//        remplissage
//3. Créer une méthode remplir() qui ajoutera une volume d'eau à la citerne
//        4. Créer une méthode vider() qui enlèvera un volume d'eau à la citerne
//        5. Créer un attribut de classe qui contiendra la totalité des volumes d'eau de la
//citerne
//6. /!\ le volume d'eau d'une citerne ne peut pas être négatif ou dépasser le
//volume maximum


import java.util.Scanner;

public class WaterTank {

    private int poidsAvide;
    private int capaMax;
    private int niveauRemplissage;
    private static int volumeCiternes;

    public WaterTank(int poidsAvide, int capaMax, int niveauRemplissage) {
        this.poidsAvide = poidsAvide;
        this.capaMax = capaMax;
        this.niveauRemplissage = niveauRemplissage;
    }
    public WaterTank(int poidsAvide, int capaMax) {
        this.poidsAvide = poidsAvide;
        this.capaMax = capaMax;
        this.niveauRemplissage = 0;
    }


    // methodes

    public void remplir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("de cb de L voulez vous remplir la citerne?");
        int r = scanner.nextInt();
        if (r<0){
            System.out.println("Valeur negative, impossible !");
        }
        else if (this.niveauRemplissage + r > this.capaMax) {
            System.out.println("pas possible la citerne va deborder");


        } else {
            this.niveauRemplissage += r;
            volumeCiternes += this.niveauRemplissage;
            System.out.println(" votre citerne est rempli de " + r + " litre.");
        }
    }

    public void vider() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("de cb de L voulez vous vider la citerne?");
        int v = scanner.nextInt();
        if (v<0){
            System.out.println("Valeur negative, impossible !");
        }
        else if (this.niveauRemplissage - v < 0) {
            System.out.println("Nous allons retirer le maximum");
            volumeCiternes -= this.niveauRemplissage;
            this.niveauRemplissage = 0;
            System.out.println("Il reste "+this.niveauRemplissage+" L dans votre citerne");

        } else {
            this.niveauRemplissage -= v;
            volumeCiternes -= this.niveauRemplissage;
            System.out.println(" votre citerne est vider de " + v + " litre.");
        }
    }

public static void volCiterne(){
    System.out.println("il y a "+volumeCiternes+" L au total dans vos citernes");

}


    public int getPoidsAvide() {
        return poidsAvide;
    }

    public void setPoidsAvide(int poidsAvide) {
        this.poidsAvide = poidsAvide;
    }

    public int getCapaMax() {
        return capaMax;
    }

    public void setCapaMax(int capaMax) {
        this.capaMax = capaMax;
    }

    public int getNiveauRemplissage() {
        return niveauRemplissage;
    }

    public void setNiveauRemplissage(int niveauRemplissage) {
        this.niveauRemplissage = niveauRemplissage;
    }

    public static int getVolumeCiternes() {
        return volumeCiternes;
    }


    @Override
    public String toString() {
        return "WaterTank{" +
                "poidsAvide=" + poidsAvide +
                ", capaMax=" + capaMax +
                ", niveauRemplissage=" + niveauRemplissage +
                '}';
    }
}
