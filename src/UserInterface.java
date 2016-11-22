import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;

public class UI {
	public UI(){
		//Set up main frame
		JFrame main = new JFrame("Super Doctor Connector");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(500, 500);
		
		//Set up patient panel
		JPanel patientPanel = new JPanel(new GridLayout(5,1));
		createPatientPanel(patientPanel);
		
		//Set up doctor panel
		JPanel doctorPanel = new JPanel();
		createDoctorPanel(doctorPanel);
		
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
		patientPanel.add(new JTextField());
		patientPanel.add(new JButton("Find a doctor now!"));
		patientPanel.add(new JLabel("insert dr diagnosis here"));
	}
	
	private void createDoctorPanel(JPanel doctorPanel) {
		String[] specialties = {"Skin", "Heart", "Chest", "Neck", "Throat", "Stomach"};
		JComboBox specCB = new JComboBox(specialties);
		
		doctorPanel.add(new JLabel("My specialty is:"));
		doctorPanel.add(specCB);
	}
	
}
