package org.example.exoFilm;

//1. Créer une classe "Film"
//        2. Ajouter les attributs suivants : titre, réalisateur, année de sortie et genre
//3. Ajouter un constructeur, des getters et des setters pour ces attributs, ainsi
//qu'une méthode pour afficher les informations sur le film

import java.time.LocalDate;

public class Film {
    private String titre;
    private String realisateur;
    private LocalDate anneeDeSortie;
    private String genre;

    public Film(String titre, String realisateur, LocalDate anneeDeSortie, String genre) {
        this.titre = titre;
        this.realisateur = realisateur;
        this.anneeDeSortie = anneeDeSortie;
        this.genre = genre;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    public LocalDate getAnneeDeSortie() {
        return anneeDeSortie;
    }

    public void setAnneeDeSortie(LocalDate anneeDeSortie) {
        this.anneeDeSortie = anneeDeSortie;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film{" +
                "titre='" + titre + '\'' +
                ", realisateur='" + realisateur + '\'' +
                ", anneeDeSortie=" + anneeDeSortie +
                ", genre='" + genre + '\'' +
                '}';
    }
}
