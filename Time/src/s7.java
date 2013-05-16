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


public class s7 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

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
	public s7() {
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
		
		JLabel lblUsername = new JLabel("Firstname:");
		lblUsername.setBounds(185, 190, 72, 14);
		contentPane.add(lblUsername);
		
		textField = new JTextField();
		textField.setBounds(278, 142, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(278, 187, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(278, 230, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(185, 233, 46, 14);
		contentPane.add(lblSurname);
		
		JLabel lblUserId = new JLabel("User Id:");
		lblUserId.setBounds(185, 145, 46, 14);
		contentPane.add(lblUserId);
		
		textField_3 = new JTextField();
		textField_3.setBounds(278, 280, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(278, 324, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(185, 283, 72, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(185, 327, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setBounds(278, 381, 89, 23);
		contentPane.add(btnNewButton);
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
