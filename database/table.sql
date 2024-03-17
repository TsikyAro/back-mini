CREATE DATABASE miniHackatonInterne;

\c miniHackatonInterne;

CREATE TABLE utilisateur (
    id                  serial PRIMARY KEY,
    nom                 VARCHAR(100),
    nomArtiste          VARCHAR(50),
    dateDeNaissance     date,
    mail                VARCHAR(100),
    telephone           VARCHAR(10),
    genre               int
);

CREATE TABLE compte (
    id                  serial PRIMARY KEY,
    idUtilisateur       int REFERENCES utilisateur(id),
    motdepasse          VARCHAR(50) 
);

CREATE table categorie (
    id                  serial PRIMARY KEY,
    nom                 VARCHAR(50)
);

CREATE table sousCategorie (
    id                  serial PRIMARY KEY,
    idCategorie         int REFERENCES categorie(id), 
    nom                 VARCHAR(50),
    photo               text
);

CREATE TABLE publication (
    id                  VARCHAR(50) PRIMARY KEY,
    idCompte            int REFERENCES compte (id),
    dateDePublication   TIMESTAMP,
    dateDEcheance       TIMESTAMP, 
    auteur              VARCHAR(100), 
    longitude           text,
    latitude            text,
    description         text,
    prix                NUMERIC (12,2) ,
    fichier             text not null ,
    souscategorieid int REFERENCES sousCategorie(id)
);



CREATE table evaluation (
    id                  serial PRIMARY KEY,
    idPublication       VARCHAR(50) REFERENCES publication(id),
    note                NUMERIC(2,1) 
);

CREATE VIEW v_SousCategorie_lib as
    select SousCategorie.id,
    SousCategorie.nom,
    SousCategorie.photo,
    Categorie.id as idCategorie,
    Categorie.nom as nomCategorie
    from SousCategorie
    join Categorie on SousCategorie.id = Categorie.id
    order by nomCategorie, nom;


CREATE table preferances(
    id                  serial PRIMARY KEY,
    idUtilisateur       integer ,
    sousCategorie       integer ,
    foreign KEY(sousCategorie) REFERENCES sousCategorie(id), 
    foreign KEY(idUtilisateur) REFERENCES utilisateur(id)
);
