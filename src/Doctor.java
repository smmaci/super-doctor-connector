import java.lang.String;

public class Doctor {
	
	private String name;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	private String field;
	
	public Doctor(){
		name = "";
		streetAddress = "";
		city = "";
		state = "";
		zip = "";
		phoneNumber = "";
		field = "";
	}
	
	public Doctor(String n, String stA, String c, String s, String z, String p, String f) {
		name = n;
		streetAddress = stA;
		city = c;
		state = s;
		zip = z;
		phoneNumber = p;
		field = f;
	}
	
	public String toString() {
		return ("Name: " + name + "\nAddress:\n\n	" + streetAddress +
				"\n	" + city + ", " + state + " " + zip + "\n\nPhone Number: " + 
				phoneNumber + "\nField: " + field);
	}
	
	public void viewSymptoms(){
		
	}
	
	public void submitDiagnosis(){
		
	}
	
}
