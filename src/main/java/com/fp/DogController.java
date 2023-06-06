package com.fp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DogDAO;
import com.model.Dog;



@RestController
public class DogController {
	
	@RequestMapping("/showDogs")
	public Dog showDog() {
		
		Dog dog = new Dog();
		return dog;
		
		
	}
	
	//Dependency Injection
		@Autowired
		DogDAO dogDao;
		
		@GetMapping("/getAllDog")
		public List<Dog> getAllDog() {
			return dogDao.getAllDog();
		}
		
		
			
		@PostMapping("registerNewDog")
		public Dog registerNewDog(@RequestBody Dog dog) {	
		    return dogDao.registerDog(dog);
		}

		@PutMapping("updateDog")
		public Dog updateDog(@RequestBody Dog dog) {	
		    return dogDao.updateNewDog(dog);
		}
        
	@DeleteMapping("deleteDog/{Id}")
	public String deleteDog(@PathVariable("Id") int Id) {
		dogDao.delete(Id);
	    return "Dog : " + Id + " Deleted Successfully!!!";
	}


		

}