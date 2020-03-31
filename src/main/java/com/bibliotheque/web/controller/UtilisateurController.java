package com.bibliotheque.web.controller;

import com.bibliotheque.web.beans.UtilisateurBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UtilisateurController {

    //TODO terminer l'implementation des methodes pour le login

    @GetMapping(value = "/login")
    public ModelAndView loginGet(Model model) {
        model.addAttribute("utilisateur", new UtilisateurBean());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (!(auth instanceof AnonymousAuthenticationToken)) {
            return new ModelAndView("redirect:/index");
        }
        return new ModelAndView("/login");
    }

    @PostMapping(value = "/login")
    public ModelAndView loginPost(Model model, @ModelAttribute("utilisateur") UtilisateurBean utilisateurBean) {
        return new ModelAndView("redirect:/index");
    }
}
