import java.lang.String;

public class Problem {

	private boolean illness;
	private boolean injury;
	private String[] symptoms;
	
	public Problem(){
		illness = true;
		injury = true;
		symptoms = new String[5];
	}
	
	public Problem(boolean ill, boolean inj, int i) {
		illness = ill;
		injury = inj;
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
