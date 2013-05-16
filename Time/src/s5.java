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
import javax.swing.JComboBox;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.List;


public class s5 extends JFrame {

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
	public s5() {
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
		
		JLabel lblUsername = new JLabel("Select Task:");
		lblUsername.setBounds(201, 145, 58, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Task Details:");
		lblPassword.setBounds(201, 183, 72, 14);
		contentPane.add(lblPassword);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(283, 178, 104, 71);
		contentPane.add(textArea_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(279, 142, 108, 20);
		contentPane.add(comboBox);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
