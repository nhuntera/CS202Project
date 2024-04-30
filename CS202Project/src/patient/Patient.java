package patient;
import java.util.Scanner;
import java.util.ArrayList;

//Define Patient class
public class Patient {
	private String name;
	private String nationalId;
	
//Constructor
	public Patient(String name, String nationalId) {
		this.name = name;
		this.nationalId = nationalId;
	}
//Getters
	public String getName() {
		return name;
	}
	
	public String getNationalId() {
		return nationalId;
	}
}



