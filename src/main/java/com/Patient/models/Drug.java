package com.Patient.models;

import javax.persistence.*;

/**
 * Created by n3ddoz on 5/8/2015.
 */
@Entity
@Table(name="drugs")
public class Drug {
    @Id
    @GeneratedValue
    private int ID;
    @Column(name = "P_ID")
    private int P_ID;

    @Column(name = "Drug_name")
    private String Drugname;


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getP_ID() {
        return P_ID;
    }

    public void setP_ID(int p_ID) {
        P_ID = p_ID;
    }

    public String getDrugname() {
        return Drugname;
    }

    public void setDrugname(String drugname) {
        Drugname = drugname;
    }
}
