package com.yasser.DoctorPatientAppointment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yasser.DoctorPatientAppointment.model.Appointment;

@Service
public class AppointmentService {
	
	@Autowired
	private AppointmentReposetory appointmentReposetory;
	@Autowired
	private AppoientmentSlotService appoientmentSlotService;
	
	public void addAppointment(Appointment appointment) {
		appointmentReposetory.save(appointment);
		appoientmentSlotService.deleteAppointmentSlot(appointment.getAppointmentSlot().getId());
		
	}

}
