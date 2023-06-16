package com.consultorio.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.consultorio.model.Doctor;

@Repository
public interface DoctoresRepository extends CrudRepository<Doctor, Long>{

}
