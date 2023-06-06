package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.model.Cat;


@Repository
public interface CatRepository extends JpaRepository<Cat, Integer> {

	@Query("from Cat c where c.cName = :cName")
	Cat findByName(@Param("cName") String cName);
    

	
}