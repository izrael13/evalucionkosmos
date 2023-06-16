package com.consultorio.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.consultorio.model.Cita;
import com.consultorio.model.Consultorio;
import com.consultorio.model.Doctor;
import com.consultorio.services.CitaService;
import com.consultorio.services.ConsultorioService;
import com.consultorio.services.DoctorService;

@Controller
public class ConsultorioController {

	private DoctorService doctorService;
	
	private ConsultorioService consultorioService;
	
	private CitaService citaService;

	public ConsultorioController(DoctorService doctorService, ConsultorioService consultorioService, CitaService citaService) {
		this.doctorService = doctorService;
		this.consultorioService = consultorioService;
		this.citaService = citaService;
	}
	
	@GetMapping("/")
	public String main() {
		return "main";
	}
	
	@GetMapping("/listadoctores")
	public String listaDoctores(Model model) {
		model.addAttribute("lista", doctorService.findAll());
		return "listadoctores";
	}
	
	@GetMapping("/grabardoctor")
    public String grabarDoctor(Model model) {
        model.addAttribute("doctor", new Doctor());
        return "grabardoctor";
    }
	
	@PostMapping(value = "/adddoctor", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String adddoctor(@Valid @ModelAttribute Doctor doctor, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "grabardoctor";
        }
        doctorService.save(doctor);
        model.addAttribute("lista", doctorService.findAll());
		return "listadoctores";
    }
	
	@GetMapping("/listaconsultorios")
	public String listaconsultorios(Model model) {
		model.addAttribute("lista", consultorioService.findAll());
		return "listaconsultorios";
	}
	
	@GetMapping("/grabarconsultorio")
    public String grabarconsultorio(Model model) {
        model.addAttribute("consultorio", new Consultorio());
        return "grabarconsultorio";
    }
	
	@PostMapping(value = "/grabarconsultorio", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String addconsultorio(@Valid @ModelAttribute Consultorio consultorio, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "grabarconsultorio";
        }
        consultorioService.save(consultorio);
        model.addAttribute("lista", consultorioService.findAll());
		return "listaconsultorios";
    }
	
	@GetMapping("/listacitas")
	public String listacitas(Model model) {
		model.addAttribute("lista", citaService.findAll());
		return "listacitas";
	}
	
	@GetMapping("/grabarcita")
    public String grabarcita(Model model) {
        model.addAttribute("cita", new Cita());
        model.addAttribute("consultorios", consultorioService.findAll());
        model.addAttribute("doctores", doctorService.findAll());
        return "grabarcita";
    }
	
	@PostMapping(value = "/grabarcita", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String grabarcita(@Valid @ModelAttribute Cita cita, BindingResult result, Model model) {
		
		List<Cita> citas = citaService.findAll();
		Long banMismoConFecha = 0L;
		Long banMismoDocFecha = 0L;
		Long numCita = 0L;
		if(citas.size() > 0)
		{
			//No se puede agendar cita en un mismo consultorio a la misma hora.
			 banMismoConFecha =  citas.stream().filter(c -> c.getIdConsultorio().equals(cita.getIdConsultorio()) && c.getFecha().equals(cita.getFecha()) && c.getHora().equals(cita.getHora())).count();
			
			if(banMismoConFecha > 0)
			{
				model.addAttribute("error", "No se puede agendar cita en un mismo consultorio a la misma hora.");
			}
			
			 banMismoDocFecha =  citas.stream().filter(c -> c.getIdDoctor().equals(cita.getIdDoctor()) && c.getFecha().equals(cita.getFecha()) && c.getHora().equals(cita.getHora())).count();
			
			if(banMismoDocFecha > 0)
			{
				model.addAttribute("error", "No se puede agendar cita para un mismo Dr. a la misma hora..");
			}
			
			numCita = citas.stream().filter(c -> c.getIdDoctor().equals(cita.getIdDoctor()) && c.getFecha().equals(cita.getFecha())).count();	

		}
				
        if (result.hasErrors()) {
            return "grabarcita";
        }
        
        if(banMismoConFecha == 0 && banMismoDocFecha == 0 && numCita < 8)
        	citaService.save(cita);
        else
        	return "grabarcita";
        
        model.addAttribute("lista", citaService.findAll());
		return "listacitas";
    }
}
