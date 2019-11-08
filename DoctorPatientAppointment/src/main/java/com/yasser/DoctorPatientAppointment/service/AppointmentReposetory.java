package com.yasser.DoctorPatientAppointment.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasser.DoctorPatientAppointment.model.Appointment;

public interface AppointmentReposetory extends JpaRepository<Appointment, Long> {

}
