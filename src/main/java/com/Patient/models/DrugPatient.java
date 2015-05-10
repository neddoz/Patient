package com.Patient.models;

import javax.persistence.*;

/**
 * Created by n3ddoz on 5/8/2015.
 */
@Entity
@Table(name="drugs")
public class DrugPatient {
    @Id
    @GeneratedValue
    private int id;
    @Column(name="P_ID")
    private int pid;
    @ManyToOne
    @JoinColumn(name="id", insertable=false, updatable = false)
    private Patient patient;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
