package com.yasser.DoctorPatientAppointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasser.DoctorPatientAppointment.model.Doctor;

@Service
public class DoctorService {
	@Autowired
	private DoctorReposetory doctorReposetory;
	
	public void addDoctor(Doctor doctor) {
		doctorReposetory.save(doctor);
	}

}
