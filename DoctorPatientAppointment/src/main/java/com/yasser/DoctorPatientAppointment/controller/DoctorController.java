package com.yasser.DoctorPatientAppointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.DoctorPatientAppointment.model.Doctor;
import com.yasser.DoctorPatientAppointment.service.DoctorService;

@RestController
public class DoctorController {
	@Autowired
	DoctorService doctorService;
	
	@RequestMapping(value = "/doctor", method = RequestMethod.POST)
	public void addDoctor(@RequestBody Doctor doctor) {
		doctorService.addDoctor(doctor);
	}

}
