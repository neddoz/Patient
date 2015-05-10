package com.Patient.dao;

import com.Patient.models.Drug;

import java.util.List;

/**
 * Created by n3ddoz on 5/8/2015.
 */
public interface Drugdao {
    public int addDrug(Drug drugname);
    public void updateDrug(Drug drug);
    public List<Drug> listDrug();
    public Drug getDrugById(int id);
    public void removeDrug(int id);
    public int insertRow(Drug drugname);


}
