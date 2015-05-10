package com.Patient.models;

import javax.persistence.*;
/**
 * Created by n3ddoz on 5/7/2015.
 */
@Entity
@Table(name="patient_details")
public class Patient {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "f_name")
    private String fname;
    @Column(name = "l_name")
    private String lname;
    @Column(name = "DOB")
    private String dateofbirth;




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

}
