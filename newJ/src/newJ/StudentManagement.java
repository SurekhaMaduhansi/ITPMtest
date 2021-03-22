package newJ;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Cursor;

public class StudentManagement {

	private JFrame frame;
	private JButton TagManagement;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentManagement window = new StudentManagement();
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
	public StudentManagement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(0, 0, 1370, 728);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton StudentGroupManagementBtn = new JButton("Student Group Management");
		StudentGroupManagementBtn.setFocusPainted(false);
		StudentGroupManagementBtn.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		StudentGroupManagementBtn.setBorderPainted(false);
		StudentGroupManagementBtn.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 13));
		StudentGroupManagementBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//navigate to AddManageStGrps tab
				JFrame AddManageStGrps  = new AddManageStGrps();
				AddManageStGrps.show();
				
				
			}
		});
		StudentGroupManagementBtn.setBounds(345, 174, 244, 37);
		StudentGroupManagementBtn.setBackground(new Color(65, 131, 215));
		StudentGroupManagementBtn.setForeground(Color.WHITE);
		frame.getContentPane().add(StudentGroupManagementBtn);
		
		TagManagement = new JButton("Tags Management");
		TagManagement.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFrame AddManageTags  = new AddManageTags();
				AddManageTags.show();
				
			}
		});
		
		TagManagement.setForeground(Color.WHITE);
		TagManagement.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 13));
		TagManagement.setFocusPainted(false);
		TagManagement.setBorderPainted(false);
		TagManagement.setBackground(new Color(65, 131, 215));
		TagManagement.setBounds(345, 254, 244, 37);
		frame.getContentPane().add(TagManagement);
	}
}
