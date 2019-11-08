package com.yasser.DoctorPatientAppointment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yasser.DoctorPatientAppointment.model.AppointmentSlot;
import com.yasser.DoctorPatientAppointment.service.AppoientmentSlotService;

@RestController
public class AppointmentSlotController {
	@Autowired
	AppoientmentSlotService appoientmentSlotService;
	@RequestMapping(value = "/appoientmentSlot", method = RequestMethod.POST)
	public void addappoientmentSlot(@RequestBody AppointmentSlot appointmentSlot) {
		appoientmentSlotService.addAppointmetSlot(appointmentSlot);
	}

}
