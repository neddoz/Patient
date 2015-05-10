package com.Patient.services;

import com.Patient.dao.Drugdao;
import com.Patient.models.Drug;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by n3ddoz on 5/8/2015.
 */
public interface Drugservice {

    public int addDrug(Drug drugname);

    public int insertRow(Drug drugname);
}
