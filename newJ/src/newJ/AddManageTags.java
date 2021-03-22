package newJ;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLayeredPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.SystemColor;
import javax.swing.JSpinner;

public class AddManageTags extends JFrame {

	private JPanel contentPane;
	private JLayeredPane TagsLayeredPane;
	private JPanel AddTagsPanel;
	private JPanel ManageTagsPanel;
	private JButton btnAddTags;
	private JButton btnManageTags;
	private JPanel AddTagFormPanel;
	private JLabel AddTagsLabel;
	private JLabel TagNameLabel;
	private JLabel TagCodeLabel;
	private JTextField txtTagName;
	private JTextField txtTagCode;
	private JComboBox RelatedTagComboBox;
	private JButton btnSaveTag;
	private JButton btnClearTag;
	private JPanel panel_1;
	private JTextArea txtrTimeTableManagement;
	private JLabel TagRelatedLabel;
	private JPanel ViewTagsPanel;
	private JPanel GetTagsFormPanel;
	private JComboBox RelatedTagListView;
	private JTextField textField;
	private JTextField textField_1;
	private JButton BtnClearTagView;
	private JButton BtnUpdateTag;
	private JLabel lblTagCodeViewForm;
	private JLabel lblTagNameViewForm;
	private JLabel lblRelatedTagViewForm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddManageTags frame = new AddManageTags();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void SwitchTagPanels(JPanel panel)
	{
		TagsLayeredPane.removeAll();
		TagsLayeredPane.add(panel);
		TagsLayeredPane.repaint();
		TagsLayeredPane.revalidate();
	}
	

