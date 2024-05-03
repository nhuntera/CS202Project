package clinic;

import java.util.ArrayList;

public class Physician {
	private String name;
	// array of hours available in 24 time format
	private int[] availableHours;
	private ArrayList<String> appointments;
	
//Constructor
	
	// hour is in 24 time eg. 5am = 5 and 5pm = 17
	// each hour should be listed in avalableHours 
	//if physician is available from 6am to 10pm (6,7,8,9,10,11,12,13,14,15,16,17)
	
	/*
	 * @param name
	 * @param avalableHours
	 * 
	 * Creates a new physician with a String name and available hours as an array of integers
	 */
	public Physician(String name, int[] availableHours) {
		this.name = name;
		this.availableHours = availableHours;
		
		this.appointments = new ArrayList<String>();
		
	}
	
//Getters
	public String getName() {
		return name;
	}
	
	public int[] getAvalableHours() {
		return availableHours;
	}

	public ArrayList<String> getAppointments() {
		return appointments;
	}
	
//Methods
	
	/*
	 * @param hour
	 * 
	 * Returns true if the physician is available at the given hour
	 */
	public Boolean isAvailable(int hour) {
		 
		for (int i = 0; i < availableHours.length; i++) {
			if (availableHours[i] == hour) {
				return true;
			}
		}
		return false;
		
	}

	/*
	 * @param patient
	 * @param hour
	 * 
	 * Adds an appointment to the object's appointments list
	 */
	public void addAppointment(Patient patient, int hour) {
		
		String appointment = patient.getName() + " " + patient.getNationalId() + ": " + hour;
		appointments.add(appointment);
		
	}
	
	/*
	 * Lists appointments to the console
	 */
	public void ListAppointments() {
		
		System.out.println(appointments.toString());
		
	}

}
