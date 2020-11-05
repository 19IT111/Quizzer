import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ListSelectionModel;
import java.awt.Choice;
import java.awt.List;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;

public class StudentInfo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentInfo frame = new StudentInfo();
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
	public StudentInfo() {
		setResizable(false);
		setUndecorated(true);
		FullScreen fs=new FullScreen();
		int x=fs.xsize;
		int y=fs.ysize;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, x, y);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setInheritsPopupMenu(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		lblNewLabel.setBounds(89, 181, 113, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ROLL NO");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		lblNewLabel_1.setBounds(89, 234, 102, 30);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("GENDER");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		lblNewLabel_2.setBounds(89, 399, 85, 30);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE", "TRANSGENDER"}));
		comboBox.setBounds(226, 399, 113, 30);
		contentPane.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 85, 1346, 2);
		contentPane.add(separator);
		
		textField = new JTextField();
		textField.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		textField.setBounds(226, 182, 401, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		textField_1.setBounds(226, 235, 401, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("EMAIL");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		lblNewLabel_3.setBounds(89, 461, 94, 30);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		textField_2.setBounds(226, 462, 336, 30);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("FATHER NAME");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		lblNewLabel_4.setBounds(89, 285, 127, 30);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		textField_3.setBounds(226, 286, 401, 30);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("CONTACT NO");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		lblNewLabel_5.setBounds(89, 346, 127, 30);
		contentPane.add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Leelawadee UI Semilight", Font.PLAIN, 18));
		textField_4.setBounds(226, 347, 249, 30);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(StudentInfo.class.getResource("/img2/icons8-student-male-100.png")));
		lblNewLabel_6.setBounds(0, 0, 102, 87);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("FILL IMFORMATION");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 36));
		lblNewLabel_7.setBounds(112, 11, 426, 66);
		contentPane.add(lblNewLabel_7);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String roll=textField_1.getText();
				String name=textField.getText();
				String fathername=textField_3.getText();
				String email=textField_2.getText();
				String contact=textField_4.getText();
				String gender=(String)comboBox.getSelectedItem();
				String result="0";
				try {
				Connection con=ConnectionProvider.getCon();
				PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
				ps.setString(1,name);
				ps.setString(2,roll);
				ps.setString(3,fathername);
				ps.setString(4,email);
				ps.setString(5,gender);
				ps.setString(6,contact);
				ps.setString(7,result);
				ps.executeUpdate();
				setVisible(false);
			    new QuizPage(roll).setVisible(true);
				}catch(Exception i) {
					
				JFrame jf=new JFrame();
				jf.setAlwaysOnTop(true);
				JOptionPane.showMessageDialog(jf,e);
					
				}
			}
		});
		btnNewButton.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		btnNewButton.setBounds(407, 645, 85, 38);
		contentPane.add(btnNewButton);
	}

}
