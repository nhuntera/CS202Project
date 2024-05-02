package clinic;

import java.util.ArrayList;

public class Clinic {

	private ArrayList<Patient> patients;
	private ArrayList<Physician> physicians;
	
	public Clinic() {
		patients = new ArrayList<Patient>();
		physicians = new ArrayList<Physician>();
	}
	
	public void addPatient(Patient patient) {
		patients.add(patient);
	}
	
	public void addPhysician(Physician physician) {
		physicians.add(physician);
	}
	
	/*
	 * Book an appointment
	 * 
	 * @param patient
	 * @param hour
	 * 
	 * attemps to book an appointment if available
	 */
	public void bookAppointment(Patient patient, int hour) {
		
		Boolean available = false;
		
		for (Physician physician : physicians) {
			if (physician.isAvailable(hour)) {
				physician.addAppointment(patient, hour);
				available = true;
			}
		}
		if (!available) {
			System.out.println("Sorry, no physician is available at that time.");
		}
	}
}