import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;


public class s4 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					s1 frame = new s1();
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
	public s4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 496);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsers = new JMenu("Users");
		menuBar.add(mnUsers);
		
		JMenuItem mntmLogIn = new JMenuItem("Log in");
		mnUsers.add(mntmLogIn);
		
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mnUsers.add(mntmLogOut);
		
		JMenu mnTasks = new JMenu("Tasks");
		menuBar.add(mnTasks);
		
		JMenuItem mntmView = new JMenuItem("View");
		mnTasks.add(mntmView);
		
		JMenuItem mntmSubmit = new JMenuItem("Submit");
		mnTasks.add(mntmSubmit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTimewise = new JLabel("TIMEWISE");
		lblTimewise.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblTimewise.setBounds(216, 38, 316, 71);
		contentPane.add(lblTimewise);
		
		JLabel lblUsername = new JLabel("Task Ref:");
		lblUsername.setBounds(194, 142, 56, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Task Details:");
		lblPassword.setBounds(194, 180, 72, 14);
		contentPane.add(lblPassword);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(276, 137, 104, 22);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(276, 175, 104, 71);
		contentPane.add(textArea_2);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.setBounds(276, 272, 104, 23);
		contentPane.add(btnNewButton);
	}
}
