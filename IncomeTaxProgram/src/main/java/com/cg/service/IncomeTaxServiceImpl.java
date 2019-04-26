package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.IncomeTaxDaoImpl;
import com.cg.model.IncomeTaxPojo;

@Service
public class IncomeTaxServiceImpl implements IncomeTaxService {

	//auto wiring
	@Autowired
	IncomeTaxDaoImpl taxDao;

	//service method calling methods of dao 
	@Override
	public IncomeTaxPojo getById(int id) {
		return taxDao.getById(id);
	}

}
