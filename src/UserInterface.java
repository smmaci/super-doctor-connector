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
		JPanel patientPanel = new JPanel(new GridLayout(5,1));
		createPatientPanel(patientPanel);
		
		//Set up doctor panel
		JPanel doctorPanel = new JPanel(new GridLayout(10,1));
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
		
		String[] areas = {"Skin", "Arm", "Head", "Leg", "Heart", "Chest", "Neck", "Throat", "Stomach", "Lungs"};
		
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
		final JComboBox specCB = new JComboBox(specialties);
		final JTextField nameField = new JTextField();
		final JTextField addressField = new JTextField();
		final JTextField phoneField = new JTextField();
		final JTextField specialityField = new JTextField();

		
		
		doctorPanel.add(new JLabel("Name:"));
		doctorPanel.add(nameField);
		doctorPanel.add(new JLabel("Address:"));
		doctorPanel.add(addressField);
		doctorPanel.add(new JLabel("Phone Number:"));
		doctorPanel.add(phoneField);
		doctorPanel.add(new JLabel("My specialty is:"));
		doctorPanel.add(specCB);
		
		//doctorPanel.add(new JTextField());
		
		JButton addDoctor = new JButton("Add Doctor");
		
		addDoctor.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		DoctorMap dm = new DoctorMap();
	    		dm.addDoctor(nameField.getText(), addressField.getText(), phoneField.getText(), specCB.getSelectedItem().toString());
	      }
	    });
		

		doctorPanel.add(addDoctor);

	}
	
	
}
