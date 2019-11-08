package com.yasser.DoctorPatientAppointment.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasser.DoctorPatientAppointment.model.Patient;

public interface PatientReposetory extends JpaRepository<Patient, Long> {

}
