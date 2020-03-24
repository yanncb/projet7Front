package com.bibliotheque.web.controller;

import com.bibliotheque.web.proxies.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RechercheController {

    @Autowired
    private MService rechercherSites;

//    @RequestMapping("/recherche")
//    public String recherche(Model model) {
//        model.addAttribute("recherche", new Recherche());
//        return "/recherche";
//    }
//
//
//    @PostMapping("/recherche")
//    public String recherche(Model model, @ModelAttribute("recherche") Recherche recherche) {
//        model.addAttribute("resultat", rechercheService.rechercherSites(recherche));
//        return "/recherche";
//    }
}
