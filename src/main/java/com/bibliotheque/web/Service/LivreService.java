package com.bibliotheque.web.Service;

import com.bibliotheque.web.beans.ExemplaireBean;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface LivreService {

    Date dateDeRetour(ExemplaireBean exemplaireBean);

}
