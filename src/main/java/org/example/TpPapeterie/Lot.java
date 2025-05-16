package org.example.TpPapeterie;

public class Lot {

    // attributq
    private ArtUnitaire infoArticle;
    private int qtt;
    private double remise;
    private double prixTotal;

//constructor
    public Lot(ArtUnitaire infoArticle, int qtt, double remise, double prixTotal) {
        this.infoArticle = infoArticle;
        this.qtt = qtt;
        this.remise = remise;
        this.prixTotal = prixTotal;
    }

    // get set
    public ArtUnitaire getInfoArticle() {
        return infoArticle;
    }

    public void setInfoArticle(ArtUnitaire infoArticle) {
        this.infoArticle = infoArticle;
    }

    public int getQtt() {
        return qtt;
    }

    public void setQtt(int qtt) {
        this.qtt = qtt;
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        this.remise = remise;
    }

    public double getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(double prixTotal) {
        this.prixTotal = prixTotal;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "infoArticle=" + infoArticle +
                ", qtt=" + qtt +
                ", remise=" + remise +
                ", prixTotal=" + prixTotal +
                '}';
    }
}

