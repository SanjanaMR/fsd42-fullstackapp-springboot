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

import com.dao.CatDAO;
import com.model.Cat;



@RestController
public class CatController {
	
	@RequestMapping("/showcats")
	public Cat showCats() {
		
		Cat cat = new Cat();
		return cat;
		
		
	}
	
	//Dependency Injection
		@Autowired
		CatDAO catDao;
		
		@GetMapping("/getAllCats")
		public List<Cat> getAllCats() {
			return catDao.getAllCat();
		}
		
		
			
		@PostMapping("registerNewCat")
		public Cat registerNewCat(@RequestBody Cat cat) {	
		    return catDao.registerCat(cat);
		}

		@PutMapping("updateCat")
		public Cat updateCat(@RequestBody Cat cat) {	
		    return catDao.updateNewCat(cat);
		}
        
	@DeleteMapping("deleteCat/{Id}")
	public String deleteCat(@PathVariable("Id") int Id) {
		catDao.delete(Id);
	    return "Cat : " + Id + " Deleted Successfully!!!";
	}


		

}