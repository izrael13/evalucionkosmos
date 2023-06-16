package com.consultorio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.consultorio.model.Cita;

@Repository
public interface CitaReposotory extends CrudRepository<Cita, Long>{

}
