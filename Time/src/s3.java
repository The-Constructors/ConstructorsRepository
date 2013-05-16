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


public class s3 extends JFrame {

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
	public s3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 496);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("User");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuItem = new JMenuItem("");
		mnNewMenu.add(menuItem);
		
		JMenuItem mntmLogin = new JMenuItem("Login");
		mnNewMenu.add(mntmLogin);
		
		JMenuItem mntmLogout = new JMenuItem("Logout");
		mnNewMenu.add(mntmLogout);
		
		JMenu mnTasks = new JMenu("Tasks");
		menuBar.add(mnTasks);
		
		JMenuItem mntmCompleted = new JMenuItem("View");
		mnTasks.add(mntmCompleted);
		
		JMenuItem mntmSubmit = new JMenuItem("Submit");
		mnTasks.add(mntmSubmit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTimewise = new JLabel("WELCOME TO TIMEWISE");
		lblTimewise.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblTimewise.setBounds(124, 79, 316, 71);
		contentPane.add(lblTimewise);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(167, 224, 79, 27);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(167, 262, 79, 27);
		contentPane.add(lblPassword);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(291, 225, 104, 22);
		contentPane.add(textArea_1);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(291, 263, 104, 22);
		contentPane.add(textArea_2);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(223, 330, 89, 23);
		contentPane.add(btnNewButton);
	}
}
