package com.bibliotheque.web.proxies;

import com.bibliotheque.web.beans.ExemplaireBean;
import com.bibliotheque.web.beans.LivreBean;
import com.bibliotheque.web.beans.UtilisateurBean;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "microservice-back", url = "localhost:9001")
public interface MServiceBack {

    @GetMapping(value = "/livres")
    List<LivreBean> listeDesLivres();

    @GetMapping(value = "/livre/{id}")
    LivreBean recupererUnLivre(@PathVariable("id") Integer id);

    @GetMapping(value = "/recherche")
    List<LivreBean> rechercherLivres(@RequestParam("motCle") String motCle);

    @GetMapping(value = "liste-de-mes-emprunts/{utilisateurId}")
    List<ExemplaireBean> rechercherTousLesLivresPourUtilisateur(@PathVariable("utilisateurId") Integer id);

    @PostMapping(value = "prolonger-emprunt/{exemplaireId}")
    ExemplaireBean prolongeremprunt(@PathVariable("exemplaireId") Integer id);

    @GetMapping(value = "/connexionUtilisateur/{pseudo}")
    UtilisateurBean connexionUtilisateur(@PathVariable("pseudo") String pseudo);
}
