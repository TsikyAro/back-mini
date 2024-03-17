package com.project.hackaton.Model;

import com.project.hackaton.orm.DynamicORM;

public class Categorie extends DynamicORM<Categorie> {
    Integer id;
    String nom;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
