import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface {
	public UserInterface(){
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
		String[] areas = {"Skin", "Arm", "Head", "Leg", "Heart", "Chest", "Neck", "Throat", "Stomach"};
		final JComboBox areasCB = new JComboBox(areas);
		
		patientPanel.add(new JLabel("I have a problem with my:"));
		patientPanel.add(areasCB);
		patientPanel.add(new JTextField());
		JButton findDoctor = new JButton("Find a Doctor Now!");
	    
		findDoctor.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		DoctorMap dm = new DoctorMap();
	    		System.out.println(dm.map.get(areasCB.getSelectedItem().toString().toLowerCase()));
	      }
	    });
		
		patientPanel.add(findDoctor);
		patientPanel.add(new JLabel("insert dr diagnosis here"));
	}
	
	private void createDoctorPanel(JPanel doctorPanel) {
		String[] specialties = {"Skin", "Heart", "Chest", "Neck", "Throat", "Stomach"};
		JComboBox specCB = new JComboBox(specialties);
		
		doctorPanel.add(new JLabel("My specialty is:"));
		doctorPanel.add(specCB);
	}
	
}
