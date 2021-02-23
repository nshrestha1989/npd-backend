package npdbackend.npd.property;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("npd/")
public class PropertyController {

@Autowired
	private PropertyRepository propertyRepository;
	
@GetMapping("property")
	 public List<Property> getProperty() {
		 return  this.propertyRepository.findAll();
				
				
	 }

//	@Autowired
//	private PropertyService propertyService;
//	
	@PostMapping("property")
	public Property addProperty(@RequestBody Property newProperty) {
		return propertyRepository.save(newProperty);
	}
	
 }

