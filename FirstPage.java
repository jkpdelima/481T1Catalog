import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JCheckBox;


public class FirstPage extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblLaysBbq;
	private JLabel label;
	private JLabel label_1;
	private JCheckBox chckbxAdd;
	private JCheckBox checkBox;
	private JCheckBox checkBox_1;
	private JButton btnFind;
	private JLabel generatedText;
	private String finderText = "";
	private JLabel lblLabelpringles;
	private JLabel lblLabelkettlecooked;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstPage frame = new FirstPage();
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
	public FirstPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 334, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 215, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton Search = new JButton("Search");
		Search.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Search_mouseClicked(e);
			}
		});
		
		Search.setBounds(225, 11, 83, 27);
		contentPane.add(Search);
		
		lblLaysBbq = new JLabel("Lay's - BBQ");
		lblLaysBbq.setBounds(20, 49, 205, 67);
		contentPane.add(lblLaysBbq);
		lblLaysBbq.setVisible(false);
		
		
		label = new JLabel("Pringles - Original");
		label.setBounds(20, 127, 205, 67);
		contentPane.add(label);
		label.setVisible(false);
		
		label_1 = new JLabel("Kettle Cooked - Jalapeno");
		label_1.setBounds(20, 205, 205, 67);
		contentPane.add(label_1);
		label_1.setVisible(false);
		
		chckbxAdd = new JCheckBox("select");
		chckbxAdd.setBounds(225, 71, 97, 23);
		contentPane.add(chckbxAdd);
		chckbxAdd.setVisible(false);
		
		checkBox = new JCheckBox("select");
		checkBox.setBounds(225, 149, 97, 23);
		contentPane.add(checkBox);
		checkBox.setVisible(false);
		
		checkBox_1 = new JCheckBox("select");
		checkBox_1.setBounds(225, 227, 97, 23);
		contentPane.add(checkBox_1);
		checkBox_1.setVisible(false);
		
		btnFind = new JButton("Find");
		btnFind.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnFind_mouseClicked(e);
			}
		});
		btnFind.setBounds(123, 389, 89, 23);
		contentPane.add(btnFind);
		
		generatedText = new JLabel("Lay's - BBQ: Aisle 4, Section 2");
		
		generatedText.setBounds(20, 41, 194, 82);
		contentPane.add(generatedText);
		
		lblLabelpringles = new JLabel("Pringles - Original: Aisle 4, Section 3");
		lblLabelpringles.setBounds(20, 147, 268, 27);
		contentPane.add(lblLabelpringles);
		
		lblLabelkettlecooked = new JLabel("Kettle Cooked - Jalapeno: Aisle 4, Section 4");
		lblLabelkettlecooked.setBounds(20, 225, 268, 27);
		contentPane.add(lblLabelkettlecooked);
		
		lblLabelpringles.setVisible(false);
		lblLabelkettlecooked.setVisible(false);
		generatedText.setVisible(false);
		btnFind.setVisible(false);
	}
	protected void Search_mouseClicked(MouseEvent e) {
		String value = this.textField.getText();
		if (value.equals("chips")){
			System.out.println(value);
			label.setVisible(true);
			lblLaysBbq.setVisible(true);
			label_1.setVisible(true);
			chckbxAdd.setVisible(true);
			checkBox.setVisible(true);
			checkBox_1.setVisible(true);
			btnFind.setVisible(true);
			
		}else{
			System.out.println("asdf");
		}
	}
	protected void btnFind_mouseClicked(MouseEvent e) {
		label.setVisible(false);
		lblLaysBbq.setVisible(false);
		label_1.setVisible(false);
		chckbxAdd.setVisible(false);
		checkBox.setVisible(false);
		checkBox_1.setVisible(false);
		btnFind.setVisible(false);
		if (chckbxAdd.isSelected()){
			generatedText.setVisible(true);
		}
		if (checkBox.isSelected()){
			lblLabelpringles.setVisible(true);
		}
		
		if (checkBox_1.isSelected()){
			lblLabelkettlecooked.setVisible(true);
		}
	}
}
