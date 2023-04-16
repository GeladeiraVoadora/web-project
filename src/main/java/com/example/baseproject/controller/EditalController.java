package com.example.baseproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.baseproject.model.Edital;
import com.example.baseproject.service.EditalService;

@RestController
@RequestMapping("/editais")
public class EditalController {

    @Autowired
    private EditalService editalService;

    @PostMapping
    public ResponseEntity<Edital> criarEdital(@RequestBody Edital edital) {
    Edital criarEdital = editalService.criarEdital(edital);
    return new ResponseEntity<Edital>(criarEdital, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarEdital(@PathVariable Long id) {
        editalService.deletarEdital(id);
        return ResponseEntity.noContent().build();
    }
}