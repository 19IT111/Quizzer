import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JEditorPane;
import javax.swing.JDesktopPane;
import javax.swing.JToggleButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.sql.*;
import Project.ConnectionProvider;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.Timer;

public class QuizPage extends JFrame {
	public String questionId = "1";
	public String answer;
	public int min = 0;
	public int sec = 0;
	public int marks = 0;
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("New radio button");
	JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
	JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("New radio button");
	JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("New radio button");
	JLabel lblNewLabel_17 = new JLabel("Questio demo?");
	JLabel lblNewLabel_15 = new JLabel("New label");
	JLabel lblNewLabel_9 = new JLabel("New label");
	JLabel lblNewLabel_18 = new JLabel("00");
	JButton btnNewButton_1 = new JButton("Save & Next");
	
	
	public void answerCheck() {

		// check answer
		String studentAnswer = "";

		if (rdbtnNewRadioButton.isSelected()) {
			studentAnswer = rdbtnNewRadioButton.getText();

		} else if (rdbtnNewRadioButton_1.isSelected()) {
			studentAnswer = rdbtnNewRadioButton_1.getText();
		}
		else if (rdbtnNewRadioButton_2.isSelected()) {
			studentAnswer = rdbtnNewRadioButton_2.getText();
		} else {
			studentAnswer = rdbtnNewRadioButton_3.getText();
		}

		if (studentAnswer.equals(answer)) {
			marks = marks + 1;
			String marks1=String.valueOf(marks);
			lblNewLabel_18.setText(marks1);

		}

		int questionId1 = Integer.parseInt(questionId);
		questionId1 = questionId1 + 1;
		questionId = String.valueOf(questionId1);

		rdbtnNewRadioButton.setSelected(false);
		rdbtnNewRadioButton_1.setSelected(false);
		rdbtnNewRadioButton_2.setSelected(false);
		rdbtnNewRadioButton_3.setSelected(false);

		if (questionId.equals("10")) {
			btnNewButton_1.setVisible(false);
		}
	}
	
	
	


	public void question() {

		try {
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();

			ResultSet rs1 = st.executeQuery("select *from question where id='" + questionId + "'");
			while (rs1.next()) {
				lblNewLabel_15.setText(rs1.getString(1));
				lblNewLabel_17.setText(rs1.getString(2));
				rdbtnNewRadioButton.setText(rs1.getString(3));
				rdbtnNewRadioButton_1.setText(rs1.getString(4));
				rdbtnNewRadioButton_2.setText(rs1.getString(5));
				rdbtnNewRadioButton_3.setText(rs1.getString(6));
				answer = rs1.getString(7);

			}
		} catch (Exception i) {
			JOptionPane.showMessageDialog(null, i);
		}
	}