	/**
	 * Create the frame.
	 */
	public AddManageTags() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1370, 728);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
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
		
		TagsLayeredPane = new JLayeredPane();
		TagsLayeredPane.setBackground(Color.WHITE);
		TagsLayeredPane.setBounds(64, 163, 1223, 494);
		contentPane.add(TagsLayeredPane);
		TagsLayeredPane.setLayout(new CardLayout(0, 0));
		
	//Add Tags panel	
		AddTagsPanel = new JPanel();
		TagsLayeredPane.add(AddTagsPanel, "name_676907526330200");
		AddTagsPanel.setBackground(Color.WHITE);
		AddTagsPanel.setLayout(null);
		
		AddTagFormPanel = new JPanel();
		AddTagFormPanel.setBounds(360, 11, 460, 472);
		AddTagFormPanel.setBackground(new Color(228, 241, 254));
		AddTagsPanel.add(AddTagFormPanel);
		AddTagFormPanel.setLayout(null);
		
		AddTagsLabel = new JLabel("Add New Tag");
		AddTagsLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 17));
		AddTagsLabel.setBounds(105, 11, 266, 29);
		AddTagFormPanel.add(AddTagsLabel);
		
		TagNameLabel = new JLabel("Tag Name  :");
		TagNameLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		TagNameLabel.setBounds(26, 92, 169, 29);
		AddTagFormPanel.add(TagNameLabel);
		
		TagCodeLabel = new JLabel("Tag Code  :");
		TagCodeLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		TagCodeLabel.setBounds(26, 168, 169, 29);
		AddTagFormPanel.add(TagCodeLabel);
		
		TagRelatedLabel = new JLabel("Related Tag   :");
		TagRelatedLabel.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		TagRelatedLabel.setBounds(26, 242, 169, 29);
		AddTagFormPanel.add(TagRelatedLabel);
		
		txtTagName = new JTextField();
		txtTagName.setBounds(136, 98, 235, 23);
		AddTagFormPanel.add(txtTagName);
		txtTagName.setColumns(10);
		
		txtTagCode = new JTextField();
		txtTagCode.setColumns(10);
		txtTagCode.setBounds(136, 174, 235, 23);
		AddTagFormPanel.add(txtTagCode);
		
		
		String[] RelatedTagList = {"Lecture" , "Tutorial", "Laboratory","Evaluation"};
		RelatedTagComboBox = new JComboBox(RelatedTagList);
		RelatedTagComboBox.setSelectedIndex(-1);
		RelatedTagComboBox.setBounds(136, 248, 235, 23);
		AddTagFormPanel.add(RelatedTagComboBox);
		
		btnClearTag = new JButton("Clear");
		btnClearTag.setForeground(Color.WHITE);
		btnClearTag.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		btnClearTag.setFocusPainted(false);
		btnClearTag.setBackground(new Color(31, 58, 147));
		btnClearTag.setBounds(110, 325, 220, 38);
		AddTagFormPanel.add(btnClearTag);
		
		btnSaveTag = new JButton("Save");
		btnSaveTag.setForeground(Color.WHITE);
		btnSaveTag.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		btnSaveTag.setFocusPainted(false);
		btnSaveTag.setBackground(new Color(27, 163, 156));
		btnSaveTag.setBounds(110, 390, 220, 38);
		AddTagFormPanel.add(btnSaveTag);
		
		
	//Manage tags panel
		ManageTagsPanel = new JPanel();
		TagsLayeredPane.add(ManageTagsPanel, "name_676940029069200");
		ManageTagsPanel.setBackground(Color.WHITE);
		ManageTagsPanel.setLayout(null);
		
		ViewTagsPanel = new JPanel();
		ViewTagsPanel.setLayout(null);
		ViewTagsPanel.setBorder(null);
		ViewTagsPanel.setBackground(new Color(228, 241, 254));
		ViewTagsPanel.setBounds(0, 0, 726, 483);
		ManageTagsPanel.add(ViewTagsPanel);
		
		GetTagsFormPanel = new JPanel();
		GetTagsFormPanel.setLayout(null);
		GetTagsFormPanel.setBorder(null);
		GetTagsFormPanel.setBackground(new Color(197, 239, 247));
		GetTagsFormPanel.setBounds(770, 0, 443, 483);
		ManageTagsPanel.add(GetTagsFormPanel);
		
		
		RelatedTagListView = new JComboBox(RelatedTagList);
		RelatedTagListView.setBackground(Color.WHITE);
		RelatedTagListView.setSelectedIndex(-1);
		RelatedTagListView.setBounds(220, 202, 185, 24);
		GetTagsFormPanel.add(RelatedTagListView);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(220, 80, 185, 24);
		GetTagsFormPanel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(220, 134, 185, 24);
		GetTagsFormPanel.add(textField_1);
		
		BtnClearTagView = new JButton("Clear");
		BtnClearTagView.setForeground(Color.WHITE);
		BtnClearTagView.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		BtnClearTagView.setFocusPainted(false);
		BtnClearTagView.setBackground(new Color(31, 58, 147));
		BtnClearTagView.setBounds(152, 331, 123, 30);
		GetTagsFormPanel.add(BtnClearTagView);
		
		BtnUpdateTag = new JButton("Update");
		BtnUpdateTag.setForeground(Color.WHITE);
		BtnUpdateTag.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		BtnUpdateTag.setFocusPainted(false);
		BtnUpdateTag.setBackground(new Color(27, 163, 156));
		BtnUpdateTag.setBounds(152, 396, 123, 30);
		GetTagsFormPanel.add(BtnUpdateTag);
		
		lblTagCodeViewForm = new JLabel("Tag Code :");
		lblTagCodeViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblTagCodeViewForm.setBounds(26, 78, 209, 24);
		GetTagsFormPanel.add(lblTagCodeViewForm);
		
		lblTagNameViewForm = new JLabel("Tag Name :");
		lblTagNameViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblTagNameViewForm.setBounds(26, 132, 209, 24);
		GetTagsFormPanel.add(lblTagNameViewForm);
		
		lblRelatedTagViewForm = new JLabel("Reated Tag :");
		lblRelatedTagViewForm.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 14));
		lblRelatedTagViewForm.setBounds(26, 200, 209, 24);
		GetTagsFormPanel.add(lblRelatedTagViewForm);
		
	//Add Tags	
		btnAddTags = new JButton("Add Tags");
		btnAddTags.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent arg0) {
				SwitchTagPanels(AddTagsPanel); //Switch to add tag panel
				
			}
		});
		btnAddTags.setBounds(64, 114, 294, 38);
		btnAddTags.setFocusPainted(false);
		btnAddTags.setBackground(new Color(58, 83, 155));
		btnAddTags.setForeground(Color.WHITE);
		btnAddTags.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		contentPane.add(btnAddTags);
		
		
	//Manage Tags	
		btnManageTags = new JButton("Manage Tags");
		btnManageTags.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) {
				SwitchTagPanels(ManageTagsPanel); //switch to manage tag panel
			}
		});
		
		btnManageTags.setBounds(453, 114, 294, 38);
		btnManageTags.setFocusPainted(false);
		btnManageTags.setBackground(new Color(58, 83, 155));
		btnManageTags.setForeground(Color.WHITE);
		btnManageTags.setFont(new Font("Leelawadee UI Semilight", Font.BOLD, 16));
		contentPane.add(btnManageTags);
		

		
		
		
	}
}
