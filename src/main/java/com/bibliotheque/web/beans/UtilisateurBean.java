package com.bibliotheque.web.beans;

import java.util.List;

public class UtilisateurBean {


    private int id;

    private String nom;

    private String prenom;

    private String adresse;

    private String numeroDeTelephone;

    private String mail;

    private String motDePasse;

    private List<RoleBean> roles;

    private List<LivreBean> livresList;

    public List<RoleBean> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleBean> roles) {
        this.roles = roles;
    }

    public List<LivreBean> getLivresList() {
        return livresList;
    }

    public void setLivresList(List<LivreBean> livresList) {
        this.livresList = livresList;
    }

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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", numeroDeTelephone='" + numeroDeTelephone + '\'' +
                ", mail='" + mail + '\'' +
                ", motDePasse='" + motDePasse + '\'' +
                '}';
    }
}
