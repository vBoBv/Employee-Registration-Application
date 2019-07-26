package ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

public class RegisterUI extends JFrame {

	private JPanel contentPane;
	private JTextField lastNameTxtField;
	private JTextField firstNameTxtField;
	private JTextField phoneNumberTxtField;
	private JButton btnRegister ;
	private JButton btnSubmit;
	private JComboBox deptComboBox;
	private JLabel lblCompanyEmail;
	private JLabel lblCompanyUsername;
	private JLabel lblCompanyPassword;
	public JTable userTable;
	private JButton btnView;
	
	
	
	public JButton getBtnView() {
		return btnView;
	}

	public JTable getUserTable() {
		return userTable;
	}

	public JLabel getLblCompanyUsername() {
		return lblCompanyUsername;
	}

	public JLabel getLblCompanyPassword() {
		return lblCompanyPassword;
	}

	public JLabel getLblCompanyEmail() {
		return lblCompanyEmail;
	}

	public JButton getBtnSubmit() {
		return btnSubmit;
	}

	public JComboBox getDeptComboBox() {
		return deptComboBox;
	}

	public JPanel getContentPane() {
		return contentPane;
	}

	public JTextField getLastNameTxtField() {
		return lastNameTxtField;
	}

	public JTextField getFirstNameTxtField() {
		return firstNameTxtField;
	}

	public JTextField getPhoneNumberTxtField() {
		return phoneNumberTxtField;
	}

