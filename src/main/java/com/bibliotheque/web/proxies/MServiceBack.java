package com.bibliotheque.web.proxies;

import com.bibliotheque.web.beans.ExemplaireBean;
import com.bibliotheque.web.beans.LivreBean;
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
    LivreBean recupererUnLivre(@PathVariable("id") int id);

    @GetMapping(value = "/recherche")
    List<LivreBean> rechercherLivres(@RequestParam("motCle") String motCle);

    @GetMapping(value = "liste-de-mes-emprunts")
    List<ExemplaireBean> rechercherTousLesLivresPourUtilisateur(@RequestParam("utilisateurId") Integer id);

    @PostMapping(value = "prolonger-emprunt")
    ExemplaireBean prolongeremprunt(int id);
}
