package com.vtech.SpringBootDataJPA.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.vtech.SpringBootDataJPA.Model.Patient;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
//			List<Patient> findByCity(String city);
//	List<Patient> findByCityName(String city);
	
	 @Query("SELECT u FROM Patient u WHERE u.city =:city ")
			List<Patient> findByCity(@Param("city") String city);
	 
	 
	 @Query(
)
		List<Patient> findByRoomtypes(@Param("r") String room);

}