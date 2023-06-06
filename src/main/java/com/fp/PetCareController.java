package com.fp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.dao.PetCareDAO;
import com.model.EmailService;
import com.model.PetCare;

@RestController
public class PetCareController {
   
	@Autowired
	PetCareDAO petDAO;
	//Dependency Injection
		
		
		@GetMapping("/getAllPetCare")
		public List<PetCare> getAllPetCare() {
			return petDAO.getAllPetCare();
		}
		
		@PostMapping("registerPetCare")
		public PetCare registerPetCare(@RequestBody PetCare petCare) {	
			
		    return petDAO.registerPetCare(petCare);
		}

	
	
	
}