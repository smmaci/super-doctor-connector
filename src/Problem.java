import java.lang.String;

public class Problem {

	private boolean illness;
	private String[] symptoms;
	
	public Problem(){
		illness = true;
		symptoms = new String[5];
	}
	
	public Problem(boolean b, int i) {
		illness = b;
		symptoms = new String[i];
	}
		
	
	public void pickSymptoms(){
		
	}
	
	public void viewSymptoms(){
		
	}
	
	public void clearSymptoms(){
		symptoms = new String[5];
	}
	
}
