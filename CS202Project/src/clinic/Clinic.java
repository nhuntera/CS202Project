package clinic;

import java.util.ArrayList;

public class Clinic {

	private ArrayList<Patient> patients;
	private ArrayList<Physician> physicians;
	
	/*
	 * Constructor
	 * 
	 * Initializes patients and physician lists
	 */
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
	 * Attempts to book an appointment if available adding it to the appointments list in the physician object
	 */
	public void bookAppointment(Patient patient, int hour) {
		
		Boolean available = false;
		
		for (Physician physician : physicians) {
			if (physician.isAvailable(hour)) {
				physician.addAppointment(patient, hour);
				available = true;
				System.out.println("Your appointment has been booked.");
			}
		}
		if (!available) {
			System.out.println("Sorry, no physician is available at that time.");
		}
	}
	
	public void ListAllAppointments() {
		
		for (Physician physician : physicians) {
			System.out.print(physician.getName() + ": ");
			physician.ListAppointments();
		}
		
	}
	
	
}