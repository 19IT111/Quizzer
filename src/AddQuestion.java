import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Project.ConnectionProvider;
public class AddQuestion extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfQuestion;
	private JTextField tfOpt1;
	private JTextField tfOpt2;
	private JTextField tfOpt3;
	private JTextField tfOpt4;
	private JTextField tfAnswer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddQuestion frame = new AddQuestion();
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
	public AddQuestion() {
		
		setAlwaysOnTop(true);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300,200,950,500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AddQuestion.class.getResource("/img2/icons8-close-window-80.png")));
		lblNewLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});

		lblNewLabel.setBounds(872, 0, 75, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Question Id");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_1.setBounds(148, 77, 123, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Question");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_2.setBounds(113, 130, 117, 28);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Option 1");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_3.setBounds(175, 179, 80, 28);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Option 2");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_4.setBounds(175, 218, 80, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Option 3");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_5.setBounds(175, 257, 80, 28);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Option 4");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_6.setBounds(175, 300, 80, 31);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Answer");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_7.setBounds(175, 352, 80, 31);
		contentPane.add(lblNewLabel_7);
		
		tfQuestion = new JTextField();
		tfQuestion.setFont(new Font("Verdana", Font.PLAIN, 15));
		tfQuestion.setBounds(218, 132, 577, 28);
		contentPane.add(tfQuestion);
		tfQuestion.setColumns(10);
		
		tfOpt1 = new JTextField();
		tfOpt1.setFont(new Font("Verdana", Font.PLAIN, 15));
		tfOpt1.setBounds(265, 179, 400, 28);
		contentPane.add(tfOpt1);
		tfOpt1.setColumns(10);
		
		tfOpt2 = new JTextField();
		tfOpt2.setFont(new Font("Verdana", Font.PLAIN, 15));
		tfOpt2.setBounds(265, 218, 401, 28);
		contentPane.add(tfOpt2);
		tfOpt2.setColumns(10);
		
		tfOpt3 = new JTextField();
		tfOpt3.setFont(new Font("Verdana", Font.PLAIN, 15));
		tfOpt3.setBounds(265, 258, 400, 31);
		contentPane.add(tfOpt3);
		tfOpt3.setColumns(10);
		
		tfOpt4 = new JTextField();
		tfOpt4.setFont(new Font("Verdana", Font.PLAIN, 15));
		tfOpt4.setBounds(265, 303, 400, 28);
		contentPane.add(tfOpt4);
		tfOpt4.setColumns(10);
		
		tfAnswer = new JTextField();
		tfAnswer.setFont(new Font("Verdana", Font.PLAIN, 15));
		tfAnswer.setBounds(265, 352, 400, 34);
		contentPane.add(tfAnswer);
		tfAnswer.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("00");
		lblNewLabel_8.setForeground(new Color(255, 215, 0));
		lblNewLabel_8.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_8.setBounds(281, 84, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=lblNewLabel_8.getText();
				String name=tfQuestion.getText();
				String opt1=tfOpt1.getText();
				String opt2= tfOpt2.getText();
				String opt3=tfOpt3.getText();
				String opt4= tfOpt4.getText();
				String answer=tfAnswer.getText();
				try {
					Connection con=ConnectionProvider.getCon();
					PreparedStatement ps=con.prepareStatement("insert into question values(?,?,?,?,?,?,?)");
					ps.setString(1, id);
					ps.setString(2, name);
					ps.setString(3, opt1);
					ps.setString(4, opt2);
					ps.setString(5, opt3);
					ps.setString(6, opt4);
					ps.setString(7, answer);
					ps.executeUpdate();
					JFrame jf=new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf, "Successfully Saved");
					setVisible(false);
					new AddQuestion().setVisible(true);
				}catch(Exception i) {
					JOptionPane.showMessageDialog(null, i);
				}
				
;			}
		});
		btnNewButton.setBackground(new Color(143, 188, 143));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton.setBounds(113, 405, 117, 48);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			 tfQuestion.setText("");
			 tfOpt1.setText("");
			 tfOpt2.setText("");
			 tfOpt3.setText("");
			 tfOpt4.setText("");
			 tfAnswer.setText("");
				
			}
		});
		btnNewButton_1.setBackground(new Color(250, 128, 114));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNewButton_1.setBounds(690, 405, 117, 48);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(AddQuestion.class.getResource("/img2/icons8-add-80.png")));
		lblNewLabel_9.setBounds(0, 0, 80, 70);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Add Question");
		lblNewLabel_10.setFont(new Font("Verdana", Font.BOLD, 26));
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setBounds(82, 11, 245, 43);
		contentPane.add(lblNewLabel_10);
		
		try {
			Connection con=ConnectionProvider.getCon();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select count(id) from question");
			if(rs.first()) {
				int id=rs.getInt(1);
				id=id+1;
				String str=String.valueOf(id);
				lblNewLabel_8.setText(str);
			}
			else 
				lblNewLabel_8.setText("1");
				
			
		}catch(Exception e) {
			JFrame jf=new JFrame();
			jf.setAlwaysOnTop(true);
			JOptionPane.showMessageDialog(jf, e);
			
		}
	}
}
