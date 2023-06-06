package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Veterinarian;

@Repository
public interface VeterinarianRepository extends JpaRepository <Veterinarian, Integer>{

}