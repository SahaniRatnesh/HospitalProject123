package com.vtech.SpringBootDataJPA.Repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.vtech.SpringBootDataJPA.Model.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
	List<Patient> findByCity(String city);
	

}