package npdbackend.npd.owner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("npd/")
public class OwnerController {
	
	@Autowired
	OwnerRepository ownerRepository;
	
	@PostMapping("owner")
	public Owner addOwner(@RequestBody Owner newOwner) {
		return ownerRepository.save(newOwner);

}

}