import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Admin_Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Admin_Login window = new Admin_Login();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Admin_Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FullScreen fs=new FullScreen();
		int x=fs.xsize;
		int y=fs.ysize;
		setFrame(new JFrame());
		getFrame().getContentPane().setFont(new Font("Tahoma", Font.BOLD, 14));
		getFrame().getContentPane().setForeground(Color.WHITE);
		getFrame().getContentPane().setBackground(Color.GRAY);
		getFrame().setBounds(0,0,x,y);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Admin_Login.class.getResource("/img2/icons8-username-26.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(SystemColor.inactiveCaptionText);
		
		textField = new JTextField();
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(105, 105, 105));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Admin_Login.class.getResource("/img2/icons8-lock-26.png")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(SystemColor.windowBorder);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(105, 105, 105));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBorder(UIManager.getBorder("Button.border"));
		btnNewButton.setBackground(new Color(46, 139, 87));
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().equals("Abc")&&passwordField.getText().equals("xyz")) 	{			
					frame.setVisible(false);
			AdminHome home=new AdminHome();
			home.frame.setVisible(true);
				}
				else
					JOptionPane.showMessageDialog(null,"Entered Details is Invalid!", "ERROR", JOptionPane.ERROR_MESSAGE);
				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 21));
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Index x=new Index();
				x.frmIndex.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 21));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setBackground(new Color(105, 105, 105));
		chckbxNewCheckBox.setIcon(new ImageIcon(Admin_Login.class.getResource("/img2/icons8-eye-24.png")));
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					passwordField.setEchoChar((char)0);
				}
				else
					passwordField.setEchoChar('*');
					
			}
		});
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.BOLD, 12));
		chckbxNewCheckBox.setForeground(new Color(192, 192, 192));
		
		JLabel lblNewLabel_5 = new JLabel("");
		
		JLabel lblNewLabel_6 = new JLabel("Admin Login");
		lblNewLabel_6.setForeground(UIManager.getColor("InternalFrame.minimizeIconBackground"));
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setIcon(new ImageIcon(Admin_Login.class.getResource("/img2/glenn-carstens-peters-P1qyEf1g0HU-unsplash.jpg")));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(591)
					.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
					.addGap(591))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(170)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
					.addGap(1138))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(238)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 253, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(875, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(551)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
					.addGap(690))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
					.addGap(1191))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(238)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
					.addGap(875))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(286)
					.addComponent(chckbxNewCheckBox, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
					.addGap(926))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(255)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(170)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
					.addGap(1138))
				.addComponent(lblNewLabel_2)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(31)
					.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
					.addGap(206)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addGap(85)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
					.addGap(207)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(55))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(672)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
					.addGap(43))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(284)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addGap(442))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(460)
					.addComponent(chckbxNewCheckBox, GroupLayout.PREFERRED_SIZE, 23, Short.MAX_VALUE)
					.addGap(285))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(284)
					.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(411)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
					.addGap(315))
				.addComponent(lblNewLabel_2)
		);
		frame.getContentPane().setLayout(groupLayout);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
		frame.setUndecorated(true);
	}
}
