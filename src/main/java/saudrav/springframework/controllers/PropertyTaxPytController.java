package saudrav.springframework.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import saudrav.springframework.exception.PropertyTaxPytException;
import saudrav.springframework.models.PropertyTaxPyt;
import saudrav.springframework.services.PropertyTaxPytService;
import saudrav.springframework.services.PropertyTaxationUtilService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/propertytax")
public class PropertyTaxPytController {
	
	@Autowired
	private PropertyTaxationUtilService propertyTaxationUtilService;
	
	@Autowired
	private PropertyTaxPytService propertyTaxPytService;
	
	
	@PostMapping("/addrecords")
	public ResponseEntity<String> addAllRecords() throws PropertyTaxPytException {

		List<PropertyTaxPyt> propertyTaxPyt = propertyTaxationUtilService.addPropTaxDetails("inputfeed.txt");
		
		ResponseEntity<String> re = new ResponseEntity<>(propertyTaxPytService.addAll(propertyTaxPyt), HttpStatus.CREATED);
		
		return re;
		
	}
	
	@DeleteMapping("/clearall")
	public ResponseEntity<String> cleanAllRecords() throws PropertyTaxPytException {		

		ResponseEntity<String> re = new ResponseEntity<>(propertyTaxPytService.deleteAll(), HttpStatus.OK);
		return re;		
	}
	

	@GetMapping("/taxpayers")
	public List<PropertyTaxPyt> showTaxPayers() throws PropertyTaxPytException {		

		List<PropertyTaxPyt> propertyTaxPyts = propertyTaxPytService.getAll();
		return propertyTaxPyts;
		
	}
	
}
