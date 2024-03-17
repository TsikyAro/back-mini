package com.project.hackaton.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.project.hackaton.Model.Preferances;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin("*")
public class PreferancesController {
    @PostMapping("/preferences")
    public String postMethodName(@RequestBody Preferances preferances) {
        try {
            preferances.insert();
            return "OK ";
        } catch (Exception e) {
            return e.getMessage();
        }

    }

}
