package com.Patient.services;

import com.Patient.models.Patient;

import java.util.List;

/**
 * Created by n3ddoz on 5/7/2015.
 */
public interface Patientservice {
    public int addPatient(Patient patient);
    public int insertRow(Patient patient);

    public  Patient getPatientById(int id);

    public List<Patient> getList();

    public int updateRow(Patient patient);

    public int deleteRow(int id);
}
