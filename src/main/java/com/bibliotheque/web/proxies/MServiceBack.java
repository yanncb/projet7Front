package com.bibliotheque.web.proxies;

import com.bibliotheque.web.beans.LivreBean;
import com.bibliotheque.web.beans.Recherche;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "microservice-back", url = "localhost:9001")
public interface MServiceBack {

    @GetMapping(value = "/livres")
    List<LivreBean> listeDesLivres();

    @GetMapping(value = "/livre/{id}")
    LivreBean recupererUnLivre(@PathVariable("id") int id);

    @PostMapping(value = "/recherche")
    List<LivreBean> rechercherLivres(Recherche recherche);

}
