package com.project.hackaton.Model;

import com.project.hackaton.orm.DynamicORM;

public class Publication extends DynamicORM<Publication> {
    Integer id;
    Integer idCompte;
    Integer dateDePublication;
    Integer dateDEcheance;
    Integer auteur;
    Integer longitude;
    Integer latitude;
    Integer description;
    Integer prix;
    Integer fichier;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Integer idCompte) {
        this.idCompte = idCompte;
    }

    public Integer getDateDePublication() {
        return dateDePublication;
    }

    public void setDateDePublication(Integer dateDePublication) {
        this.dateDePublication = dateDePublication;
    }

    public Integer getDateDEcheance() {
        return dateDEcheance;
    }

    public void setDateDEcheance(Integer dateDEcheance) {
        this.dateDEcheance = dateDEcheance;
    }

    public Integer getAuteur() {
        return auteur;
    }

    public void setAuteur(Integer auteur) {
        this.auteur = auteur;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }

    public Integer getLatitude() {
        return latitude;
    }

    public void setLatitude(Integer latitude) {
        this.latitude = latitude;
    }

    public Integer getDescription() {
        return description;
    }

    public void setDescription(Integer description) {
        this.description = description;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(Integer prix) {
        this.prix = prix;
    }

    public Integer getFichier() {
        return fichier;
    }

    public void setFichier(Integer fichier) {
        this.fichier = fichier;
    }
}
