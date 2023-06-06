package com.dao;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.Dog;

@Service
public class DogDAO {

	@Autowired
	DogRepository dogRepository;
	
	public List<Dog> getAllDog() {
		return dogRepository.findAll();
	}

	public Dog registerDog(Dog Dog) {
	    return dogRepository.save(Dog);
	}

	public Dog updateNewDog(Dog Dog) {
	    return dogRepository.save(Dog);
	}

	public void delete(int Id) {
	    dogRepository.deleteById(Id);
	}


}