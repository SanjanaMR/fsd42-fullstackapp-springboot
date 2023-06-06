package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Customer;

@Repository
public interface CustomerRepository  extends JpaRepository<Customer, Integer> {
	
	@Query("from Customer c where c.custName = :custName")
	Customer findByName(@Param("custName") String custName);

	@Query("from Customer c where c.emailId = :emailId and c.password = :password")
	Customer custLogin(@Param("emailId") String emailId, @Param("password") String password);

	@Query("from Customer c where c.emailId = :emailId")
	Customer findByEmailId(@Param("emailId") String emailId);

    
	
}
