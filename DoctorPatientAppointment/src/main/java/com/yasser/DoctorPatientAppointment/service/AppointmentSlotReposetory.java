package com.yasser.DoctorPatientAppointment.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasser.DoctorPatientAppointment.model.AppointmentSlot;

public interface AppointmentSlotReposetory extends JpaRepository<AppointmentSlot, Long> {

}
