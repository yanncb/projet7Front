package com.bibliotheque.web.controller;

import com.bibliotheque.web.beans.ExemplaireBean;
import com.bibliotheque.web.beans.LivreBean;
import com.bibliotheque.web.proxies.MServiceBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private MServiceBack rechercherLivres;

    @GetMapping(value = "/")
    public String welcome(Model model) {
        return "/index";
    }

    @GetMapping(value = "/livres")
    public String afficherTousLesLivres(Model model) {
        List<LivreBean> livres = rechercherLivres.listeDesLivres();
        model.addAttribute("livres", livres);
        return "livres";
    }

    @GetMapping(value = "/livre/{id}")
    public String afficherLivreParId(Model model, @PathVariable int id) {
        LivreBean livre = rechercherLivres.recupererUnLivre(id);
        List<ExemplaireBean> exemplaireBeanList = livre.getExemplaireList();
//        ExemplaireBean exemplaire = rechercherLivres.rechercherExemplaire(id);
        model.addAttribute("exemplaire", exemplaireBeanList);
        model.addAttribute("livre", livre);
        return "livre";
    }

    @RequestMapping("/details-produit/{id}")
    public String ficheProduit(@PathVariable int id, Model model) {
        LivreBean livre = rechercherLivres.recupererUnLivre(id);
        model.addAttribute("livre", livre);
        return "detailsLivre";
    }

}
