import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
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

public class QuizPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuizPage frame = new QuizPage();
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
	public QuizPage() {
		setUndecorated(true);
		FullScreen fs=new FullScreen();
		int x=fs.xsize;
		int y=fs.ysize;
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
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(1122, 11, 105, 24);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("00");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_1.setForeground(new Color(255, 102, 102));
		lblNewLabel_1.setBounds(1277, 49, 33, 22);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to Quiz");
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 34));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(115, 28, 322, 43);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("00");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_3.setForeground(new Color(255, 102, 102));
		lblNewLabel_3.setBounds(1242, 49, 25, 22);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("10 min.\r\n");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBounds(1242, 14, 73, 19);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Time Taken");
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(1122, 46, 116, 29);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Date");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_6.setBounds(806, 35, 61, 24);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setForeground(new Color(240, 230, 140));
		lblNewLabel_7.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_7.setBounds(869, 34, 116, 26);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon(QuizPage.class.getResource("/img2/icons8-student-male-100.png")));
		lblNewLabel_16.setBounds(0, 0, 105, 86);
		panel.add(lblNewLabel_16);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(1025, 102, 331, 650);
		panel_1.setForeground(new Color(119, 136, 153));
		panel_1.setBackground(new Color(211, 211, 211));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("ROLL NO.");
		lblNewLabel_8.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_8.setBounds(10, 53, 105, 26);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setForeground(new Color(119, 136, 153));
		lblNewLabel_9.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_9.setBounds(125, 53, 132, 26);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("NAME");
		lblNewLabel_10.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_10.setBounds(10, 97, 72, 26);
		panel_1.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setForeground(new Color(119, 136, 153));
		lblNewLabel_11.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_11.setBounds(125, 97, 132, 26);
		panel_1.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Total Question");
		lblNewLabel_12.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_12.setBounds(10, 162, 146, 26);
		panel_1.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_13.setBounds(194, 162, 132, 26);
		panel_1.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("Current Question");
		lblNewLabel_14.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_14.setBounds(10, 199, 178, 26);
		panel_1.add(lblNewLabel_14);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setForeground(new Color(50, 205, 50));
		lblNewLabel_15.setFont(new Font("Verdana", Font.BOLD, 17));
		lblNewLabel_15.setBounds(194, 199, 132, 26);
		panel_1.add(lblNewLabel_15);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setForeground(new Color(220, 20, 60));
		btnNewButton.setFont(new Font("Verdana", Font.BOLD, 16));
		btnNewButton.setBounds(209, 596, 96, 43);
		panel_1.add(btnNewButton);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(128, 128, 128));
		separator.setBounds(10, 141, 460, 2);
		panel_1.add(separator);
		
		JLabel lblNewLabel_17 = new JLabel("Questio demo?");
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(82, 167, 854, 38);
		lblNewLabel_17.setFont(new Font("Verdana", Font.BOLD, 18));
		
		JButton btnNewButton_1 = new JButton("Save & Next");
		btnNewButton_1.setBounds(148, 605, 161, 49);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Option 1");
		rdbtnNewRadioButton.setBounds(121, 212, 109, 23);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Option 2");
		rdbtnNewRadioButton_1.setBounds(121, 245, 109, 23);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Option 3");
		rdbtnNewRadioButton_2.setBounds(121, 279, 109, 23);
		contentPane.setLayout(null);
		contentPane.add(lblNewLabel_17);
		contentPane.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton_1);
		contentPane.add(rdbtnNewRadioButton_2);
		contentPane.add(btnNewButton_1);
		contentPane.add(panel_1);
		contentPane.add(panel);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Option 4");
		rdbtnNewRadioButton_3.setBounds(121, 311, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
	}
}
