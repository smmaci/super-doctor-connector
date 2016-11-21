import java.lang.String;

public class Patient extends Problem{

	private String name;
	private String address;
	private String phoneNumber;
	private Problem prob;
	
	public Patient(){
		name = "";
		address = "";
		phoneNumber = "";
		prob = new Problem();
	}
	
	public Patient(String n, String a, String pn, Problem p) {
		name = n;
		address = a;
		phoneNumber = pn;
		prob = p;
	}
	
	public void makeProblem(){
		
	}
	
	public void submitProblem() {
		
	}
	
	public void viewDiagnoses(){
		
	}
}
