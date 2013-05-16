import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextPane;


public class User2mainbuild extends JFrame {

	private JPanel contentPane;
	private JTextField txtjavacsonarfreqsubmarinestealthjava;
	private JTextField txtTaskinProgress;
	private JTextField txtTaskpending;
	private JTextField txtTasknotAvailable;
	private JTextField txtTaskcompleted;
	private JTextField txtTaskcompleted_1;
	private JTextField txtTbtdhrm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					User2mainbuild frame = new User2mainbuild();
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
	public User2mainbuild() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 468);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea txtrJohnOconnor = new JTextArea();
		txtrJohnOconnor.setText("John O'Connor");
		txtrJohnOconnor.setWrapStyleWord(true);
		txtrJohnOconnor.setBounds(153, 24, 119, 22);
		contentPane.add(txtrJohnOconnor);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(212, 57, -51, 22);
		contentPane.add(textArea_1);
		
		JTextArea txtrId = new JTextArea();
		txtrId.setText("ID:22224567");
		txtrId.setWrapStyleWord(true);
		txtrId.setBounds(153, 57, 119, 22);
		contentPane.add(txtrId);
		
		JTextArea txtrJavaclass = new JTextArea();
		txtrJavaclass.setText("JavaClass12-");
		txtrJavaclass.setWrapStyleWord(true);
		txtrJavaclass.setBounds(153, 90, 119, 22);
		contentPane.add(txtrJavaclass);
		
		txtjavacsonarfreqsubmarinestealthjava = new JTextField();
		txtjavacsonarfreqsubmarinestealthjava.setText("_Java-c/sonarfreq/Submarine/Stealth.java");
		txtjavacsonarfreqsubmarinestealthjava.setBounds(20, 186, 161, 20);
		contentPane.add(txtjavacsonarfreqsubmarinestealthjava);
		txtjavacsonarfreqsubmarinestealthjava.setColumns(10);
		
		JButton btnNewButton = new JButton("Store");
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.setBounds(56, 231, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ReBuild");
		btnNewButton_1.setBackground(Color.CYAN);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(56, 281, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Finalise");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setBounds(56, 329, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("NextPhase");
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setBounds(56, 375, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JTextArea txtrPm = new JTextArea();
		txtrPm.setBackground(Color.GREEN);
		txtrPm.setText("12:06 pm");
		txtrPm.setBounds(10, 11, 76, 22);
		contentPane.add(txtrPm);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.GREEN);
		textArea.setText("04-04-2013");
		textArea.setBounds(10, 44, 84, 22);
		contentPane.add(textArea);
		
		JButton btnNewButton_4 = new JButton("Browse");
		btnNewButton_4.setBackground(Color.ORANGE);
		btnNewButton_4.setBounds(227, 185, 89, 23);
		contentPane.add(btnNewButton_4);
		
		txtTaskinProgress = new JTextField();
		txtTaskinProgress.setForeground(new Color(0, 0, 205));
		txtTaskinProgress.setText("Task17//:In Progress");
		txtTaskinProgress.setBounds(239, 267, 144, 20);
		contentPane.add(txtTaskinProgress);
		txtTaskinProgress.setColumns(10);
		
		txtTaskpending = new JTextField();
		txtTaskpending.setForeground(new Color(0, 0, 255));
		txtTaskpending.setText("Task21//:Pending");
		txtTaskpending.setBounds(239, 298, 144, 20);
		contentPane.add(txtTaskpending);
		txtTaskpending.setColumns(10);
		
		txtTasknotAvailable = new JTextField();
		txtTasknotAvailable.setForeground(new Color(220, 20, 60));
		txtTasknotAvailable.setText("Task30//:Not Available");
		txtTasknotAvailable.setBounds(239, 329, 144, 22);
		contentPane.add(txtTasknotAvailable);
		txtTasknotAvailable.setColumns(10);
		
		txtTaskcompleted = new JTextField();
		txtTaskcompleted.setForeground(new Color(0, 128, 0));
		txtTaskcompleted.setText("Task11//:Completed");
		txtTaskcompleted.setBounds(316, 26, 113, 20);
		contentPane.add(txtTaskcompleted);
		txtTaskcompleted.setColumns(10);
		
		txtTaskcompleted_1 = new JTextField();
		txtTaskcompleted_1.setForeground(new Color(0, 128, 0));
		txtTaskcompleted_1.setText("Task12//:Completed");
		txtTaskcompleted_1.setBounds(316, 59, 113, 20);
		contentPane.add(txtTaskcompleted_1);
		txtTaskcompleted_1.setColumns(10);
		
		txtTbtdhrm = new JTextField();
		txtTbtdhrm.setForeground(new Color(0, 0, 139));
		txtTbtdhrm.setText("TBT/ 6d/11Hr/12m");
		txtTbtdhrm.setBounds(316, 92, 113, 20);
		contentPane.add(txtTbtdhrm);
		txtTbtdhrm.setColumns(10);
	}
}
