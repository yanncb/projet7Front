package com.bibliotheque.web.beans;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ExemplaireBean {

    private int id;
    private boolean pret;
    private Date dateDemprunt;
    private boolean prolongerEmprunt;
    private int nbDispo;

    private Date dateDeRetour;

    private LivreBean livre;
    private BibliothequeBean bibliotheque;
    private UtilisateurBean utilisateur;

    public LivreBean getLivre() {
        return livre;
    }

    public void setLivre(LivreBean livre) {
        this.livre = livre;
    }

    public BibliothequeBean getBibliotheque() {
        return bibliotheque;
    }

    public void setBibliotheque(BibliothequeBean bibliotheque) {
        this.bibliotheque = bibliotheque;
    }

    public UtilisateurBean getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(UtilisateurBean utilisateur) {
        this.utilisateur = utilisateur;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPret() {
        return pret;
    }

    public void setPret(boolean pret) {
        this.pret = pret;
    }

    public Date getDateDemprunt() {
        return dateDemprunt;
    }

    public void setDateDemprunt(Date dateDemprunt) {
        this.dateDemprunt = dateDemprunt;
    }

    public boolean isProlongerEmprunt() {
        return prolongerEmprunt;
    }

    public void setProlongerEmprunt(boolean prolongerEmprunt) {
        this.prolongerEmprunt = prolongerEmprunt;
    }

    public int getNbDispo() {
        return nbDispo;
    }

    public void setNbDispo(int nbDispo) {
        this.nbDispo = nbDispo;
    }

    public Date getDateDeRetour() {
        return dateDeRetour;
    }

    public void setDateDeRetour(Date dateDeRetour) {
        this.dateDeRetour = dateDeRetour;
    }

    @Override
    public String toString() {
        return "ExemplaireBean{" +
                "id=" + id +
                ", pret=" + pret +
                ", dateDemprunt=" + dateDemprunt +
                ", prolongerEmprunt=" + prolongerEmprunt +
                ", nbDispo=" + nbDispo +
                '}';
    }
}
