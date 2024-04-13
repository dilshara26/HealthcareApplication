import java.util.Calendar;

    public abstract class Appointment {
        private final Patient patient;
        private final Doctor doctor;
        private String notes;
        private Calendar appointmentDate;
        public Appointment(Calendar appointmentDate, Patient patient, Doctor doctor, String notes ){
            this.patient=patient;
            this.doctor = doctor;
            this.appointmentDate = appointmentDate;
            this.notes = notes;
        }

    public Patient getPatient() {
        return patient;
    }

    public final void setPatient(Patient patient) {
        System.out.println("Patient cannot be set");
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public final void setDoctor(Doctor doctor) {
        System.out.println("Doctor cannot be switched once set");
    }

    public String getNotes() {
        return notes;
    }

    public abstract void setNotes(String notes);
    public Calendar getAppointmentDate() {
        return appointmentDate;
    }

    public abstract void setAppointmentDate(Calendar appointmentDate);


}
