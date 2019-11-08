# AppointmetDoctorPatient
simple Appointment spring boot application between doctors and patients

# application use :
  -SpringBoot
  -Hibernate
  -MySQL
  -JAVA 8
  
# Entity Classes :  
  -Patient
  -Doctor
  -ApointmentSlot – a class representing a time slot when a particular doctor is available for a visit
  -Appointment – a class representing an appointment made by Patient to see Doctor at a particular ApointmentSlot
  
# Relashionships
  -Doctor __ AppointmentSlot   ont to many
  -Appointment is one to one with Doctor, patient and AppointmentSlot

#
  using hibernate annotation to build tables, indecies, relationships  
