import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;
import Project.ConnectionProvider;
import java.awt.Color;
public class DeleteQuestion {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteQuestion window = new DeleteQuestion();
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
	public DeleteQuestion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		setFrame(new JFrame());
		getFrame().setUndecorated(true);
		getFrame().setBounds(300,200,950,500);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel.setBounds(93, 135, 46, 14);
		getFrame().getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setBounds(180, 133, 86, 20);
		getFrame().getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Question");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_1.setBounds(76, 210, 92, 28);
		getFrame().getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Option 1");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_2.setBounds(93, 266, 75, 28);
		getFrame().getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Option 2");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_3.setBounds(93, 305, 75, 25);
		getFrame().getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Option 3");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_4.setBounds(93, 340, 75, 25);
		getFrame().getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Option 4");
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_5.setBounds(93, 371, 75, 25);
		getFrame().getContentPane().add(lblNewLabel_5);
		
		JLabel lblQ = new JLabel("");
		lblQ.setForeground(Color.LIGHT_GRAY);
		lblQ.setFont(new Font("Verdana", Font.BOLD, 15));
		lblQ.setBounds(180, 213, 732, 25);
		getFrame().getContentPane().add(lblQ);
		
		JLabel lblO1 = new JLabel("");
		lblO1.setForeground(Color.LIGHT_GRAY);
		lblO1.setFont(new Font("Verdana", Font.BOLD, 15));
		lblO1.setBounds(180, 337, 700, 28);
		getFrame().getContentPane().add(lblO1);
		
		JLabel lblO2 = new JLabel("");
		lblO2.setForeground(Color.LIGHT_GRAY);
		lblO2.setFont(new Font("Verdana", Font.BOLD, 15));
		lblO2.setBounds(180, 370, 700, 26);
		getFrame().getContentPane().add(lblO2);
		
		JLabel lblO3 = new JLabel("");
		lblO3.setForeground(Color.LIGHT_GRAY);
		lblO3.setFont(new Font("Verdana", Font.BOLD, 15));
		lblO3.setBounds(185, 276, 700, 29);
		getFrame().getContentPane().add(lblO3);
		
		JLabel lblO4 = new JLabel("");
		lblO4.setForeground(Color.LIGHT_GRAY);
		lblO4.setFont(new Font("Verdana", Font.BOLD, 15));
		lblO4.setBounds(185, 316, 700, 27);
		getFrame().getContentPane().add(lblO4);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setBackground(new Color(210, 105, 30));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id=textField.getText();
				try {
					Connection con=ConnectionProvider.getCon();
					PreparedStatement ps=con.prepareStatement("delete from question where id=?");
					ps.setString(1,id);
					ps.executeUpdate();
					JFrame jf=new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,"Successfully Deleted.");
					getFrame().setVisible(false);
					DeleteQuestion dq=new DeleteQuestion();
					dq.frame.setVisible(true);
					
				}catch(Exception e1) {
					JFrame jf=new JFrame();
					jf.setAlwaysOnTop(true);
					JOptionPane.showMessageDialog(jf,e1);
					
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(413, 448, 124, 41);
		getFrame().getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_11 = new JLabel("Answer");
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setFont(new Font("Verdana", Font.BOLD, 16));
		lblNewLabel_11.setBounds(93, 407, 75, 28);
		getFrame().getContentPane().add(lblNewLabel_11);
		
		JLabel lblA = new JLabel("");
		lblA.setForeground(Color.LIGHT_GRAY);
		lblA.setFont(new Font("Verdana", Font.BOLD, 15));
		lblA.setBounds(180, 407, 697, 28);
		getFrame().getContentPane().add(lblA);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon(DeleteQuestion.class.getResource("/img2/icons8-close-window-80.png")));
		lblNewLabel_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			   getFrame().setVisible(false);
			}
		});
	
		lblNewLabel_13.setBounds(875, 0, 75, 64);
		getFrame().getContentPane().add(lblNewLabel_13);
		
		JButton btnNewButton_1 = new JButton("SEARCH");
		btnNewButton_1.setBackground(new Color(70, 130, 180));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id =textField.getText();
				Connection con=ConnectionProvider.getCon();
				try {
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select *from question where id='"+id+"'");
					if(rs.first()) {
						lblQ.setText(rs.getString(2));
						lblO1.setText(rs.getString(3));
						lblO2.setText(rs.getString(4));
						lblO3.setText(rs.getString(5));
						lblO4.setText(rs.getString(6));
						lblA.setText(rs.getString(7));
						textField.setEditable(false);
					}
					else {
						JFrame jf=new JFrame();
						jf.setAlwaysOnTop(true);
						JOptionPane.showMessageDialog(jf,"Quetion Id does not Exist");
					}
						
				} catch (Exception e1) {
					
					JFrame jf=new JFrame();
					JOptionPane.showMessageDialog(jf,e1);
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(413, 123, 124, 41);
		getFrame().getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(DeleteQuestion.class.getResource("/img2/icons8-delete-bin-80.png")));
		lblNewLabel_6.setBounds(0, 0, 75, 64);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Delete Question");
		lblNewLabel_7.setForeground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Verdana", Font.BOLD, 26));
		lblNewLabel_7.setBounds(76, 0, 334, 64);
		frame.getContentPane().add(lblNewLabel_7);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
		frame.getContentPane().setBackground(Color.DARK_GRAY);
	}
}
