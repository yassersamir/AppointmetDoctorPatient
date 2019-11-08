package com.yasser.DoctorPatientAppointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.DoctorPatientAppointment.model.Patient;
import com.yasser.DoctorPatientAppointment.service.PatientService;

@RestController
public class PatientController {
	@Autowired
	PatientService patientService;
	
	@RequestMapping(value = "/patient", method = RequestMethod.POST)
	public void addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
	}

}
