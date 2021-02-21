package npdbackend.npd.property;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class PropertyController {

@Autowired
	private PropertyRepository propertyRepository;
	
@GetMapping("property")
	 public List<Property> getProperty() {
		 return  this.propertyRepository.findAll();
				 
				 
				
	 }
 }

