package com.vtech.SpringBootDataJPA.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vtech.SpringBootDataJPA.Model.Patient;
import com.vtech.SpringBootDataJPA.Services.PatientServices;
@CrossOrigin("*")
@RestController
public class PatientController {

	@Autowired
	PatientServices patientServices;

	@GetMapping("/patient")
	public ArrayList<Patient> getPatient() {
		return patientServices.getAllPatient();
	}
	@GetMapping("/patient/{id}")
	public Optional<Patient> findPatient(@PathVariable(name="id", required = true)  Long id) {
		return patientServices.findById(id);
	}

	@PostMapping("/patient")
	public String saveEmployee(@RequestBody Patient p) {
		patientServices.savePatient(p);
		return "data saved ";
	}

	@GetMapping("/patientByCity/{city}")
	public List<Patient> findByCity(@PathVariable(name="city", required = true) String city) {
		return patientServices.findByCity(city);
	}

	@PutMapping("/patient")
	public String updateEmp(@RequestBody Patient e) {
		patientServices.updatePatient(e);
		return "Updated ";

	}

}