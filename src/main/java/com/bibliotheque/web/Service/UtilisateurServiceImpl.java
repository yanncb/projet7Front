package com.bibliotheque.web.Service;

import com.bibliotheque.web.beans.UtilisateurBean;
import com.bibliotheque.web.proxies.MServiceBack;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

    @Autowired
    private MServiceBack mServiceBack;


    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException, DataAccessException {
        UtilisateurBean utilisateur = mServiceBack.connexionUtilisateur(login.toLowerCase());
        if (utilisateur == null) {
            throw new UsernameNotFoundException(login + " non trouvé");
        }
        return utilisateur;
    }
}
