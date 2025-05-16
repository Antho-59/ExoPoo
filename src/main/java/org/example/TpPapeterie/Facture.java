package org.example.TpPapeterie;

import java.util.Arrays;
import java.util.HashMap;

public class Facture {
    private String client;
    private Ligne[] nbLigne;
    private int nbFacture;
    private String date;
    private int[] qttLigneAchat;

 //constructor

    public Facture(String client, Ligne[] nbLigne, int nbFacture, String date, int[] qttLigneAchat) {
        this.client = client;
        this.nbLigne = nbLigne; // nexw ligne  ()10
        this.nbFacture = nbFacture;
        this.date = date;
        this.qttLigneAchat = qttLigneAchat;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public Ligne[] getNbLigne() {
        return nbLigne;
    }

    public void setNbLigne(Ligne[] nbLigne) {
        this.nbLigne = nbLigne;
    }

    public int getNbFacture() {
        return nbFacture;
    }

    public void setNbFacture(int nbFacture) {
        this.nbFacture = nbFacture;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int[] getQttLigneAchat() {
        return qttLigneAchat;
    }

    public void setQttLigneAchat(int[] qttLigneAchat) {
        this.qttLigneAchat = qttLigneAchat;
    }

    @Override
    public String toString() {
        return "Facture{" +
                "client='" + client + '\'' +
                ", nbLigne=" + nbLigne +
                ", nbFacture=" + nbFacture +
                ", date='" + date + '\'' +
                ", qttLigneAchat=" + Arrays.toString(qttLigneAchat) +
                '}';
    }
}
