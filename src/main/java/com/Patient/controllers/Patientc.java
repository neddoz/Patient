package com.Patient.controllers;

import com.Patient.models.Drug;
import com.Patient.models.Patient;
import com.Patient.services.Drugservice;
import com.Patient.services.Patientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by n3ddoz on 5/7/2015.
 */
@Controller
public class Patientc {
    @Autowired
    Patientservice patientservice;

    @Autowired
    Drugservice drugservice;

    @RequestMapping("/")
    public ModelAndView hello1(){

        ModelAndView model = new ModelAndView();
        model.addObject("msg","Please Add New Patient Below");
        model.addObject("listPatient", patientservice.getList());
        model.setViewName("add");
        return model;
    }


    @RequestMapping("/create")
    public ModelAndView create(@RequestParam(value = "fname", required = false) String fname,
                               @RequestParam(value = "lname", required = false) String lname,
                               @RequestParam(value = "dob", required = false) String dob

    ){
        ModelAndView model = new ModelAndView();


            Patient patient = new Patient();
            patient.setFname(fname);
            patient.setLname(lname);
            patient.setDateofbirth(dob);
        patientservice.addPatient(patient);
        model.addObject("msg", "Patient Added Successfully");
        model.addObject("listPatient", patientservice.getList());
        model.setViewName("add");
        return model;
    }
@RequestMapping(value = "/Assigndrug",method = RequestMethod.GET)
    public ModelAndView AssignDrug(@RequestParam(value = "id", required = false) int id){
    ModelAndView model= new ModelAndView("Assign");
    model.addObject("patient",patientservice.getPatientById(id));
    //model.addObject("patient", id);
    model.setViewName("Assign");
    return model;
}
    @RequestMapping("/insertdrug")
    public ModelAndView AssignDrug(@RequestParam(value = "patient_id", required = false) int id,
                                   @RequestParam(value = "dname", required = false) String dname){
        Drug drug=new Drug();
        ModelAndView model= new ModelAndView();
        drug.setP_ID(id);
        drug.setDrugname(dname);
        drugservice.addDrug(drug);
        model.addObject("msg", "Drug Administered Successfully");
        //model.addObject("listDrug", drugservice.listDrug());
        model.setViewName("Assign");
        return model;
    }
}
