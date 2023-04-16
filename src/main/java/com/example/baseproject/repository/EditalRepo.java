package com.example.baseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

import com.example.baseproject.model.Edital;

@Repository
public interface EditalRepo extends CrudRepository<Edital, String> {

    List<Edital> findByTitulo(String titulo);
    List<Edital> findByDescricao (String descricao);
    List<Edital> findByPrazo (int prazo);
    List<Edital> findByRequisitos (String requisitos);


    
}
