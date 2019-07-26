package dataController;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

import data.Client;
import data.User;

public class DataController {
	
	private final String clientData = "data/clientData.csv";
	private final String userData = "data/userData.csv";
	
	public void writeClientData(String formData) {
		PrintWriter WriterForClient = null;
		try {
			File file = new File(clientData);
			if(file.exists() != true) {
				file.getParentFile().mkdir();
			}
			WriterForClient = new PrintWriter(new FileWriter(clientData, true));
			WriterForClient.println(formData);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			WriterForClient.close();
		}
	}
	
	public void writeUserData(String formData) {
		PrintWriter WriterForUser = null;
		try {
			File file = new File(userData);
			if(file.exists() != true) {
				file.getParentFile().mkdir();
			}
			WriterForUser = new PrintWriter(new FileWriter(userData, true));
			WriterForUser.println(formData);
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			WriterForUser.close();
		}
	}
	
	public static ArrayList<Client> readFile(String clientData) {
		ArrayList<Client> clientArrayList = new ArrayList<Client>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(clientData));
			String line = reader.readLine();
			while (line != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				
				String deptId = tokenizer.nextToken();
				String deptName = tokenizer.nextToken();
				int id = Integer.parseInt(tokenizer.nextToken());
				String firstName = tokenizer.nextToken();
				String lastName = tokenizer.nextToken();
				int phoneNumber = Integer.parseInt(tokenizer.nextToken());
				
				clientArrayList.add(new Client(deptId, deptName, id, firstName, lastName, phoneNumber));
				line = reader.readLine();
			}
			reader.close();
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Unable to open file");
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Unable to read");
		}
		
		return clientArrayList;
	}
	
	public static ArrayList<User> readUserFile(String userData) {
		ArrayList<User> userArrayList = new ArrayList<User>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(userData));
			String line = reader.readLine();
			while (line != null) {
				StringTokenizer tokenizer = new StringTokenizer(line, ",");
				
				String deptId = tokenizer.nextToken();
				String deptName = tokenizer.nextToken();
				int id = Integer.parseInt(tokenizer.nextToken());
				String firstName = tokenizer.nextToken();
				String lastName = tokenizer.nextToken();
				int phoneNumber = Integer.parseInt(tokenizer.nextToken());
				int userId = Integer.parseInt(tokenizer.nextToken());
				String email = tokenizer.nextToken();
				String username = tokenizer.nextToken();
				String password = tokenizer.nextToken();
			
				
				userArrayList.add(new User(deptId, deptName, id, firstName, lastName, phoneNumber, userId, email, username, password));
				line = reader.readLine();
				
			}
			reader.close();
		}catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Unable to open file");
		}catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Unable to read");
		}
		
		return userArrayList;
	}

}
