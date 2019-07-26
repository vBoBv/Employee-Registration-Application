package main;

import java.util.ArrayList;

import javax.swing.JButton;

import data.User;
import dataController.DataController;
import listener.RegisterClientActionListener;
import listener.ViewTableActionListener;
import ui.RegisterUI;

public class MyApplication {
	
	public static void main(String[] args) {
		System.out.println("Program has been opened.");

		RegisterUI ui = new RegisterUI();
		ui.setVisible(true);
		DataController dc = new DataController();
		
		//Action Listener for Register Button
		RegisterClientActionListener listenerForRegisterClient = new RegisterClientActionListener(ui,dc);
		JButton submitButton = ui.getBtnSubmit();
		submitButton.addActionListener(listenerForRegisterClient);
		
		//Action Listener for View Table Button
		ViewTableActionListener listenerForViewTable = new ViewTableActionListener(ui,dc);
		JButton viewButton = ui.getBtnView();
		viewButton.addActionListener(listenerForViewTable);
		

	}

}
