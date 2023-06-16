package com.consultorio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.consultorio.model.Consultorio;

@Repository
public interface ConsultorioRepository extends CrudRepository<Consultorio, Long>{

}
