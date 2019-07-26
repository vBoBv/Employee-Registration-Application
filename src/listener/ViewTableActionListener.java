package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import data.Client;
import data.User;
import dataController.DataController;
import ui.RegisterUI;

public class ViewTableActionListener implements ActionListener{
	
	private RegisterUI ui;
	private DataController dataHandler;
	
	ArrayList<User> userDetails = DataController.readUserFile("data/userData.csv");
	DefaultTableModel model = new DefaultTableModel();
	
	public ViewTableActionListener(RegisterUI ui, DataController dataHandler) {
		super();
		this.ui = ui;
		this.dataHandler = dataHandler;
	}
	
	void refreshData() {
		
		userDetails = DataController.readUserFile("data/userData.csv");
	}
	
	public void addRowToJTable()
    {
		model = (DefaultTableModel) ui.getUserTable().getModel();
        Object rowData[] = new Object[8];
        for(int i = 0; i < userDetails.size(); i++)
        {
            rowData[0] = userDetails.get(i).getDeptID();
            rowData[1] = userDetails.get(i).getDeptName();
            rowData[2] = userDetails.get(i).getId();
            rowData[3] = userDetails.get(i).getFirstName();
            rowData[4] = userDetails.get(i).getLastName();
    		rowData[5] = userDetails.get(i).getPhoneNumber();
			rowData[6] = userDetails.get(i).getEmail();
			rowData[7] = userDetails.get(i).getUsername();
            model.addRow(rowData);
            
        }     
    }
	
	
	
	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == ui.getBtnView())
		{	
			model.setRowCount(0);
			refreshData();
			addRowToJTable();
		}
	}

}
