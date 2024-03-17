package com.project.hackaton.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.hackaton.Model.Categorie;
import com.project.hackaton.Model.V_SousCategorie_lib;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@CrossOrigin("*")
public class SousCategorieController {

    @GetMapping("/categorie")
    public Categorie[] getAllCategorie() throws Exception {
        return new Categorie().select();
    }

    @GetMapping("/categorieslib/{idCategorie}")
    public V_SousCategorie_lib[] getMethodName(@PathVariable("idCategorie") Integer idCategorie)
            throws Exception {
        return new V_SousCategorie_lib().selectWhere("idCategorie=" + idCategorie);
    }

    @GetMapping("/recherche/{recherche}")
    public V_SousCategorie_lib[] recherche(@PathVariable("recherche") String recherche) throws Exception {
        return new V_SousCategorie_lib().selectWhere("nom like'%" + recherche + "%'");
    }

}
