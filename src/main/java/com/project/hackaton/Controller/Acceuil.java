package com.project.hackaton.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.hackaton.Model.V_publication_lib1;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin("*")
public class Acceuil {

    @GetMapping("/acceuil/{idUser}")
    public V_publication_lib1[] gets(@PathVariable("idUser") Integer idUser) throws Exception {
        return new V_publication_lib1().selectParUtilisateur(idUser);
    }

    @GetMapping("/acceuilSimilaire/{idsouscategorie}")
    public V_publication_lib1[] getMethodName(@PathVariable("idsouscategorie") Integer idsouscategorie)
            throws Exception {
        return new V_publication_lib1().selectWhere("souscategorieid=" + idsouscategorie);
    }

}
