package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.EmailService;
import com.model.PetCare;

@Service
public class PetCareDAO {
	
	@Autowired
	PetCareRepository petRepository;
	
	public List<PetCare> getAllProducts() {
		return petRepository.findAll();
	}
	

	public List<PetCare> getAllPetCare() {
		return petRepository.findAll();
		
	}

	public PetCare registerPetCare(PetCare petCare) {
		String emailContent = "Dear " + petCare.getOwnerName()+ ",\n\n"
		        + "Thank you for registering your pet with FluffyTails.";
		    EmailService.sendEmail(emailContent, "Welcome to Fluffy Tails Family",petCare.getOwnerMail(),
		        "tailsfluffy2@gmail.com");
		 return petRepository.save(petCare);
	}
	
	


}