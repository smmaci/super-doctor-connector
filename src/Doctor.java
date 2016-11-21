import java.lang.String;

public class Doctor {
	
	private String name;
	private String address;
	private String phoneNumber;
	private String field;
	
	public Doctor(){
		name = "";
		address = "";
		phoneNumber = "";
		field = "";
	}
	
	public Doctor(String n, String a, String p, String f) {
		name = n;
		address = a;
		phoneNumber = p;
		field = f;
	}
	
	public String toString() {
		return ("Name: " + name + "\nAddress: " + address +
				"\nPhone Number: " + phoneNumber + "\nField: " + field);
	}
	
	public void viewSymptoms(){
		
	}
	
	public void submitDiagnosis(){
		
	}
	
}
