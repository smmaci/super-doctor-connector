import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class UserInterface {
	public UserInterface(){
		//Set up main frame
		JFrame main = new JFrame("Super Doctor Connector");
		main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		main.setSize(500, 500);
		
		//Set up patient panel
		JPanel patientPanel = new JPanel(new GridLayout(2,1));
		createPatientPanel(patientPanel);
		
		//Set up doctor panel
		JPanel doctorDiagnosisPanel = new JPanel(new GridLayout(15,1));
		createDoctorDiagnosisPanel(doctorDiagnosisPanel);
		
		//Set up doctor panel
		JPanel doctorPanel = new JPanel(new GridLayout(15,1));
		createDoctorPanel(doctorPanel);
		
		//Set up tabbed pane
		JTabbedPane tbpane = new JTabbedPane();
		tbpane.addTab("Patient", patientPanel);
		tbpane.addTab("Doctor Diagnosis", doctorDiagnosisPanel);
		tbpane.addTab("Add Doctor", doctorPanel);
		
		//Add components to main frame
		main.add(tbpane);
		main.setVisible(true);
	}
	
	/** Sets up the patient panel
	 * 
	 */
	private void createPatientPanel(JPanel patientPanel){
		JPanel upper = new JPanel(new GridLayout(8,1));
		JPanel lower = new JPanel(new GridLayout(2,1));
		
		String[] areas = {"Skin", "Arm", "Head", "Leg", "Heart", "Chest", "Neck", "Throat", "Stomach", "Lungs"};
		String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", 
				"Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", 
				"Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", 
				"North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", 
				"Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
		
		final JComboBox stateCB = new JComboBox(states);
		final JComboBox areasCB = new JComboBox(areas);
		final JTextField zipField = new JTextField();
		final JTextField doc = new JTextField();
		doc.setEditable(false);
		
		upper.add(new JLabel("I have a problem with my:"));
		upper.add(areasCB);
		upper.add(new JLabel("Please describe your sympoms below"));
		upper.add(new JTextField());
		upper.add(new JLabel("State:"));
		upper.add(stateCB);
		upper.add(new JLabel("Zip Code:"));
		upper.add(zipField);
		patientPanel.add(upper);
		JButton findDoctor = new JButton("Find a Doctor Now!");
	    
		findDoctor.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		DoctorList dl = new DoctorList();
	    		//System.out.println(dl);
	    		
	    		String desiredField = areasCB.getSelectedItem().toString().toLowerCase();
	    		String desiredState = stateCB.getSelectedItem().toString();
	    		
	    		Doctor d = new Doctor(dl.findDoctor(desiredField, desiredState));
	    		System.out.println("Doctor name:" + d.getName());
	    		if(d.getName() != "") {
	    			doc.setText(d.toString());
	    		} else {
	    			doc.setText("No Doctors Found");
	    		}
	    		
	      }
	    });
		
		lower.add(findDoctor);
		lower.add(doc);
		patientPanel.add(lower);
	}
	
	private void createDoctorPanel(JPanel doctorPanel) {
		String[] specialties = {"Skin", "Arm", "Head", "Leg", "Heart", "Chest", "Neck", "Throat", "Stomach", "Lungs"};
		
		String[] states = {"Alabama", "Alaska", "Arizona", "Arkansas", "California", "Colorado", "Connecticut", "Delaware", "Florida", "Georgia", 
				"Hawaii", "Idaho", "Illinois", "Indiana", "Iowa", "Kansas", "Kentucky", "Louisiana", "Maine", "Maryland", "Massachusetts", "Michigan", 
				"Minnesota", "Mississippi", "Missouri", "Montana", "Nebraska", "Nevada", "New Hampshire", "New Jersey", "New Mexico", "New York", 
				"North Carolina", "North Dakota", "Ohio", "Oklahoma", "Oregon", "Pennsylvania", "Rhode Island", "South Carolina", "South Dakota", 
				"Tennessee", "Texas", "Utah", "Vermont", "Virginia", "Washington", "West Virginia", "Wisconsin", "Wyoming"};
				
		final JComboBox specCB = new JComboBox(specialties);
		final JComboBox stateCB = new JComboBox(states);
		final JTextField nameField = new JTextField();
		final JTextField addressField = new JTextField();
		final JTextField cityField = new JTextField();
		final JTextField zipField = new JTextField();
		final JTextField phoneField = new JTextField();
		final JTextField specialityField = new JTextField();

		
		
		doctorPanel.add(new JLabel("Name:"));
		doctorPanel.add(nameField);
		doctorPanel.add(new JLabel("Street Address:"));
		doctorPanel.add(addressField);
		doctorPanel.add(new JLabel("City:"));
		doctorPanel.add(cityField);
		doctorPanel.add(new JLabel("State:"));
		doctorPanel.add(stateCB);
		doctorPanel.add(new JLabel("Zip Code:"));
		doctorPanel.add(zipField);
		doctorPanel.add(new JLabel("Phone Number:"));
		doctorPanel.add(phoneField);
		doctorPanel.add(new JLabel("My specialty is:"));
		doctorPanel.add(specCB);
		
		//doctorPanel.add(new JTextField());
		
		JButton addDoctor = new JButton("Add Doctor");
		
		//creates a doctor object and adds it to doctor map
		addDoctor.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		DoctorList dl = new DoctorList();
	    		dl.addDoctor(new Doctor(nameField.getText(), addressField.getText(), cityField.getText(), 
	    				stateCB.getSelectedItem().toString(), zipField.getText(), phoneField.getText(), 
	    				specCB.getSelectedItem().toString()));
	      }
	    });
		

		doctorPanel.add(addDoctor);

	}
	
	private void createDoctorDiagnosisPanel(JPanel doctorDiagnosis) {
		
	}
	
	
}
