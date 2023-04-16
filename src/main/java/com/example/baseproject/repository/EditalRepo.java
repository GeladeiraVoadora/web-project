package com.example.baseproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.baseproject.model.Edital;

@Repository
public interface EditalRepo extends JpaRepository<Edital, String> {
    
    
}
