package StudentGroups;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;

import DBConnection.DBConnecction;

public class AddManageStGrps extends JFrame {
	
	Connection connection=null;

	private JPanel contentPane;
	private JPanel AddStudentGrpPanel_1;
	private JPanel ManageStudentGrpPanel_1;
	private JButton btnAddStGroup_1;
	private JButton btnManageStGroup_1;
	private JLayeredPane StudentGroupsLayeredPane_1;
	private JPanel AddFormPanel;
	private JTextField txtAddNewStudent;
	private JButton btnGenerateGID;
	private JButton btnGenerateSubGID;
	private JSpinner GroupNoSpinner;
	private JSpinner SubGroupNoSpinner;
	private JTextField GrpID;
	private JTextField SubGrpID;
	private JButton btnClearAdd;
	private JButton btnSaveAdd;
	private JComboBox AcademicYrSemList;
	private JComboBox ProgramListCB;
	private JPanel ViewStudentGroupsPanel;
	private JPanel GetDetailsFormPanel;
	private JTextField ViewManageStGrpstxt;
	private JButton btnGenGID;
	private JButton btnGenSubGID;
	private JComboBox AcYrSemViewList;
	private JComboBox ProgramViewList;
	private JSpinner SubGNumberViewSpinner;
	private JSpinner GNumberViewSpinner;
	private JTextField ViewGrpID;
	private JTextField ViewSubGrpID;
	private JButton BtnClearView;
	private JButton BtnUpdate;
	private JLabel lblAcademicYrandsemester;
	private JLabel lblProgram;
	private JLabel lblGroupNumber;
	private JLabel lblSubGroupNumber;
	private JLabel lblGroupId;
	private JLabel lblSubGroupId;
	private JLabel lblAcademicYearsemesterViewForm;
	private JLabel lblProgramViewForm;
	private JLabel lblGroupNumberViewForm;
	private JLabel lblSubGroupNumberViewForm;
	private JLabel lblGroupIdViewForm;
	private JLabel lblSubGroupIdViewForm;
	private JPanel panel_1;
	private JTextArea txtrTimeTableManagement;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddManageStGrps frame = new AddManageStGrps();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//switching panels
	public void SwitchPanels(JPanel panel)
	{
		StudentGroupsLayeredPane_1.removeAll();
		StudentGroupsLayeredPane_1.add(panel);
		StudentGroupsLayeredPane_1.repaint();
		StudentGroupsLayeredPane_1.revalidate();
	}
	
	//clear form fields after inserting data and after clicking clear button
	public void ClearFields()
	{
		GrpID.setText(null);
		SubGrpID.setText(null);
		AcademicYrSemList.setSelectedIndex(-1);
		ProgramListCB.setSelectedIndex(-1);
	}

	/**
	 * Create the frame.
	 */
	public AddManageStGrps() {
		
		connection = DBConnecction.dbConnecter();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 728);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		StudentGroupsLayeredPane_1 = new JLayeredPane();
		StudentGroupsLayeredPane_1.setBackground(Color.WHITE);
		StudentGroupsLayeredPane_1.setBounds(64, 163, 1223, 494);
		contentPane.add(StudentGroupsLayeredPane_1);
		StudentGroupsLayeredPane_1.setLayout(new CardLayout(0, 0));
		
		
		//Header
			panel_1 = new JPanel();
			panel_1.setBounds(0, 0, 1365, 75);
			panel_1.setForeground(Color.WHITE);
			panel_1.setBackground(new Color(75, 119, 190));
			panel_1.setBorder(new LineBorder(SystemColor.textHighlight, 2));
			contentPane.add(panel_1);
			
			txtrTimeTableManagement = new JTextArea();
			txtrTimeTableManagement.setEditable(false);
			txtrTimeTableManagement.setBackground(new Color(75, 119, 190));
			txtrTimeTableManagement.setForeground(Color.WHITE);
			txtrTimeTableManagement.setFont(new Font("Segoe UI Semilight", Font.BOLD, 26));
			txtrTimeTableManagement.setText("Timetable Management System");
			panel_1.add(txtrTimeTableManagement);
			
