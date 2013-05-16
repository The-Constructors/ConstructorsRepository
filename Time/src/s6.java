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
import javax.swing.JRadioButton;


public class s6 extends JFrame {

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
	public s6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 632, 496);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnUsers = new JMenu("Users");
		menuBar.add(mnUsers);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mnUsers.add(mntmAdd);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Edit");
		mnUsers.add(mntmNewMenuItem);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnUsers.add(mntmDelete);
		
		JMenuItem mntmLogIn = new JMenuItem("Log in");
		mnUsers.add(mntmLogIn);
		
		JMenuItem mntmLogOut = new JMenuItem("Log out");
		mnUsers.add(mntmLogOut);
		
		JMenu mnTasks = new JMenu("Tasks");
		menuBar.add(mnTasks);
		
		JMenu mnNewMenu = new JMenu("View by");
		mnTasks.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Date");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmVerified = new JMenuItem("Verified");
		mnNewMenu.add(mntmVerified);
		
		JMenuItem mntmNotVerified = new JMenuItem("Not verified");
		mnNewMenu.add(mntmNotVerified);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTimewise = new JLabel("TIMEWISE");
		lblTimewise.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 24));
		lblTimewise.setBounds(216, 38, 316, 71);
		contentPane.add(lblTimewise);
		
		JLabel lblUsername = new JLabel("Select User Id:");
		lblUsername.setBounds(183, 145, 72, 14);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Task Details:");
		lblPassword.setBounds(201, 295, 72, 14);
		contentPane.add(lblPassword);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(283, 290, 104, 71);
		contentPane.add(textArea_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(279, 142, 108, 20);
		contentPane.add(comboBox);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Verified");
		rdbtnNewRadioButton.setBounds(277, 180, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Not verified");
		rdbtnNewRadioButton_1.setBounds(278, 213, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("All");
		rdbtnNewRadioButton_2.setBounds(279, 244, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
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
