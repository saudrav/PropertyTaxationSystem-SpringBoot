package saudrav.springframework.services;

import java.util.List;

import saudrav.springframework.models.PropertyTaxPyt;

public interface PropertyTaxPytService {

	List<PropertyTaxPyt> getAll();

	String addAll(List<PropertyTaxPyt> propertyTaxPyt);
	
	String deleteAll();
}
