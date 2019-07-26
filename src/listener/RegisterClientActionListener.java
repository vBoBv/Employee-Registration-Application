package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import data.Client;
import dataController.DataController;
import ui.RegisterUI;

public class RegisterClientActionListener implements ActionListener {
	
	private RegisterUI ui;
	private DataController dataHandler;
	
	ArrayList<Client> clientDetails = DataController.readFile("data/clientData.csv");
	
	public RegisterClientActionListener(RegisterUI ui, DataController dataHandler) {
		super();
		this.ui = ui;
		this.dataHandler = dataHandler;
	}
	
	public static int generateId(int arraySize) {
		int count = 1;
		count = count + arraySize;
		return count;
		
	}
	
	public static String generateDeptID(String deptName) {
		if(deptName.equals("Networking")) {
			String netID;
			netID = deptName.substring(0,3);
			return netID.toLowerCase();
		}
		else if (deptName.equals("Database")) {
			String dataID;
			dataID = deptName.substring(0,3);
			return dataID.toLowerCase();
		}
		else {
			String devID;
			devID = deptName.substring(0,3);
			return devID.toLowerCase();
		}
	}
	
	public static String generateEmail(String initialFirstName, String lastName, int id, String deptName) {
		String companyEmail;
		companyEmail = lastName + initialFirstName.charAt(0) + id + "-" + deptName.substring(0,3) +"@gmail.com";
		return companyEmail.toLowerCase();
	}
	
	public static String generateUsername(int clientID, String deptName, String lastName) {
		String companyUsername;
		companyUsername = deptName.substring(0,3) + lastName + clientID;
		return companyUsername.toLowerCase();
	}
	
	public static String generatePassword(String clientNumber, String lastName) {
		String companyPassword;
		companyPassword = clientNumber.substring(3) + lastName;
		return companyPassword.toLowerCase();
	}
	
	void refreshData() {
		clientDetails = DataController.readFile("data/clientData.csv");
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == ui.getBtnSubmit())
		{	
			refreshData();
			//Display the dialog box when register button is clicked
			int confirmation = JOptionPane.showConfirmDialog(ui, "Do you want to submit?" , "Form submission",JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE); 
			
			if(confirmation == JOptionPane.YES_OPTION )
			{	
				
				//if yes, we get data from inputs and validate it
				String dept = (String) ui.getDeptComboBox().getSelectedItem();
				String firstName = ui.getFirstNameTxtField().getText().trim();
				String lastName = ui.getLastNameTxtField().getText().trim();
				String phoneNumber = ui.getPhoneNumberTxtField().getText().trim();
				int phoneNumber1 = 0;
			    Boolean all_data_valid = true;
			    String Error_Message = "";
				
				//Data validation
			    if (dept==null) {
			    	Error_Message  += "+ Department must be filled.\n";
			    	all_data_valid = false;
			    }
			    
			    
				if( (firstName.length() <= 0) || (lastName.length() <= 0) )
				{
					
					Error_Message  += "+ First Name and Last Name must contain characters.\n";
					all_data_valid = false;
				
				}
			
				if(phoneNumber.length()>0) {
					try {
					  phoneNumber1 = Integer.parseInt(phoneNumber);
					}catch(NumberFormatException ex) {
						Error_Message += "+ Phone number must be numbers.\n";
						all_data_valid = false;
					}if (phoneNumber1 <= 2) {
						Error_Message += "+ Invalid phone number. Phone number must have more than 2 digits.\n";
						all_data_valid = false;
					}			
				}else if(phoneNumber == "" || phoneNumber.length() <= 0) {
					Error_Message += "+ Phone number must be filled.\n";
					all_data_valid = false;
				}else {
					Error_Message += "+ Phone number must be filled.\n";
					all_data_valid = false;
				}
				
				//check whether there is any error or not	
				if(all_data_valid == true)	
				{	
					//Local Variables to write into client file
					int totalArraySize = clientDetails.size();
					String deptName = (String) dept;
					String deptId = generateDeptID(deptName);
					String clientId = generateId(totalArraySize) + "";
					int clientNum = generateId(totalArraySize);
					
					//Local Variables to write into company file
					String companyEmail= generateEmail(firstName,lastName,clientNum, deptName);
					String username = generateUsername(clientNum,deptName,lastName);
					String password = generatePassword(phoneNumber,lastName);
					
					//Concat string
					String CSV_String = deptId+ "," + deptName + "," + clientId +","+firstName+","+lastName+","+phoneNumber;
					String CSV_User = deptId+ "," + deptName + "," + clientId +","+firstName+","+lastName+","+phoneNumber+","+clientId+","+companyEmail+","+username+","+password;
					
					//Write data to the customerDetails text file that contains all type of customers
					this.dataHandler.writeClientData(CSV_String);
					this.dataHandler.writeUserData(CSV_User);
					
					//Display item
					ui.getLblCompanyEmail().setText(companyEmail);
					ui.getLblCompanyUsername().setText(username);
					ui.getLblCompanyPassword().setText(password);
					
					
					JOptionPane.showMessageDialog(ui, "Your details have been saved", "Info Message", JOptionPane.INFORMATION_MESSAGE);
					//reset form
					ui.getDeptComboBox().setSelectedItem(null);
					ui.getFirstNameTxtField().setText(null);
					ui.getLastNameTxtField().setText(null);
					ui.getPhoneNumberTxtField().setText(null);
		
				}
				else
				{
					//if there are errors, show the message
					JOptionPane.showMessageDialog(ui, Error_Message , "Info Message", JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}
	}
	
	
	
}
