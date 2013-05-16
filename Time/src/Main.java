import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPasswordField;


public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 895, 569);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUser = new JMenu("User");
		menuBar.add(mnUser);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mnUser.add(mntmAdd);
		
		JMenuItem mntmEdit = new JMenuItem("Edit");
		mnUser.add(mntmEdit);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnUser.add(mntmDelete);
		
		JMenu mnQuery = new JMenu("Query");
		mnUser.add(mnQuery);
		
		JMenu mnTasks_1 = new JMenu("Tasks");
		mnQuery.add(mnTasks_1);
		
		JMenuItem mntmCompleted = new JMenuItem("completed");
		mnTasks_1.add(mntmCompleted);
		
		JMenuItem mntmInProgress = new JMenuItem("in progress");
		mnTasks_1.add(mntmInProgress);
		
		JMenuItem mntmNotStarted = new JMenuItem("not started");
		mnTasks_1.add(mntmNotStarted);
		
		JMenu mnProjects_1 = new JMenu("Projects");
		mnQuery.add(mnProjects_1);
		
		JMenuItem mntmCompleted_1 = new JMenuItem("Completed");
		mnProjects_1.add(mntmCompleted_1);
		
		JMenuItem mntmInProgress_1 = new JMenuItem("in progress");
		mnProjects_1.add(mntmInProgress_1);
		
		JMenuItem mntmNotStarted_1 = new JMenuItem("not started");
		mnProjects_1.add(mntmNotStarted_1);
		
		JMenu mnTasks = new JMenu("Tasks");
		menuBar.add(mnTasks);
		
		JMenuItem mntmAdd_1 = new JMenuItem("Add");
		mnTasks.add(mntmAdd_1);
		
		JMenuItem mntmEdit_1 = new JMenuItem("Edit");
		mnTasks.add(mntmEdit_1);
		
		JMenuItem mntmDelete_1 = new JMenuItem("Delete");
		mnTasks.add(mntmDelete_1);
		
		JMenuItem mntmQuery_1 = new JMenuItem("Query");
		mnTasks.add(mntmQuery_1);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnTasks.add(mnNewMenu);
		
		JMenu mnProjects = new JMenu("Projects");
		menuBar.add(mnProjects);
		
		JMenuItem mntmAdd_2 = new JMenuItem("Add");
		mnProjects.add(mntmAdd_2);
		
		JMenuItem mntmEdit_2 = new JMenuItem("Edit");
		mnProjects.add(mntmEdit_2);
		
		JMenuItem mntmDelete_2 = new JMenuItem("Delete");
		mnProjects.add(mntmDelete_2);
		
		JMenuItem mntmQuery_2 = new JMenuItem("Query");
		mnProjects.add(mntmQuery_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO TIMEWISE");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 25));
		lblNewLabel.setBounds(240, 65, 346, 73);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(281, 309, 86, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel label = new JLabel("Username");
		label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		label.setBounds(281, 262, 77, 36);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setBounds(389, 272, 117, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(342, 388, 89, 23);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(389, 319, 117, 20);
		contentPane.add(passwordField);
	}
}
