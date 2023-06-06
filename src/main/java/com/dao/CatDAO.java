package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.model.Cat;

@Service
public class CatDAO {

	@Autowired
	CatRepository catRepository;
	
	public List<Cat> getAllCat() {
		return catRepository.findAll();
	}

	public Cat registerCat(Cat Cat) {
	    return catRepository.save(Cat);
	}

	public Cat updateNewCat(Cat Cat) {
	    return catRepository.save(Cat);
	}

	public void delete(int Id) {
	    catRepository.deleteById(Id);
	}


}