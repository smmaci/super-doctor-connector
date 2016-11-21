import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class UI {
	public UI(){
		//Set up main frame
		JFrame main = new JFrame("Super Doctor Connector");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(800, 600);
		
		//Set up patient panel
		JPanel patientPanel = new JPanel();
		createPatientPanel(patientPanel);
		
		//Set up doctor panel
		JPanel doctorPanel = new JPanel();
		
		//Set up tabbed pane
		JTabbedPane tbpane = new JTabbedPane();
		tbpane.addTab("Patient", patientPanel);
		tbpane.addTab("Doctor", doctorPanel);
		
		//Add components to main frame
		main.add(tbpane);
		main.setVisible(true);
	}
	
	/** Sets up the patient panel
	 * 
	 */
	private void createPatientPanel(JPanel patientPanel){
		//Creating the combo box for affected areas
		String[] areas = {"Skin", "Heart", "Chest", "Neck", "Throat", "Stomach"};
		JComboBox areasCB = new JComboBox(areas);
		
		patientPanel.add(new JLabel("I have a problem with my:"));
		patientPanel.add(areasCB);
	}
	
}
