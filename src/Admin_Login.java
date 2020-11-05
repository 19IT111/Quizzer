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
		lblNewLabel.setBounds(170, 284, 74, 42);
		lblNewLabel.setIcon(new ImageIcon(Admin_Login.class.getResource("/img2/icons8-username-26.png")));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(SystemColor.inactiveCaptionText);
		
		textField = new JTextField();
		textField.setBounds(238, 284, 269, 42);
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(105, 105, 105));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(170, 411, 74, 42);
		lblNewLabel_1.setIcon(new ImageIcon(Admin_Login.class.getResource("/img2/icons8-lock-26.png")));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(SystemColor.windowBorder);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(238, 411, 253, 42);
		passwordField.setForeground(new Color(255, 255, 255));
		passwordField.setBackground(new Color(105, 105, 105));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(549, 672, 141, 53);
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
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setBounds(50, 672, 141, 53);
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 128, 128));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Index x=new Index();
				x.frmIndex.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Show Password");
		chckbxNewCheckBox.setBounds(286, 460, 170, 23);
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
		chckbxNewCheckBox.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 16));
		chckbxNewCheckBox.setForeground(new Color(192, 192, 192));
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(255, 284, 46, 14);
		
		JLabel lblNewLabel_6 = new JLabel("Admin Login");
		lblNewLabel_6.setBounds(591, 31, 200, 47);
		lblNewLabel_6.setForeground(UIManager.getColor("InternalFrame.minimizeIconBackground"));
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD, 34));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 1366, 768);
		lblNewLabel_2.setBorder(null);
		lblNewLabel_2.setIcon(new ImageIcon(Admin_Login.class.getResource("/img2/glenn-carstens-peters-P1qyEf1g0HU-unsplash.jpg")));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel_6);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(passwordField);
		frame.getContentPane().add(btnNewButton);
		frame.getContentPane().add(btnNewButton_1);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(chckbxNewCheckBox);
		frame.getContentPane().add(lblNewLabel_5);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel_2);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
		frame.setUndecorated(true);
	}
}