		//End Header
		
	//panel- Add student groups	
		AddStudentGrpPanel_1 = new JPanel();
		AddStudentGrpPanel_1.setBackground(Color.WHITE);
		StudentGroupsLayeredPane_1.add(AddStudentGrpPanel_1, "name_649734347273200");
		AddStudentGrpPanel_1.setLayout(null);
		
		AddFormPanel = new JPanel();
		AddFormPanel.setBackground(new Color(228, 241, 254));
		AddFormPanel.setBorder(null);
		AddFormPanel.setBounds(115, 11, 990, 472);
		
		
		AddStudentGrpPanel_1.add(AddFormPanel);
		AddFormPanel.setLayout(null);
		
		txtAddNewStudent = new JTextField();
		txtAddNewStudent.setBounds(349, 11, 279, 33);
		AddFormPanel.add(txtAddNewStudent);
		txtAddNewStudent.setBackground(new Color(228, 241, 254));
		txtAddNewStudent.setDisabledTextColor(Color.WHITE);
		txtAddNewStudent.setEditable(false);
		txtAddNewStudent.setBorder(null);
		txtAddNewStudent.setFocusTraversalKeysEnabled(false);
		txtAddNewStudent.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 18));
		txtAddNewStudent.setText("Add New Student Group");
		txtAddNewStudent.setColumns(10);
		
		
		
		GroupNoSpinner = new JSpinner();
		GroupNoSpinner.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 13));
		GroupNoSpinner.setBounds(280, 234, 222, 29);
		AddFormPanel.add(GroupNoSpinner);
		
		SubGroupNoSpinner = new JSpinner();
		SubGroupNoSpinner.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 13));
		SubGroupNoSpinner.setBounds(280, 295, 222, 29);
		AddFormPanel.add(SubGroupNoSpinner);
		
		GrpID = new JTextField();
		GrpID.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 13));
		GrpID.setBounds(662, 168, 220, 29);
		AddFormPanel.add(GrpID);
		GrpID.setColumns(10);
		
		SubGrpID = new JTextField();
		SubGrpID.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 13));
		SubGrpID.setColumns(10);
		SubGrpID.setBounds(662, 328, 220, 29);
		AddFormPanel.add(SubGrpID);
		
		btnClearAdd = new JButton("Clear");
		btnClearAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ClearFields();
			}
		});
		btnClearAdd.setForeground(Color.WHITE);
		btnClearAdd.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		btnClearAdd.setFocusPainted(false);
		btnClearAdd.setBackground(new Color(31, 58, 147));
		btnClearAdd.setBounds(529, 402, 132, 38);
		AddFormPanel.add(btnClearAdd);
		
		btnSaveAdd = new JButton("Save");
		btnSaveAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String query1 = "insert into StudentGroups(AcademicYrSem,Program,GroupNo,SubGroupNo,GroupID,SubGroupID) values(?,?,?,?,?,?)";
					PreparedStatement pstat=connection.prepareStatement(query1);
					
					String AcYrSem = AcademicYrSemList.getSelectedItem().toString();
					pstat.setString(1, AcYrSem);
					
					String prog = ProgramListCB.getSelectedItem().toString();
					pstat.setString(2, prog);
					
					String gpSpinner = GroupNoSpinner.getValue().toString();
					pstat.setString(3, gpSpinner);
					
					String subgpSpinner = SubGroupNoSpinner.getValue().toString();
					pstat.setString(4, subgpSpinner);
					
					//get generated group id and sub group id
					pstat.setString(5, GrpID.getText());
					pstat.setString(6, SubGrpID.getText());
					
					//data insertion success message
					pstat.execute();
					JOptionPane.showMessageDialog(null, "Data inserted successfully!");
					
					pstat.close();
					ClearFields();
					
					
				}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
				
			}
		});
		btnSaveAdd.setForeground(Color.WHITE);
		btnSaveAdd.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		btnSaveAdd.setFocusPainted(false);
		btnSaveAdd.setBackground(new Color(27, 163, 156));
		btnSaveAdd.setBounds(719, 402, 132, 38);
		AddFormPanel.add(btnSaveAdd);
		
		
		//Generate Group Id
		btnGenerateGID = new JButton("Generate GroupID");
		btnGenerateGID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String AcYrSem = AcademicYrSemList.getSelectedItem().toString();	
					String prog = ProgramListCB.getSelectedItem().toString();
					String gpSpinner = GroupNoSpinner.getValue().toString();
					
					
				
					String generatedGrpId = AcYrSem+"."+prog+"."+ gpSpinner;
					GrpID.setText(generatedGrpId);
					
					
				}
				catch(Exception e2)
				{
					e2.printStackTrace();
				}
				
			}
		});
		btnGenerateGID.setForeground(Color.WHITE);
		btnGenerateGID.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		btnGenerateGID.setFocusPainted(false);
		btnGenerateGID.setBackground(new Color(31, 58, 147));
		btnGenerateGID.setBounds(662, 85, 220, 38);
		AddFormPanel.add(btnGenerateGID);
		
		
	//Generate Sub Group Id
		btnGenerateSubGID = new JButton("Generate Sub GroupID");
		btnGenerateSubGID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					String AcYrSem = AcademicYrSemList.getSelectedItem().toString();	
					String prog = ProgramListCB.getSelectedItem().toString();
					String gpSpinner = GroupNoSpinner.getValue().toString();
					String subgpSpinner = SubGroupNoSpinner.getValue().toString();
					
	
						
					String generatedSubGrpId = AcYrSem+"."+prog+"."+ gpSpinner+"."+subgpSpinner;
					SubGrpID.setText(generatedSubGrpId);
		
					
					
				}
				catch(Exception e3)
				{
					e3.printStackTrace();
				}
				
				
			}
		});
		btnGenerateSubGID.setActionCommand("Generate Sub GroupID");
		btnGenerateSubGID.setForeground(Color.WHITE);
		btnGenerateSubGID.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		btnGenerateSubGID.setFocusPainted(false);
		btnGenerateSubGID.setBackground(new Color(31, 58, 147));
		btnGenerateSubGID.setBounds(662, 248, 220, 38);
		AddFormPanel.add(btnGenerateSubGID);
		
		
		String[] AYSList = {"Y1S1","Y1S2","Y2S1","Y2S2","Y3S1","Y3S2","Y4S1","Y4S2"};
	    AcademicYrSemList = new JComboBox(AYSList);
		AcademicYrSemList.setSelectedIndex(-1);
		//AcademicYrSemList.addActionListener();
		AcademicYrSemList.setBackground(Color.WHITE);
		AcademicYrSemList.setBounds(280, 107, 222, 29);
		AddFormPanel.add(AcademicYrSemList);
		
		
		String[] PRList = {"IT" , "SE" , "DS", "CSE","IE" ,"BM"};
		ProgramListCB = new JComboBox(PRList);
		ProgramListCB.setSelectedIndex(-1);
		ProgramListCB.setBackground(Color.WHITE);
		ProgramListCB.setBounds(280, 168, 222, 29);
		AddFormPanel.add(ProgramListCB);
		
		lblAcademicYrandsemester = new JLabel("Academic year and semester :");
		lblAcademicYrandsemester.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblAcademicYrandsemester.setBounds(61, 107, 209, 24);
		AddFormPanel.add(lblAcademicYrandsemester);
		
		lblProgram = new JLabel("Program :");
		lblProgram.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblProgram.setBounds(61, 168, 209, 24);
		AddFormPanel.add(lblProgram);
		
		lblGroupNumber = new JLabel("Group Number :");
		lblGroupNumber.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblGroupNumber.setBounds(61, 234, 209, 24);
		AddFormPanel.add(lblGroupNumber);
		
		lblSubGroupNumber = new JLabel("Sub Group Number :");
		lblSubGroupNumber.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblSubGroupNumber.setBounds(61, 295, 209, 24);
		AddFormPanel.add(lblSubGroupNumber);
		
		lblGroupId = new JLabel("Group ID :");
		lblGroupId.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblGroupId.setBounds(662, 134, 209, 24);
		AddFormPanel.add(lblGroupId);
		
		lblSubGroupId = new JLabel("Sub Group ID:");
		lblSubGroupId.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblSubGroupId.setBounds(662, 295, 209, 24);
		AddFormPanel.add(lblSubGroupId);
	
	//panel- Manage student groups
		ManageStudentGrpPanel_1 = new JPanel();
		ManageStudentGrpPanel_1.setBackground(Color.WHITE);
		StudentGroupsLayeredPane_1.add(ManageStudentGrpPanel_1, "name_649838542681000");
		ManageStudentGrpPanel_1.setLayout(null);
		
		ViewStudentGroupsPanel = new JPanel();
		ViewStudentGroupsPanel.setBounds(10, 33, 726, 450);
		ViewStudentGroupsPanel.setBackground(new Color(228, 241, 254));
		ViewStudentGroupsPanel.setBorder(null);
		ManageStudentGrpPanel_1.add(ViewStudentGroupsPanel);
		ViewStudentGroupsPanel.setLayout(null);
		
		GetDetailsFormPanel = new JPanel();
		GetDetailsFormPanel.setBounds(770, 33, 443, 450);
		GetDetailsFormPanel.setBackground(new Color(197, 239, 247));
		GetDetailsFormPanel.setBorder(null);
		ManageStudentGrpPanel_1.add(GetDetailsFormPanel);
		GetDetailsFormPanel.setLayout(null);
		
		btnGenGID = new JButton("Generate GroupID");
		btnGenGID.setForeground(Color.WHITE);
		btnGenGID.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		btnGenGID.setFocusPainted(false);
		btnGenGID.setBackground(new Color(31, 58, 147));
		btnGenGID.setBounds(109, 188, 185, 30);
		GetDetailsFormPanel.add(btnGenGID);
		
		btnGenSubGID = new JButton("Generate SubGroupID");
		btnGenSubGID.setForeground(Color.WHITE);
		btnGenSubGID.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		btnGenSubGID.setFocusPainted(false);
		btnGenSubGID.setBackground(new Color(31, 58, 147));
		btnGenSubGID.setBounds(109, 288, 185, 30);
		GetDetailsFormPanel.add(btnGenSubGID);
		
		

		AcYrSemViewList = new JComboBox(AYSList);
		AcYrSemViewList.setBackground(Color.WHITE);
		AcYrSemViewList.setBounds(220, 30, 185, 24);
		GetDetailsFormPanel.add(AcYrSemViewList);
		
		ProgramViewList = new JComboBox(PRList);
		ProgramViewList.setBackground(Color.WHITE);
		ProgramViewList.setBounds(220, 71, 185, 24);
		GetDetailsFormPanel.add(ProgramViewList);
		
		SubGNumberViewSpinner = new JSpinner();
		SubGNumberViewSpinner.setBounds(220, 153, 185, 20);
		GetDetailsFormPanel.add(SubGNumberViewSpinner);
		
		GNumberViewSpinner = new JSpinner();
		GNumberViewSpinner.setBounds(220, 112, 185, 20);
		GetDetailsFormPanel.add(GNumberViewSpinner);
		
		ViewGrpID = new JTextField();
		ViewGrpID.setBounds(220, 235, 185, 24);
		GetDetailsFormPanel.add(ViewGrpID);
		ViewGrpID.setColumns(10);
		
		ViewSubGrpID = new JTextField();
		ViewSubGrpID.setColumns(10);
		ViewSubGrpID.setBounds(220, 335, 185, 24);
		GetDetailsFormPanel.add(ViewSubGrpID);
		
		BtnClearView = new JButton("Clear");
		BtnClearView.setForeground(Color.WHITE);
		BtnClearView.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		BtnClearView.setFocusPainted(false);
		BtnClearView.setBackground(new Color(31, 58, 147));
		BtnClearView.setBounds(60, 409, 123, 30);
		GetDetailsFormPanel.add(BtnClearView);
		
		BtnUpdate = new JButton("Update");
		BtnUpdate.setForeground(Color.WHITE);
		BtnUpdate.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		BtnUpdate.setFocusPainted(false);
		BtnUpdate.setBackground(new Color(27, 163, 156));
		BtnUpdate.setBounds(234, 409, 123, 30);
		GetDetailsFormPanel.add(BtnUpdate);
		
		lblAcademicYearsemesterViewForm = new JLabel("Academic year &semester :");
		lblAcademicYearsemesterViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblAcademicYearsemesterViewForm.setBounds(10, 30, 209, 24);
		GetDetailsFormPanel.add(lblAcademicYearsemesterViewForm);
		
		lblProgramViewForm = new JLabel("Program :");
		lblProgramViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblProgramViewForm.setBounds(10, 71, 209, 24);
		GetDetailsFormPanel.add(lblProgramViewForm);
		
		lblGroupNumberViewForm = new JLabel("Group Number:");
		lblGroupNumberViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblGroupNumberViewForm.setBounds(10, 112, 209, 24);
		GetDetailsFormPanel.add(lblGroupNumberViewForm);
		
		lblSubGroupNumberViewForm = new JLabel("Sub Group Number :");
		lblSubGroupNumberViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblSubGroupNumberViewForm.setBounds(10, 153, 209, 24);
		GetDetailsFormPanel.add(lblSubGroupNumberViewForm);
		
		lblGroupIdViewForm = new JLabel("Group ID :");
		lblGroupIdViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblGroupIdViewForm.setBounds(10, 235, 209, 24);
		GetDetailsFormPanel.add(lblGroupIdViewForm);
		
		lblSubGroupIdViewForm = new JLabel("Sub Group ID :");
		lblSubGroupIdViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblSubGroupIdViewForm.setBounds(10, 335, 209, 24);
		GetDetailsFormPanel.add(lblSubGroupIdViewForm);
		
		ViewManageStGrpstxt = new JTextField();
		ViewManageStGrpstxt.setText("View And Manage Student Groups\r\n");
		ViewManageStGrpstxt.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		ViewManageStGrpstxt.setFocusTraversalKeysEnabled(false);
		ViewManageStGrpstxt.setEditable(false);
		ViewManageStGrpstxt.setColumns(10);
		ViewManageStGrpstxt.setBorder(null);
		ViewManageStGrpstxt.setBackground(Color.WHITE);
		ViewManageStGrpstxt.setBounds(515, 0, 330, 30);
		ManageStudentGrpPanel_1.add(ViewManageStGrpstxt);
		
	
	//add student groups main button
		btnAddStGroup_1 = new JButton("Add Student Group");
		btnAddStGroup_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SwitchPanels(AddStudentGrpPanel_1);
			}
		});
		
		
		btnAddStGroup_1.setFocusPainted(false);
		btnAddStGroup_1.setBackground(new Color(31, 58, 147));
		btnAddStGroup_1.setForeground(Color.WHITE);
		btnAddStGroup_1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		btnAddStGroup_1.setBounds(64, 114, 294, 38);
		contentPane.add(btnAddStGroup_1);
		
		
	//Manage student groups main button	
		btnManageStGroup_1 = new JButton("Manage Student Group");
		btnManageStGroup_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SwitchPanels(ManageStudentGrpPanel_1);
			}
		});
		
		
		btnManageStGroup_1.setFocusPainted(false);
		btnManageStGroup_1.setBackground(new Color(31, 58, 147));
		btnManageStGroup_1.setForeground(Color.WHITE);
		btnManageStGroup_1.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		btnManageStGroup_1.setBounds(453, 114, 294, 38);
		contentPane.add(btnManageStGroup_1);
	}
}
