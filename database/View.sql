CREATE view v_publication_lib0 as 
select publication.* , utilisateur.nomArtiste ,utilisateur.telephone from publication join compte
on compte.id = publication.idCompte 
join utilisateur on
utilisateur.id = compte.idUtilisateur
;

CREATE view v_publication_lib1 as
select v_publication_lib0.* , preferances.idUtilisateur as utilisateur_connected 
, preferances.souscategorie as sousCategorieprefere 
from v_publication_lib0
left join preferances on v_publication_lib0.souscategorieid = preferances.souscategorie ;


