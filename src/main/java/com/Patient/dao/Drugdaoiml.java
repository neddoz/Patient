package com.Patient.dao;

import com.Patient.models.Drug;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.Serializable;
import java.util.List;

/**
 * Created by n3ddoz on 5/8/2015.
 */
public class Drugdaoiml implements Drugdao {

    @Autowired
    SessionFactory sessionFactory;
    @Override
    public int addDrug(Drug drugname) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(drugname);
        tx.commit();
        Serializable id = session.getIdentifier(drugname);
        session.close();
        return (Integer) id;

    }

    @Override
    public void updateDrug(Drug drug) {

    }

    @Override
    public List<Drug> listDrug() {
        Session session = sessionFactory.openSession();
        @SuppressWarnings("unchecked")
        List<Drug> drugList = session.createQuery("from drugs").list();
        session.close();
        return drugList;
    }

    @Override
    public Drug getDrugById(int id) {
        return null;
    }

    @Override
    public void removeDrug(int id) {

    }

    @Transactional
    @Override
    public int insertRow(Drug drugname) {
        return 0;
    }
}
