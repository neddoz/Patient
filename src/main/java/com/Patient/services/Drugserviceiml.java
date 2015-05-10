package com.Patient.services;

import com.Patient.dao.Drugdao;
import com.Patient.models.Drug;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by n3ddoz on 5/8/2015.
 */
public class Drugserviceiml implements  Drugservice {
    @Autowired
    Drugdao drugdao;

    @Override
    public int addDrug(Drug drugname) {
        return drugdao.addDrug(drugname);
    }

    @Override
    public int insertRow(Drug drugname) {
        return drugdao.insertRow(drugname);
    }
}
