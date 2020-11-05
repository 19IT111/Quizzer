
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import java.lang.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Index {

	JFrame frmIndex;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.frmIndex.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FullScreen fs=new FullScreen();
		int x=fs.xsize;
		int y=fs.ysize;
		frmIndex = new JFrame();
		frmIndex.getContentPane().setFont(new Font("Verdana", Font.PLAIN, 28));
		frmIndex.getContentPane().setSize(new Dimension(30, 30));
		frmIndex.setUndecorated(true);
		frmIndex.setTitle("Index\r\n");
		frmIndex.setBounds(0,0,x,y);
		frmIndex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmIndex.setResizable(false);
		frmIndex.setSize(x,y);
		
		JButton btnNewButton = new JButton("Admin");
		btnNewButton.setBounds(1021, 149, 180, 57);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(51, 204, 204));

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIndex.setVisible(false);
				Admin_Login window=new Admin_Login();
			window.getFrame().setVisible(true);
				
			}
		});
		btnNewButton.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
		
		JButton btnNewButton_1 = new JButton("Student");
		btnNewButton_1.setBounds(1021, 355, 180, 57);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmIndex.setVisible(false);
			//	Student_Login window=new Student_Login();
			//	window.getFrame().setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.ORANGE);
		
		btnNewButton_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.setBounds(1021, 561, 180, 55);
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(255, 51, 0));
		btnNewButton_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 22));
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null, "Doyou really Want to Exit?","Confirm",JOptionPane.YES_NO_OPTION);
				if(a==0)
					System.exit(0);
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("Welcome");
		lblNewLabel.setBounds(48, 11, 477, 95);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 60));
		
		JLabel lblNewLabel_1 = new JLabel("Don't Stress.");
		lblNewLabel_1.setBounds(59, 135, 254, 47);
		lblNewLabel_1.setForeground(new Color(220, 220, 220));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 35));
		
		JLabel lblNewLabel_2 = new JLabel("Do your Best.");
		lblNewLabel_2.setBounds(59, 182, 254, 47);
		lblNewLabel_2.setForeground(new Color(220, 220, 220));
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 35));
		
		JLabel lblNewLabel_3 = new JLabel("Forget the Rest.");
		lblNewLabel_3.setBounds(59, 229, 254, 47);
		lblNewLabel_3.setForeground(new Color(220, 220, 220));
		lblNewLabel_3.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 35));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(0, 0, 1366, 768);
		lblNewLabel_4.setIcon(new ImageIcon(Index.class.getResource("/img2/question-mark-2492009_1920.jpg")));
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD, 30));
		frmIndex.getContentPane().setLayout(null);
		frmIndex.getContentPane().add(lblNewLabel_2);
		frmIndex.getContentPane().add(btnNewButton);
		frmIndex.getContentPane().add(lblNewLabel);
		frmIndex.getContentPane().add(btnNewButton_2);
		frmIndex.getContentPane().add(btnNewButton_1);
		frmIndex.getContentPane().add(lblNewLabel_3);
		frmIndex.getContentPane().add(lblNewLabel_1);
		frmIndex.getContentPane().add(lblNewLabel_4);
	}
}
