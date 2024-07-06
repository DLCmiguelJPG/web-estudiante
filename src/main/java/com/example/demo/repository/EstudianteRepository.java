package com.example.demo.repository;

import com.example.demo.entity.EstudianteEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
    public interface    EstudianteRepository
extends CrudRepository<EstudianteEntity, Integer> {


}
