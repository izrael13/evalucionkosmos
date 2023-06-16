package com.consultorio.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cita {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	private Long idConsultorio;
	private Long idDoctor;
	private String fecha;
	private String hora;
	private String paciente;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Long getIdConsultorio() {
		return idConsultorio;
	}
	public void setIdConsultorio(Long idConsultorio) {
		this.idConsultorio = idConsultorio;
	}
	public Long getIdDoctor() {
		return idDoctor;
	}
	public void setIdDoctor(Long idDoctor) {
		this.idDoctor = idDoctor;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getPaciente() {
		return paciente;
	}
	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	
}
