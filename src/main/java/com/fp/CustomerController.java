package com.fp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDAO;
import com.model.Customer;
import com.model.EmailService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDAO custDAO;
	
	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		return custDAO.getAllCustomers();
	}
	
//	@GetMapping("/getCustomerById/{custId}")
//	public Customer getCustomerBy(@PathVariable("custId") int custId) {
//		return custDAO.getCustomerById(custId);
//	}
	
	@GetMapping("/getCustomerByName/{custName}")
	public Customer getCustomerByName(@PathVariable("custName") String custName) {
		return custDAO.getCustomerByName(custName);
	}
	
	@PostMapping("/registerCustomer")
	public Customer registerCustomer(@RequestBody Customer cust) {
//		String emailContent = "Dear " + cust.getCustName()+ ",\n\n"
//		        + "Thank you for registering with FluffyTails.";
//		    EmailService.sendEmail(emailContent, "Welcome to Fluffy Tails Family",cust.getEmailId(),
//		        "");

	return	custDAO.registerCustomer(cust);

		
	}
	
	@PutMapping("/updateCustomer")
	public Customer updateCustomer(@RequestBody Customer cust) {
		return custDAO.updateCustomer(cust);
	}
	
	@DeleteMapping("/deleteCustomer/{custId}")
	public String deleteCustomer(@PathVariable("custId") int custId) {
		custDAO.deleteCustomer(custId);
		return "Customer " + custId + " Deleted Successfully!!!";
	}
	
	@GetMapping("/custLogin/{emailId}/{password}")
	public Customer empLogin(@PathVariable("emailId") String emailId, @PathVariable("password") String password) {
		return custDAO.custLogin(emailId, password);
	}
	
}
