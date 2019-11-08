package com.yasser.DoctorPatientAppointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasser.DoctorPatientAppointment.model.AppointmentSlot;

@Service
public class AppoientmentSlotService {
	@Autowired
	private AppointmentSlotReposetory appointmentSlotReposetory;
	
	public void addAppointmetSlot(AppointmentSlot appointmentSlot) {
		appointmentSlotReposetory.save(appointmentSlot);
	}
	
	public void deleteAppointmentSlot(Long id) {
		appointmentSlotReposetory.deleteById(id);
	}

}
