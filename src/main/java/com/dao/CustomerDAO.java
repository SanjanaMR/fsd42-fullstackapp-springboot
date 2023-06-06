package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;
import com.model.EmailService;

@Service
public class CustomerDAO {

	@Autowired
	CustomerRepository custRepository;

	public List<Customer> getAllCustomers() {
		return custRepository.findAll();
	}

	public Customer getCustomerByName(String custName) {
		return custRepository.findByName(custName);
	}

	public Customer registerCustomer(Customer cust) {
		String emailContent = "Dear " + cust.getCustName()+ ",\n\n"
		        + "Thank you for registering with FluffyTails.";
		    EmailService.sendEmail(emailContent, "Welcome to Fluffy Tails Family",cust.getEmailId(),
		        "tailsfluffy2@gmail.com");
		return custRepository.save(cust);
	}

	public Customer updateCustomer(Customer cust) {
		return custRepository.save(cust);
	}

	public void deleteCustomer(int custId) {
		custRepository.deleteById(custId);

	}

	public Customer custLogin(String emailId, String password) {
		return custRepository.custLogin(emailId, password);
	}

	public Customer getCustomerByEmailId(String emailId) {

		return custRepository.findByEmailId(emailId);
	}

}
