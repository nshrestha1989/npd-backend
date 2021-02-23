//package npdbackend.npd.Controller;
//
//
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import npdbackend.npd.owner.Owner;
//import npdbackend.npd.owner.OwnerRepository;
//import npdbackend.npd.property.Property;
//import npdbackend.npd.property.PropertyRepository;
//
//@CrossOrigin(origins = {"http://localhost:3000"})
//@RestController
//@RequestMapping("npd/")
//public class formController {
//
//@Autowired
//	private PropertyRepository propertyRepository;
//
//
//@Autowired
//OwnerRepository ownerRepository;
//	
//@GetMapping("property")
//	 public List<Property> getProperty() {
//		 return  this.propertyRepository.findAll();
//				
//				
//	 }
//
//	
//	@PostMapping("property")
//	public Property addProperty(@RequestBody Property newProperty) {
//		return propertyRepository.save(newProperty);
//	}
//	
//	
//	@PostMapping("owner")
//	public Owner addOwner(@RequestBody Owner newOwner) {
//		return ownerRepository.save(newOwner);
//
//}
//	
// }
//
