package com.bibliotheque.web.Service;

import com.bibliotheque.web.beans.ExemplaireBean;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

@Service
public class LivreServiceImpl implements LivreService {

    public Date dateDeRetour(ExemplaireBean exemplaireBean){
        Date date = exemplaireBean.getDateDemprunt();
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        cal.add(Calendar.DATE, 30);
        return cal.getTime();
    }

}
