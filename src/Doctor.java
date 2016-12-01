import java.lang.String;

public class Doctor {
	
	protected String name;
	protected String streetAddress;
	protected String city;
	protected String state;
	protected String zip;
	protected String phoneNumber;
	protected String field;
	
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
		return ("Name: " + name + "\nAddress:\n	" + streetAddress +
				"\n	" + city + ", " + state + " " + zip + "\n\nPhone Number: " + 
				phoneNumber + "\nField: " + convertField() + "\n\n");
	}
	
	public void viewSymptoms(){
		
	}
	
	public void submitDiagnosis(){
		
	}
	
	private String convertField() {
		switch (field.toLowerCase()) {
			case "skin":	return "Dermatology";
			case "arm":		return "Orthopedics";
			case "head":	return "Neurology";
			case "leg":		return "Orthopedics";
			case "heart":	return "Cardiology";
			case "chest":	return "Pulmonology";
			case "neck":	return "Chiropractic";
			case "throat":	return "Otolaryngologist";
			case "eyes": 	return "Ophthalmologist";
			case "feet":	return "podiatrist";
			case "hand":	return "Orthopedics";
			default:		return "General Physician";
		}
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
