package clinic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		//sets up Clinic and adds physicians to the clinic
		Clinic clinic = new Clinic();
		int[] morningHours = {6,7,8,9,10};
		int[] afternoonHours = {11,12,13,14,15};
		int[] eveningHours = {16,17,18,19,20};
		
		Physician drSmith = new Physician("Dr. Smith", morningHours);
		Physician drJones = new Physician("Dr. Jones", afternoonHours);
		Physician drBrown = new Physician("Dr. Brown", eveningHours);
		
		clinic.addPhysician(drSmith);
		clinic.addPhysician(drJones);
		clinic.addPhysician(drBrown);
		
		String name = "";
		String nationalId = "";
		int hour = 0;
		
		while (name != "quit") {
			
			System.out.println("Enter patient name or 'quit' to exit");
			name = keyboard.nextLine();
			
			if (!name.equals("quit")) {
				System.out.println("Enter patient national id");
				nationalId = keyboard.nextLine();
				Patient patient = new Patient(name, nationalId);
				System.out.println("Patient added, what time would you like to make an appointment? (24h time)");
				hour = keyboard.nextInt();
				keyboard.nextLine(); // needed so that the scanner will take the name input
				clinic.addPatient(patient);
				clinic.bookAppointment(patient, hour);
			}
			else {
				break;
			}
		
		}	
		
		System.out.println("Listing all appointments: ");
		clinic.ListAllAppointments();	
	}
		
}