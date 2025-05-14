package org.example.exoPlante;

//Créer une classe "Plante" avec les attributs suivants : nom, hauteur et
//couleur des feuilles
//2. Ajouter un constructeur, des getters et des setters pour ces attributs
//3. Créer une méthode pour afficher les informations sur la plante
//4. Créer une classe "Arbre" qui hérite de "Plante" et qui ajoute un attribut
//supplémentaire pour la circonférence du tronc
//5. Surcharger la méthode afficher pour qu'elle ajoute les informations à
//propos de l'arbre


public class Plante {

    protected String nom;
    protected int hauteur;
    protected String couleurFeuilles;

    public Plante(String nom, int hauteur, String couleurFeuilles) {
        this.nom = nom;
        this.hauteur = hauteur;
        this.couleurFeuilles = couleurFeuilles;
    }

    public void info(){
        System.out.println("c'est un(e) "+nom+" de "+hauteur+" cm de hauteur et avec les feuilles "+couleurFeuilles);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    public String getCouleurFeuilles() {
        return couleurFeuilles;
    }

    public void setCouleurFeuilles(String couleurFeuilles) {
        this.couleurFeuilles = couleurFeuilles;
    }

    @Override
    public String toString() {
        return "Plante{" +
                "nom='" + nom + '\'' +
                ", hauteur=" + hauteur +
                ", couleurFeuilles='" + couleurFeuilles + '\'' +
                '}';
    }
}
