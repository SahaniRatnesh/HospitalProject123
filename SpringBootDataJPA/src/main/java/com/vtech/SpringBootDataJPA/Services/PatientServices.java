package com.vtech.SpringBootDataJPA.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.vtech.SpringBootDataJPA.Model.Patient;
import com.vtech.SpringBootDataJPA.Repository.PatientRepository;

@Service
public class PatientServices {
	@Autowired
	PatientRepository patientRepository;
	public ArrayList<Patient> getAllPatient(){
		return (ArrayList<Patient>) patientRepository.findAll();
	}
	public void savePatient(Patient p) {
		patientRepository.save(p);
	}
	
//	public List<Patient> findByCity(String city){
//		return patientRepository.findByCity(city);
//	}
	public void updatePatient(Patient p) {
		Patient temp = patientRepository.findById(p.getId()).get();
		temp.setName(p.getName());
		temp.setCity(p.getCity());
		patientRepository.save(temp);
		
	}
	public Optional<Patient> findById(Long id){
		return patientRepository.findById(id);
	}
	public List<Patient> findByCity(String city){
		return patientRepository.findByCity(city);
	}
	public List<Patient> findByRoomtypes(String room) {
		return patientRepository.findByRoomtypes(room);
	}
	

}
