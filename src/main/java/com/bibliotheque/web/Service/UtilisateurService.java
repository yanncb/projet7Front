package com.bibliotheque.web.Service;

import com.bibliotheque.web.beans.UtilisateurBean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UtilisateurService  extends UserDetailsService {

    /**
     * Permets de chercher tous les utilisateurs
     *
     * @return liste d'utilisateur
     */
    List<UtilisateurBean> rechercherTousLesUtilisateurs();

    /**
     * chargementUtilisateur par pseudo
     *
     * @param pseudo le parametre pseudo pour faire notre recherche
     * @return l'utilisateur ayant le bon parametre pseudo
     */
    UtilisateurBean chargementUtilisateurParPseudo(String pseudo);

}
