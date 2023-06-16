package com.consultorio.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultorio.model.Consultorio;
import com.consultorio.repository.ConsultorioRepository;

@Service
public class ConsultorioService {

private ConsultorioRepository consultorioRepository;
	
	@Autowired
	public ConsultorioService(ConsultorioRepository consultorioRepository) {
		this.consultorioRepository = consultorioRepository;
	}
	
	public List<Consultorio> findAll() {
        return StreamSupport.stream(consultorioRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
	
	public Consultorio save(Consultorio stock) {
        return consultorioRepository.save(stock);
    }
}
