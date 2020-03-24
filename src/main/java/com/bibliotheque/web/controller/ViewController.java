package com.bibliotheque.web.controller;

import com.bibliotheque.web.beans.LivreBean;
import com.bibliotheque.web.proxies.MService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    private MService rechercherLivres;

    @GetMapping(value = "/")
    public String welcome(Model model) {
        return "/index";
    }

    @GetMapping(value = "/livres")
    public String afficherTousLesLivres(Model model){
        List<LivreBean> livres = rechercherLivres.listeDesLivres();
        model.addAttribute("livres", livres);
        return "livres";
    }

}