	public JButton getBtnRegister() {
		return btnRegister;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterUI frame = new RegisterUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterUI() {
		setTitle("Registration Application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		setBounds(100, 100, 1938, 1048);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(338, 219, 1239, 624);
		contentPane.add(mainPanel);
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setLayout(null);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(192, 192, 192));
		buttonPanel.setBounds(0, 0, 1239, 124);
		mainPanel.add(buttonPanel);
		buttonPanel.setLayout(null);
		
		JPanel operationPanel = new JPanel();
		operationPanel.setBounds(0, 124, 1239, 500);
		mainPanel.add(operationPanel);
		operationPanel.setLayout(null);
		
		JLayeredPane layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 1239, 500);
		operationPanel.add(layeredPane);
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 255, 255));
		layeredPane.add(registerPanel, "name_235697941326694");
		registerPanel.setLayout(null);
		
		JPanel inputPanel = new JPanel();
		inputPanel.setBackground(new Color(220, 220, 220));
		inputPanel.setBounds(0, 0, 620, 500);
		registerPanel.add(inputPanel);
		inputPanel.setLayout(null);
		
		JLabel firstNameLbl = new JLabel("First Name :");
		firstNameLbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		firstNameLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		firstNameLbl.setBounds(95, 126, 74, 41);
		inputPanel.add(firstNameLbl);
		
		JLabel lastNameLbl = new JLabel("Last Name :");
		lastNameLbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lastNameLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lastNameLbl.setBounds(95, 186, 74, 41);
		inputPanel.add(lastNameLbl);
		
		lastNameTxtField = new JTextField();
		lastNameTxtField.setBounds(224, 189, 215, 34);
		inputPanel.add(lastNameTxtField);
		lastNameTxtField.setColumns(10);
		
		firstNameTxtField = new JTextField();
		firstNameTxtField.setColumns(10);
		firstNameTxtField.setBounds(224, 129, 215, 34);
		inputPanel.add(firstNameTxtField);
		
		JLabel phoneLbl = new JLabel("Phone Number :");
		phoneLbl.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		phoneLbl.setHorizontalAlignment(SwingConstants.RIGHT);
		phoneLbl.setBounds(48, 247, 121, 41);
		inputPanel.add(phoneLbl);
		
		phoneNumberTxtField = new JTextField();
		phoneNumberTxtField.setColumns(10);
		phoneNumberTxtField.setBounds(224, 250, 215, 34);
		inputPanel.add(phoneNumberTxtField);
		
		JLabel lblDepartment = new JLabel("Department :");
		lblDepartment.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblDepartment.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDepartment.setBounds(71, 72, 98, 41);
		inputPanel.add(lblDepartment);
		
		deptComboBox = new JComboBox();
		deptComboBox.setBackground(new Color(255, 255, 255));
		deptComboBox.setModel(new DefaultComboBoxModel(new String[] {"Networking", "Database", "Developer"}));
		deptComboBox.setSelectedItem(null);
		deptComboBox.setBounds(224, 76, 215, 32);
		inputPanel.add(deptComboBox);
		
		JLabel lblNewLabel_1 = new JLabel("Please fill in the following information :");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel_1.setBounds(50, 24, 266, 24);
		inputPanel.add(lblNewLabel_1);
		
		btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSubmit.setBackground(new Color(128, 128, 128));
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setBounds(287, 307, 97, 25);
		inputPanel.add(btnSubmit);
		
		JPanel displayPanel = new JPanel();
		displayPanel.setBackground(new Color(211, 211, 211));
		displayPanel.setBounds(619, 0, 620, 500);
		registerPanel.add(displayPanel);
		displayPanel.setLayout(null);
		
		JLabel lblYourGeneratedEmail = new JLabel("Your generated email address:");
		lblYourGeneratedEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblYourGeneratedEmail.setBounds(50, 85, 266, 24);
		displayPanel.add(lblYourGeneratedEmail);
		
		JLabel lblYourGeneratedUsername = new JLabel("Your generated username & password:");
		lblYourGeneratedUsername.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblYourGeneratedUsername.setBounds(50, 159, 266, 24);
		displayPanel.add(lblYourGeneratedUsername);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(116, 122, 55, 24);
		displayPanel.add(lblEmail);
		
		lblCompanyEmail = new JLabel("null");
		lblCompanyEmail.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCompanyEmail.setBounds(218, 122, 204, 24);
		displayPanel.add(lblCompanyEmail);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblUsername.setBounds(89, 196, 82, 24);
		displayPanel.add(lblUsername);
		
		lblCompanyUsername = new JLabel("null");
		lblCompanyUsername.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCompanyUsername.setBounds(218, 196, 204, 24);
		displayPanel.add(lblCompanyUsername);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(89, 233, 82, 24);
		displayPanel.add(lblPassword);
		
		lblCompanyPassword = new JLabel("null");
		lblCompanyPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblCompanyPassword.setBounds(218, 233, 204, 24);
		displayPanel.add(lblCompanyPassword);
		
		JLabel lblPersonalInformationWith = new JLabel("Personal Information with the company:");
		lblPersonalInformationWith.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPersonalInformationWith.setBounds(188, 27, 266, 24);
		displayPanel.add(lblPersonalInformationWith);
		
		JPanel viewPanel = new JPanel();
		viewPanel.setBackground(new Color(211, 211, 211));
		layeredPane.add(viewPanel, "name_235718225340093");
		viewPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(62, 55, 1106, 403);
		viewPanel.add(scrollPane);
		
		userTable = new JTable();
		userTable.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Dept_Id", "Dept_Name", "Id", "First_Name", "Last_Name", "Phone", "Email", "Username"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, true, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		userTable.getColumnModel().getColumn(0).setPreferredWidth(80);
		userTable.getColumnModel().getColumn(1).setPreferredWidth(100);
		userTable.getColumnModel().getColumn(2).setPreferredWidth(80);
		userTable.getColumnModel().getColumn(3).setPreferredWidth(100);
		userTable.getColumnModel().getColumn(4).setPreferredWidth(100);
		userTable.getColumnModel().getColumn(5).setPreferredWidth(100);
		userTable.getColumnModel().getColumn(6).setPreferredWidth(120);
		userTable.getColumnModel().getColumn(7).setPreferredWidth(100);
		scrollPane.setViewportView(userTable);
		
		JPanel footerPanel = new JPanel();
		footerPanel.setBackground(new Color(245, 245, 245));
		footerPanel.setBounds(0, 466, 1920, 535);
		contentPane.add(footerPanel);
		footerPanel.setLayout(null);
		
		JLabel copyRightLbl = new JLabel("All Rights Reserved by Ponhvath Vann.");
		copyRightLbl.setForeground(new Color(192, 192, 192));
		copyRightLbl.setFont(new Font("Times New Roman", Font.BOLD, 16));
		copyRightLbl.setHorizontalAlignment(SwingConstants.CENTER);
		copyRightLbl.setBounds(841, 481, 308, 41);
		footerPanel.add(copyRightLbl);
		
		JPanel backgroundImgPanel = new JPanel();
		backgroundImgPanel.setBounds(0, 0, 1920, 465);
		contentPane.add(backgroundImgPanel);
		backgroundImgPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RegisterUI.class.getResource("/background.jpg")));
		lblNewLabel.setBounds(0, 0, 1920, 465);
		backgroundImgPanel.add(lblNewLabel);
		
		btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(registerPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnRegister.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnRegister.setBackground(new Color(128, 128, 128));
		btnRegister.setForeground(new Color(255, 255, 255));
		btnRegister.setBounds(421, 0, 200, 124);
		buttonPanel.add(btnRegister);
		
		btnView = new JButton("View Table");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				layeredPane.removeAll();
				layeredPane.add(viewPanel);
				layeredPane.repaint();
				layeredPane.revalidate();
			}
		});
		btnView.setFont(new Font("Times New Roman", Font.PLAIN, 25));
		btnView.setForeground(new Color(255, 255, 255));
		btnView.setBackground(new Color(128, 128, 128));
		btnView.setBounds(618, 0, 195, 124);
		buttonPanel.add(btnView);
		
	}
}
