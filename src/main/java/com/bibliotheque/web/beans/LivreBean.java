package com.bibliotheque.web.beans;

import java.util.Date;

public class LivreBean {

    private int id;
    private String nom;
    private int nbDispo;
    private boolean pret;
    private Date date;
    private boolean prolongation;
    private String auteur;

    private UtilisateurBean utilisateur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbDispo() {
        return nbDispo;
    }

    public void setNbDispo(int nbDispo) {
        this.nbDispo = nbDispo;
    }

    public boolean isPret() {
        return pret;
    }

    public void setPret(boolean pret) {
        this.pret = pret;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isProlongation() {
        return prolongation;
    }

    public void setProlongation(boolean prolongation) {
        this.prolongation = prolongation;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public UtilisateurBean getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(UtilisateurBean utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public String toString() {
        return "LivreBean{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", nbDispo=" + nbDispo +
                ", pret=" + pret +
                ", date=" + date +
                ", prolongation=" + prolongation +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
