package com.project.hackaton.Model;

import com.project.hackaton.orm.DynamicORM;

public class V_SousCategorie_lib extends DynamicORM<V_SousCategorie_lib> {

    Integer id;
    String nom;
    Integer idCategorie;
    String nomCategorie;
    String photo;

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

    public Integer getIdCategorie() {
        return idCategorie;
    }

    public void setIdCategorie(Integer idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getNomCategorie() {
        return nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }

}
