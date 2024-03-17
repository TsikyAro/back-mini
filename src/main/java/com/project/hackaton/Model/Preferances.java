package com.project.hackaton.Model;

import com.project.hackaton.orm.DynamicORM;

public class Preferances extends DynamicORM<Preferances> {
    Integer id;
    Integer idUtilisateur;
    Integer sousCategorie;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Integer idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public Integer getSousCategorie() {
        return sousCategorie;
    }

    public void setSousCategorie(Integer sousCategorie) {
        this.sousCategorie = sousCategorie;
    }
}
