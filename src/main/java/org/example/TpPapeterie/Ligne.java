package org.example.TpPapeterie;

public class Ligne {
    private ArtUnitaire article;
    private int quantite;


    public Ligne(ArtUnitaire article, int quantite) {
        this.article = article;
        this.quantite = quantite;
    }

    public ArtUnitaire getArticle() {
        return article;
    }

    public void setArticle(ArtUnitaire article) {
        this.article = article;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Ligne{" +
                "article=" + article +
                ", quantite=" + quantite +
                '}';
    }
}
