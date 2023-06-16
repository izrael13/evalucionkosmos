package com.consultorio.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.stereotype.Service;

import com.consultorio.model.Cita;
import com.consultorio.repository.CitaReposotory;

@Service
public class CitaService {

	private CitaReposotory citaReposotory;

	public CitaService(CitaReposotory citaReposotory) {
		this.citaReposotory = citaReposotory;
	}
	
	public List<Cita> findAll() {
        return StreamSupport.stream(citaReposotory.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
	
	public Cita save(Cita stock) {
        return citaReposotory.save(stock);
    }
	
	
}
