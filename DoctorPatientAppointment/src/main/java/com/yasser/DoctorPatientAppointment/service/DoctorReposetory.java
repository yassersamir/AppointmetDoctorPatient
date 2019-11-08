package com.yasser.DoctorPatientAppointment.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yasser.DoctorPatientAppointment.model.Doctor;

public interface DoctorReposetory extends JpaRepository<Doctor, Long> {

}
