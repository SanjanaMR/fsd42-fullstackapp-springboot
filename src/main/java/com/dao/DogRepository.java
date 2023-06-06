package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Dog;


@Repository
public interface DogRepository extends JpaRepository<Dog, Integer> {

	@Query("from Dog d where d.dName = :dName")
	Dog findByName(@Param("dName") String dName);
    

	
}