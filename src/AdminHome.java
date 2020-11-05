import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminHome {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminHome window = new AdminHome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminHome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		FullScreen fs=new FullScreen();
		int x=fs.xsize;
		int y=fs.ysize;
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.setBounds(0, 0, x, y);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuBar.setForeground(new Color(245, 245, 245));
		menuBar.setBackground(new Color(105, 105, 105));
		frame.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("ADD ");
		mntmNewMenuItem_1.setIcon(new ImageIcon(AdminHome.class.getResource("/img2/icons8-add-80.png")));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddQuestion window=new AddQuestion();
				window.setVisible(true);
			}
		});
		mntmNewMenuItem_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_1.setForeground(new Color(245, 245, 245));
		mntmNewMenuItem_1.setBackground(new Color(105, 105, 105));
		mntmNewMenuItem_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("EDIT");
		mntmNewMenuItem.setIcon(new ImageIcon(AdminHome.class.getResource("/img2/icons8-edit-80.png")));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditQuestion window=new EditQuestion();
				window.setVisible(true);
			}
		});
		mntmNewMenuItem.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem.setForeground(new Color(245, 245, 245));
		mntmNewMenuItem.setBackground(new Color(105, 105, 105));
		mntmNewMenuItem.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
	
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("DELETE ");
		mntmNewMenuItem_2.setIcon(new ImageIcon(AdminHome.class.getResource("/img2/icons8-delete-bin-80.png")));
		mntmNewMenuItem_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DeleteQuestion dq=new DeleteQuestion();
				dq.getFrame().setVisible(true);
				
			}
		});
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_2.setForeground(new Color(245, 245, 245));
		mntmNewMenuItem_2.setBackground(new Color(105, 105, 105));
		mntmNewMenuItem_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		
		menuBar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("QUESTIONS");
		mntmNewMenuItem_3.setIcon(new ImageIcon(AdminHome.class.getResource("/img2/icons8-select-all-80.png")));
		mntmNewMenuItem_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AllQuestion aq=new AllQuestion();
				aq.setVisible(true);
			}
		});
		mntmNewMenuItem_3.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_3.setForeground(new Color(245, 245, 245));
		mntmNewMenuItem_3.setBackground(new Color(105, 105, 105));
		mntmNewMenuItem_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		
		menuBar.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("RESULT");
		mntmNewMenuItem_4.setIcon(new ImageIcon(AdminHome.class.getResource("/img2/icons8-test-passed-80.png")));
		mntmNewMenuItem_4.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_4.setForeground(new Color(245, 245, 245));
		mntmNewMenuItem_4.setBackground(new Color(105, 105, 105));
		mntmNewMenuItem_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		
		menuBar.add(mntmNewMenuItem_4);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("LOGOUT");
		mntmNewMenuItem_5.setIcon(new ImageIcon(AdminHome.class.getResource("/img2/icons8-export-80.png")));
		mntmNewMenuItem_5.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do You Really Want to Logout?","Confirm",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					frame.setVisible(false);
					Index window=new Index();
					window.frmIndex.setVisible(true);
				}
			}
		});
		mntmNewMenuItem_5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_5.setForeground(new Color(245, 245, 245));
		mntmNewMenuItem_5.setBackground(new Color(105, 105, 105));
		mntmNewMenuItem_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));

		menuBar.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("EXIT");
		mntmNewMenuItem_6.setIcon(new ImageIcon(AdminHome.class.getResource("/img2/icons8-close-window-80.png")));
		mntmNewMenuItem_6.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a=JOptionPane.showConfirmDialog(null,"Do You Really Want to Exit?","Confirm",JOptionPane.YES_NO_OPTION);
				if(a==0) {
					frame.setVisible(false);
				}
			}
		});
		mntmNewMenuItem_6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mntmNewMenuItem_6.setForeground(new Color(245, 245, 245));
		mntmNewMenuItem_6.setBackground(new Color(105, 105, 105));
		mntmNewMenuItem_6.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		
		menuBar.add(mntmNewMenuItem_6);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AdminHome.class.getResource("/img2/question_marks_figures_3d_112755_4000x2200.jpg")));
		
		lblNewLabel.setBounds(0, 0, 1366, 740);
		frame.getContentPane().add(lblNewLabel);
	}
}
