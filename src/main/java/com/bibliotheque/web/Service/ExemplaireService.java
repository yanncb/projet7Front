package com.bibliotheque.web.Service;

import com.bibliotheque.web.beans.LivreBean;
import org.springframework.stereotype.Service;

@Service
public interface ExemplaireService {


    int calculNbDispo(LivreBean livre);
}
