package com.cg.utility;



import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IDNotFoundException extends Exception {
	
	public IDNotFoundException(String msg) {
		super(msg);
	}

}
