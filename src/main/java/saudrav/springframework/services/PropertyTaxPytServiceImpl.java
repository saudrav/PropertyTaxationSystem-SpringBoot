package saudrav.springframework.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import saudrav.springframework.models.PropertyTaxPyt;
import saudrav.springframework.repositories.PropertyTaxPytRepository;

@Service
public class PropertyTaxPytServiceImpl implements PropertyTaxPytService{
	
	@Autowired
	private PropertyTaxPytRepository propertyTaxPytRepository;

	@Override
	public List<PropertyTaxPyt> getAll() {
		return propertyTaxPytRepository.findAll();
	}


	@Override
	public String addAll(List<PropertyTaxPyt> propertyTaxPyts) {
		
		for(PropertyTaxPyt ptp : propertyTaxPyts) {
			propertyTaxPytRepository.save(ptp);
		}
		return "Records added to DB";
	}


	@Override
	public String deleteAll() {
		propertyTaxPytRepository.deleteAll();
		return "Records deleted from DB";
	}

}
