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
	
	public Doctor(Doctor other) {
		this.name = other.name;
		this.streetAddress = other.streetAddress;
		this.city = other.city;
		this.state = other.state;
		this.zip = other.zip;
		this.phoneNumber = other.phoneNumber;
		this.field = other.field;
	}
	
	public String toString() {
		return ("Name: " + name + "\nAddress:\n\n	" + streetAddress +
				"\n	" + city + ", " + state + " " + zip + "\n\nPhone Number: " + 
				phoneNumber + "\nField: " + field + "\n");
	}
	
	public void viewSymptoms(){
		
	}
	
	public void submitDiagnosis(){
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getStreetAddress() {
		return streetAddress;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getField() {
		return field;
	}
	
}
