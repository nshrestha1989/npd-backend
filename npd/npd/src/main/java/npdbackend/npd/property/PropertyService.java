//package npdbackend.npd.property;
//
//import java.util.*;
//import org.springframework.beans.factory.annotation.Autowired;
//
//public class PropertyService {
//	
//	@Autowired
//	PropertyRepository repository;
//	
//	public Property findById(Long id) {
//		return repository.getOne (id);
//	}
//
//	public List <Property> getAll() {
//		return repository.findAll ();
//	}
//	
//	public void create(Property property) {
//		repository.save(property);
//	}
//	
//	public void update(Property updateProperty) {
//		Property PropertyToBeUpdated=repository.getOne(updateProperty.getId());
//		PropertyToBeUpdated.setId(updateProperty.getId());
//		PropertyToBeUpdated.setTitle(updateProperty.getTitle());
//		PropertyToBeUpdated.setPicture(updateProperty.getPicture());
//		PropertyToBeUpdated.setPrice(updateProperty.getPrice());
//		PropertyToBeUpdated.setAddress(updateProperty.getAddress());
//		repository.save(PropertyToBeUpdated);
//			
//	}
//
//	public void delete(Long id) {
//		repository.deleteById(id);
//	}
//	
//}
