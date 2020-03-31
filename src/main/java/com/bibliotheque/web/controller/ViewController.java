package com.bibliotheque.web.controller;

import com.bibliotheque.web.beans.ExemplaireBean;
import com.bibliotheque.web.beans.LivreBean;
import com.bibliotheque.web.beans.UtilisateurBean;
import com.bibliotheque.web.proxies.MServiceBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/liste-de-mes-emprunts/{utilisateurId}")
    public String afficherMesEmprunts(Model model, Authentication authentication){
//        UtilisateurBean utilisateurBean = (UtilisateurBean) authentication.getPrincipal();
//        model.addAttribute("livres", rechercherLivres.rechercherTousLesLivresPourUtilisateur(utilisateurBean.getId()));

        return "liste-de-mes-emprunts";
    }

    @GetMapping(value = "/prolongerEmprunt/${exemplaireId}")
    public String affichageConfirmationProlongation(Model model, @PathVariable Integer id){
        LivreBean livre = rechercherLivres.recupererUnLivre(id);
        List<ExemplaireBean> exemplaireBeanList = livre.getExemplaireList();
        model.addAttribute("exemplaire", exemplaireBeanList);
        model.addAttribute("livre", livre);
        return "/prolongerEmprunt";
    }

    @PostMapping(value = "/prolongerEmprunt")
    public String confirmationProlongation(@ModelAttribute("exemplaire") ExemplaireBean exemplaireBean){
        rechercherLivres.prolongeremprunt(exemplaireBean.getId());

        return "liste-de-mes-emprunts";
    }


}