	public void submit() {

		String rollno = lblNewLabel_9.getText();
		answerCheck();

		try {
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();
			st.executeUpdate("update student set result='" + marks + "' where roll='" + rollno + "'");
			String marks1 = String.valueOf(marks);
			setVisible(false);
			Submitted s=new Submitted(marks1);
			s.setVisible(true);
		} catch (Exception ie) {
			JOptionPane.showMessageDialog(null, ie);
		}
	}

	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 * 
	 */
	public static void main(String[] args) {
		String rollno = "0";
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizPage frame = new QuizPage(rollno);
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
	Timer time;

	public QuizPage(String roll) {
		setUndecorated(true);
		FullScreen fs = new FullScreen();
		int x = fs.xsize;
		int y = fs.ysize;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, x, y);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1366, 86);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.DARK_GRAY);
		panel.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Total Time");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(1122, 11, 105, 24);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel("00");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel_1.setForeground(new Color(255, 102, 102));
		lblNewLabel_1.setBounds(1277, 49, 33, 22);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("Welcome to Quiz");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 40));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(115, 11, 322, 43);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_3 = new JLabel("00");
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel_3.setForeground(new Color(255, 102, 102));
		lblNewLabel_3.setBounds(1242, 49, 25, 22);
		panel.add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("10 min.\r\n");
		lblNewLabel_4.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(1242, 14, 73, 19);
		panel.add(lblNewLabel_4);

		JLabel lblNewLabel_5 = new JLabel("Time Taken");
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(1122, 46, 116, 29);
		panel.add(lblNewLabel_5);

		JLabel lblNewLabel_6 = new JLabel("Date");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel_6.setBounds(806, 35, 61, 24);
		panel.add(lblNewLabel_6);

		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setForeground(new Color(240, 230, 140));
		lblNewLabel_7.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 20));
		lblNewLabel_7.setBounds(869, 34, 116, 26);
		panel.add(lblNewLabel_7);

		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(QuizPage.class.getResource("/img2/icons8-student-male-100.png")));
		lblNewLabel_16.setBounds(0, 0, 105, 86);
		panel.add(lblNewLabel_16);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1025, 97, 331, 650);
		panel_1.setForeground(new Color(119, 136, 153));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setLayout(null);

		JLabel lblNewLabel_8 = new JLabel("ROLL NO.");
		lblNewLabel_8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel_8.setBounds(10, 53, 105, 26);
		panel_1.add(lblNewLabel_8);

		
		lblNewLabel_9.setForeground(new Color(119, 136, 153));
		lblNewLabel_9.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_9.setBounds(125, 53, 132, 26);
		panel_1.add(lblNewLabel_9);

		JLabel lblNewLabel_10 = new JLabel("NAME");
		lblNewLabel_10.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel_10.setBounds(10, 97, 72, 26);
		panel_1.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setForeground(new Color(119, 136, 153));
		lblNewLabel_11.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_11.setBounds(125, 97, 132, 26);
		panel_1.add(lblNewLabel_11);

		JLabel lblNewLabel_12 = new JLabel("Total Question");
		lblNewLabel_12.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel_12.setBounds(10, 162, 146, 26);
		panel_1.add(lblNewLabel_12);

		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_13.setBounds(194, 162, 132, 26);
		panel_1.add(lblNewLabel_13);

		JLabel lblNewLabel_14 = new JLabel("Current Question");
		lblNewLabel_14.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel_14.setBounds(10, 199, 178, 26);
		panel_1.add(lblNewLabel_14);

		
		lblNewLabel_15.setForeground(new Color(50, 205, 50));
		lblNewLabel_15.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));
		lblNewLabel_15.setBounds(194, 199, 132, 26);
		panel_1.add(lblNewLabel_15);

		
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = JOptionPane.showConfirmDialog(null, "Do you really Want to Submit?", "Select",
						JOptionPane.YES_NO_OPTION);
				if (a == 0) {

					
					submit();

				}

			}
		});

		btnNewButton.setForeground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		btnNewButton.setBounds(209, 596, 112, 43);
		panel_1.add(btnNewButton);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(128, 128, 128));
		separator.setBounds(10, 141, 460, 2);
		panel_1.add(separator);

	
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(82, 167, 854, 38);
		lblNewLabel_17.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 22));
		rdbtnNewRadioButton_3.setForeground(Color.WHITE);
		rdbtnNewRadioButton_3.setBackground(Color.GRAY);
		rdbtnNewRadioButton_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));

		rdbtnNewRadioButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_3.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_2.setForeground(Color.WHITE);
		rdbtnNewRadioButton_2.setBackground(Color.GRAY);
		rdbtnNewRadioButton_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));

		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_2.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton_1.setForeground(Color.WHITE);
		rdbtnNewRadioButton_1.setBackground(Color.GRAY);
		rdbtnNewRadioButton_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));

		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton_1.isSelected()) {
					rdbtnNewRadioButton.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setForeground(Color.WHITE);
		rdbtnNewRadioButton.setBackground(Color.GRAY);
		rdbtnNewRadioButton.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 18));

		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (rdbtnNewRadioButton.isSelected()) {
					rdbtnNewRadioButton_1.setSelected(false);
					rdbtnNewRadioButton_2.setSelected(false);
					rdbtnNewRadioButton_3.setSelected(false);
				}
			}
		});
		rdbtnNewRadioButton.setBounds(92, 213, 202, 23);
		contentPane.add(rdbtnNewRadioButton);

		rdbtnNewRadioButton_1.setBounds(92, 251, 202, 23);
		contentPane.add(rdbtnNewRadioButton_1);

		rdbtnNewRadioButton_2.setBounds(92, 291, 202, 23);
		contentPane.add(rdbtnNewRadioButton_2);

		rdbtnNewRadioButton_3.setBounds(92, 330, 202, 23);
		contentPane.add(rdbtnNewRadioButton_3);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				answerCheck();
				question();

			}
		});

		btnNewButton_1.setBounds(148, 605, 161, 49);
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 20));
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_17);
		contentPane.add(btnNewButton_1);
		contentPane.add(panel_1);
		contentPane.add(panel);

		lblNewLabel_9.setText(roll);
		
		
		lblNewLabel_18.setBounds(10, 236, 46, 14);
		panel_1.add(lblNewLabel_18);

		// date
		SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
		Date date = new Date();
		lblNewLabel_7.setText(df.format(date));

		try {
			Connection con = ConnectionProvider.getCon();
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select *from student where roll='" + roll + "'");
			while (rs.next()) {
				lblNewLabel_11.setText(rs.getString(1));
			}
			ResultSet rs1 = st.executeQuery("select *from question where id='" + questionId + "'");
			while (rs1.next()) {
				lblNewLabel_15.setText(rs1.getString(1));
				lblNewLabel_17.setText(rs1.getString(2));
				rdbtnNewRadioButton.setText(rs1.getString(3));
				rdbtnNewRadioButton_1.setText(rs1.getString(4));
				rdbtnNewRadioButton_2.setText(rs1.getString(5));
				rdbtnNewRadioButton_3.setText(rs1.getString(6));
				answer = rs1.getString(7);

			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

		setLocationRelativeTo(this);
		time = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				lblNewLabel_1.setText(String.valueOf(sec));
				lblNewLabel_3.setText(String.valueOf(min));

				if (sec == 60) {
					sec = 0;
					min++;
					if (min == 10) {
						time.stop();

					
						submit();

					}
				}
				sec++;
			}
		});
		time.start();

	}
}
