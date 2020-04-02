package com.bibliotheque.web.Service;

import com.bibliotheque.web.beans.UtilisateurBean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UtilisateurService  extends UserDetailsService {

    void ajouterUtilisateur(UtilisateurBean utilisateur);
}
