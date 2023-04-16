package com.example.baseproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.baseproject.model.Edital;
import com.example.baseproject.repository.EditalRepo;

@Service
public class EditalService {

    @Autowired
    private EditalRepo editalRepo;

    public Edital criarEdital(Edital edital) {
        edital.setCreatedAt(new Date()); //FIXME: de onde importar o Date
        return editalRepo.save(edital);
    }

    public void deletarEdital(Long id) {
        editalRepo.deleteById(id); //FIXME: problema no delete
    }

    //mais operações de CRUD

    
}
