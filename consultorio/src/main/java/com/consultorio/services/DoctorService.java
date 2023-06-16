package com.consultorio.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultorio.model.Doctor;
import com.consultorio.repository.DoctoresRepository;

@Service
public class DoctorService {
	
private DoctoresRepository doctoresRepository;
	
	@Autowired
	public DoctorService(DoctoresRepository doctoresRepository) {
		this.doctoresRepository = doctoresRepository;
	}
	
	public List<Doctor> findAll() {
        return StreamSupport.stream(doctoresRepository.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }
	
	public Doctor save(Doctor stock) {
        return doctoresRepository.save(stock);
    }
}
