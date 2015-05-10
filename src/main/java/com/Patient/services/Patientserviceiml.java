package com.Patient.services;

import com.Patient.dao.Patientdao;
import com.Patient.models.Patient;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by n3ddoz on 5/7/2015.
 */
public class Patientserviceiml implements Patientservice {
    @Autowired
    Patientdao patientdao;

    @Override
    public int addPatient(Patient patient) {
        return patientdao.addPatient(patient);
    }

    @Override
    public int insertRow(Patient patient) {
        return patientdao.insertRow(patient);
    }

    @Override
    public Patient getPatientById(int id) {
        return patientdao.getPatientById(id);
    }

    @Override
    public List<Patient> getList() {
        return patientdao.getList();
    }

    @Override
    public int updateRow(Patient patient) {
        return 0;
    }

    @Override
    public int deleteRow(int id) {
        return 0;
    }

}
