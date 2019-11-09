# AppointmetDoctorPatient
simple Appointment spring boot application between doctors and patients

# application use :
  -SpringBoot
  -Hibernate
  -MySQL
  -JAVA 8
  
# Entity Classes :  
  1-Patient
  2-Doctor
  3-ApointmentSlot – a class representing a time slot when a particular doctor is available for a visit
  4-Appointment – a class representing an appointment made by Patient to see Doctor at a particular ApointmentSlot
  
# Relashionships
  -Doctor __ AppointmentSlot   ont to many
  -Appointment is one to one with Doctor, patient and AppointmentSlot

#
  using hibernate annotation to build tables, indecies, relationships  
