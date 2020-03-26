package com.bibliotheque.web.controller;

import com.bibliotheque.web.beans.LivreBean;
import com.bibliotheque.web.beans.Recherche;
import com.bibliotheque.web.proxies.MServiceBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class RechercheController {

    @Autowired
    private MServiceBack rechercherLivres;

    @RequestMapping("/recherche")
    public String recherche(Model model) {
        model.addAttribute("recherche", new Recherche());
        return "/recherche";
    }


    @PostMapping("/recherche")
    public String recherche(Model model, @ModelAttribute("recherche") Recherche recherche) {
        List<LivreBean> livres = rechercherLivres.rechercherLivres(recherche);

        model.addAttribute("resultat",livres);
        return "/recherche";
    }
}
