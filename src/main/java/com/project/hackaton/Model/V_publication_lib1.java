package com.project.hackaton.Model;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.project.hackaton.orm.DynamicORM;

public class V_publication_lib1 extends DynamicORM<V_publication_lib1> {

    Integer id;
    Integer idcompte;
    Timestamp datedepublication;
    Timestamp datedecheance;
    String auteur;
    Double longitude;
    Double latitude;
    String description;
    Double prix;
    String fichier;
    String nomartiste;
    String telephone;
    Integer souscategorieid;
    Integer utilisateur_connected;
    Integer souscategorieprefere;

    public V_publication_lib1[] selectParUtilisateur(Integer idUtilisateur) throws Exception {
        V_publication_lib1[] a = selectWhere(
                "utilisateur_connected =" + idUtilisateur + " and souscategorieprefere is not null");
        V_publication_lib1[] a2 = selectWhere(
                "utilisateur_connected =" + idUtilisateur + " and souscategorieprefere is null");
        List<V_publication_lib1> l1 = Arrays.asList(a);
        List<V_publication_lib1> l2 = Arrays.asList(a2);
        Collections.shuffle(l1);
        Collections.shuffle(l2);
        for (V_publication_lib1 v_publication_lib1 : l2) {
            l1.add(v_publication_lib1);
        }
        return l1.toArray(new V_publication_lib1[l1.size()]);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdcompte() {
        return idcompte;
    }

    public void setIdcompte(Integer idcompte) {
        this.idcompte = idcompte;
    }

    public Timestamp getDatedepublication() {
        return datedepublication;
    }

    public void setDatedepublication(Timestamp datedepublication) {
        this.datedepublication = datedepublication;
    }

    public Timestamp getDatedecheance() {
        return datedecheance;
    }

    public void setDatedecheance(Timestamp datedecheance) {
        this.datedecheance = datedecheance;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    public String getNomartiste() {
        return nomartiste;
    }

    public void setNomartiste(String nomartiste) {
        this.nomartiste = nomartiste;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Integer getSouscategorieid() {
        return souscategorieid;
    }

    public void setSouscategorieid(Integer souscategorieid) {
        this.souscategorieid = souscategorieid;
    }

    public Integer getUtilisateur_connected() {
        return utilisateur_connected;
    }

    public void setUtilisateur_connected(Integer utilisateur_connected) {
        this.utilisateur_connected = utilisateur_connected;
    }

    public Integer getSouscategorieprefere() {
        return souscategorieprefere;
    }

    public void setSouscategorieprefere(Integer souscategorieprefere) {
        this.souscategorieprefere = souscategorieprefere;
    }

}
