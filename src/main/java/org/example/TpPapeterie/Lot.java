package org.example.TpPapeterie;

public class Lot extends Article{
    private int qtt;
    private double remise;
    private Article infoArticle;

    public Lot(int refUnique,Article infoArticle, int qtt, double remise) {
        super(refUnique);
        this.infoArticle=infoArticle;
        this.qtt=qtt;
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

    public Article getInfoArticle() {
        return infoArticle;
    }

    public void setInfoArticle(Article infoArticle) {
        this.infoArticle = infoArticle;
    }

    @Override
    public String toString() {
        return "Lot{" +
                "infoArticle=" + infoArticle +
                ", qtt=" + qtt +
                ", remise=" + remise +
                ", refUnique=" + refUnique +
                '}';
    }
}
