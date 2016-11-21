import java.lang.String;
import java.util.*;

public class DoctorMap {
	
	protected HashMap<String, Doctor> map;
	
	public DoctorMap() {
		map = new HashMap<String, Doctor>();
		
		map.put("Leg", new Doctor("John", "123 Leg Rd", "555-555-5555", "legs"));
		map.put("Arm", new Doctor("James", "456 Arm Ave", "111-111-1111", "arms"));
		map.put("Head", new Doctor("Jim", "789 Head St", "222-222-2222", "heads"));
		map.put("Skin", new Doctor("Bob", "876 Skin Blvd", "123-456-789", "skin"));
	}

}
