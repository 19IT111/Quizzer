import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Submitted extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Submitted frame = new Submitted("00");
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
	public Submitted(String marks) {
		setUndecorated(true);
		FullScreen fs=new FullScreen();
		int x=fs.xsize;
		int y=fs.ysize;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, x, y);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Marks obtained:");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 45));
		
		JLabel lblNewLabel_1 = new JLabel("00");
		lblNewLabel_1.setForeground(new Color(51, 204, 102));
		lblNewLabel_1.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 45));
		
		
		JLabel lblNewLabel_2 = new JLabel("Successfully Submitted");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 45));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				Index window=new Index();
				window.frmIndex.setVisible(true);
			}
		});
		lblNewLabel_3.setIcon(new ImageIcon(Submitted.class.getResource("/img2/icons8-close-window-80.png")));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(456, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
								.addComponent(lblNewLabel_2))
							.addGap(446))
						.addComponent(lblNewLabel_3, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
					.addGap(253)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 51, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addGap(311))
		);
		contentPane.setLayout(gl_contentPane);
		
		lblNewLabel_1.setText(marks);
	}
}
