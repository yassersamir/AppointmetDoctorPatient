package com.yasser.DoctorPatientAppointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.DoctorPatientAppointment.model.Appointment;
import com.yasser.DoctorPatientAppointment.service.AppointmentService;

@RestController
public class AppointmentController {
	@Autowired
	private AppointmentService appointmentService;
	@RequestMapping(value = "/appoientment", method = RequestMethod.POST)
	public void addAppointment(@RequestBody Appointment appointment) {
		appointmentService.addAppointment(appointment);
	}

}
