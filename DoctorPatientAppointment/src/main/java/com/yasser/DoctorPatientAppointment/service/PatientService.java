package com.yasser.DoctorPatientAppointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.DoctorPatientAppointment.model.Patient;

@RestController
public class PatientService {
	@Autowired
	PatientReposetory patientReposetory;
	
	public void addPatient(Patient patient) {
		patientReposetory.save(patient);
	}

}
