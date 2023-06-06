package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.EmailService;
import com.model.Veterinarian;
@Service
public class VeterinarianDAO {
	
	@Autowired
	VeterinarianRepository veterinarianRepository;

	public List<Veterinarian> getAllVeterinarians() {
		return veterinarianRepository.findAll();
	}

	public Veterinarian registerVeterinarian(Veterinarian vet) {
		String emailContent = "Dear " + vet.getMailAdd()+ ",\n\n"
		        + "Thank you for booking a vet appointment with FluffyTails.";
		    EmailService.sendEmail(emailContent, "Welcome to Fluffy Tails Family",vet.getMailAdd(),
		        "tailsfluffy2@gmail.com");
		return veterinarianRepository.save(vet);
	}

	

}