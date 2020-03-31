package com.bibliotheque.web.Service;

import com.bibliotheque.web.beans.UtilisateurBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;
import java.util.Optional;

public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired


    @Override
    public List<UtilisateurBean> rechercherTousLesUtilisateurs() {
        return utilisateurRepository.findAll();
    }


    @Override
    public Utilisateur chargementUtilisateurParPseudo(String pseudo) {
        Optional<Utilisateur> optionalUtilisateur = utilisateurRepository.findByPseudo(pseudo);
        return optionalUtilisateur.isPresent() ? optionalUtilisateur.get() : null;
    }

    @Override
    public UserDetails loadUserByUsername(String login)
            throws UsernameNotFoundException, DataAccessException {
        Utilisateur utilisateur = chargementUtilisateurParPseudo(login);
        if (utilisateur == null) {
            throw new UsernameNotFoundException(login + " non trouvé");
        }
        return utilisateur;
    }
}
