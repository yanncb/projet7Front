package com.bibliotheque.web.beans;

public class RoleBean {

    private int id;
    private String rolNom;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRolNom() {
        return rolNom;
    }

    public void setRolNom(String rolNom) {
        this.rolNom = rolNom;
    }

    @Override
    public String toString() {
        return "RoleBean{" +
                "id=" + id +
                ", rolNom='" + rolNom + '\'' +
                '}';
    }
}
