package com.cg.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.model.IncomeTaxPojo;

//defining a name to component to auto wire 
@Component("incomeTaxDao")

//defining repository
@Repository

//uses package name to scan for classes 
@ComponentScan("com.src")
public class IncomeTaxDaoImpl implements IncomeTaxDao {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public IncomeTaxPojo getById(int id) {
		IncomeTaxPojo td = entityManager.find(IncomeTaxPojo.class, id);
		return td;
	}

}
