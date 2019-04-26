package com.cg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.model.IncomeTaxPojo;
import com.cg.service.IncomeTaxServiceImpl;
import com.cg.utility.IDNotFoundException;

@RestController
public class Controller {

	//auto wiring object with class object
	@Autowired
	IncomeTaxServiceImpl service;

	// method to fetch the data by id
	@GetMapping("/getById/{id}")
	public IncomeTaxPojo getByPid(@PathVariable int id) throws IDNotFoundException {

		IncomeTaxPojo object = service.getById(id);
		if (object == null) {
			throw new IDNotFoundException(id + " ID not found");
		} else
			return object;

	}

}
