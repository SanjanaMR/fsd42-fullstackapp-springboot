package com.fp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PetCareDAO;
import com.dao.VeterinarianDAO;
import com.model.PetCare;
import com.model.Veterinarian;

@RestController
public class VeterinarianController {
	
	@Autowired
	
	VeterinarianDAO vetDAO;
	//Dependency Injection
		
		
		@GetMapping("/getAllVeterinarian")
		public List<Veterinarian> getAllVeterinarians() {
			return vetDAO.getAllVeterinarians();
		}
		
		@PostMapping("registerVeterinarian")
		public Veterinarian registerVeterinarian(@RequestBody Veterinarian vet) {	
		    return vetDAO.registerVeterinarian(vet);
		}

	
	

}
