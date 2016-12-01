import java.lang.String;
import java.util.*;
import java.io.*;

public class DoctorList {
	
	protected ArrayList<Doctor> dlist;
	
	public DoctorList() {
		dlist = new ArrayList<Doctor>();
		
		String name, stAddr, city, state, zip, phone, field;
		
		try
		{
			BufferedReader bfr = new BufferedReader(new FileReader("doctors.txt"));
			String line = bfr.readLine();
			while (line != null) 
			{
				StringTokenizer tokens = new StringTokenizer(line,";");
				name = tokens.nextToken();
				stAddr = tokens.nextToken();
				city = tokens.nextToken();
				state = tokens.nextToken();
				zip = tokens.nextToken();
				phone = tokens.nextToken();
				field = tokens.nextToken().toLowerCase();
				
				dlist.add(new Doctor(name, stAddr, city, state, zip, phone, field));
				
				line = bfr.readLine();
			}
			bfr.close();
		}
		catch (Exception ex)
		{
			System.err.println("ERROR: " + ex.getMessage());
		}
		

	}
	
	public void addDoctor(Doctor d){
		dlist.add(d);
		BufferedWriter bfw = null;
		try {
			bfw = new BufferedWriter(new FileWriter("doctors.txt", true));
			bfw.write("\n" + d.getName() + ";" + d.getStreetAddress() + ";" + d.getCity() + ";" + d.getState() + ";" + d.getZip() + ";" + d.getPhoneNumber() + ";" + d.getField());
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
	
	public Doctor findDoctor(String field, String state) {
		Doctor closeDr = new Doctor();
		for(int i = 0; i < dlist.size(); i++) {
			Doctor d = dlist.get(i);
			if((d.getField().equals(field)) && (d.getState().equals(state))) {
				closeDr = new Doctor(d);
			}
		}

		return closeDr;
	}
	
	public String toString() {
		String s = "";
		for(int i = 0; i < dlist.size(); i++) {
			Doctor d = dlist.get(i);
			s += d.toString();
		}
		return s;
	}

}
