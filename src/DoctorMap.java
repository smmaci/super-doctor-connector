import java.lang.String;
import java.util.*;
import java.io.*;

public class DoctorMap {
	
	protected HashMap<String, Doctor> map;
	
	public DoctorMap() {
		map = new HashMap<String, Doctor>();
		
		/*
		map.put("Leg", new Doctor("John", "123 Leg Rd", "555-555-5555", "leg"));
		map.put("Arm", new Doctor("James", "456 Arm Ave", "111-111-1111", "arm"));
		map.put("Head", new Doctor("Jim", "789 Head St", "222-222-2222", "head"));
		map.put("Skin", new Doctor("Bob", "876 Skin Blvd", "123-456-789", "skin"));
		map.put("Heart", new Doctor("Tom", "179 Heart Blvd", "941-232-343", "heart"));
		map.put("Chest", new Doctor("Bilbo Baggins", "264 Chest Ave", "735-132-777", "chest"));
		map.put("Neck", new Doctor("Frodo", "321 Neck St", "842-462-964", "neck"));
		map.put("Throat", new Doctor("Gandalf", "394 Throat Blvd", "567-523-975", "throat"));
		map.put("Stomach", new Doctor("Harry Potter", "953 Stomach St", "123-345-678", "stomach"));
		*/
		
		String name, addr, phone, field;
		
		try
		{
			BufferedReader bfr = new BufferedReader(new FileReader("doctors.txt"));
			String line = bfr.readLine();
			while (line != null) 
			{
				StringTokenizer tokens = new StringTokenizer(line,";");
				name = tokens.nextToken();
				addr = tokens.nextToken();
				phone = tokens.nextToken();
				field = tokens.nextToken().toLowerCase();
				map.put(field, new Doctor(name, addr, phone, field));
				
				line = bfr.readLine();
			}
			bfr.close();
		}
		catch (Exception ex)
		{
			System.err.println("ERROR: " + ex.getMessage());
		}
		

	}
	
	public void addDoctor(String name, String address, String number, String field){
		BufferedWriter bfw = null;
		try {
			bfw = new BufferedWriter(new FileWriter("doctors.txt", true));
			bfw.write("\n" + name + ";" + address + ";" + number + ";" + field);
		} catch (IOException e) {
			System.err.println("ERROR: " + e.getMessage());
		}
    	finally {
    		try {
    			// Close the writer regardless of what happens...
    			bfw.close();
    		} 
    		catch (Exception e) {
    		}
    	}        
	} 

}
