package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.EmiPayment;
import com.lti.model.Login;
import com.lti.service.FinanaceManagementService;

@RestController
@RequestMapping(path = "/")
@CrossOrigin
public class FinanceManagementController {
	
	@Autowired
	private FinanaceManagementService service;
	
	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> addCustomer(@RequestBody Login login){
		ResponseEntity<String> response;
		boolean result = service.addCustomer(login);
		if(result){
			response=new ResponseEntity<String>("Customer IS ADDED",HttpStatus.CREATED);
		}
		else{
			response=new ResponseEntity<String>("Customer IS NOT ADDED.",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    return response;
	}
/*	@RequestMapping(method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void addCustomer(@RequestBody Login login){
		System.out.println(login);
		System.out.println(login.getCustomer());
	}*/

	
/*	@RequestMapping(path="{customerId}", method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Emi> findEmiByCustomer(@PathVariable("customerId") int customerId){
		
		return service.findAllEmiByCustomer(customerId);
} NOT WORKING*/
	@RequestMapping(path="payment",method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updateMonthlyPayment(@RequestBody EmiPayment emiPayment){
		ResponseEntity<String> response;
		boolean result = service.updateMonthlyPayment(emiPayment);
		if(result){
			response=new ResponseEntity<String>("Payment Done",HttpStatus.CREATED);
		}
		else{
			response=new ResponseEntity<String>("Payment not Done.",HttpStatus.INTERNAL_SERVER_ERROR);
		}
	    return response;
	}
}
