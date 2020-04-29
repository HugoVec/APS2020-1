package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class CadastrarAluno extends JFrame {

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
					CadastrarAluno frame = new CadastrarAluno();
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
	public CadastrarAluno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(160, 398, 116, 30);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("NOME: ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(36, 27, 58, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblRa = new JLabel("RA: ");
		lblRa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRa.setBounds(36, 81, 58, 30);
		contentPane.add(lblRa);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCpf.setBounds(36, 140, 58, 30);
		contentPane.add(lblCpf);
		
		JLabel lblCurso = new JLabel("CURSO:");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCurso.setBounds(36, 213, 82, 30);
		contentPane.add(lblCurso);
		
		JLabel lblNewLabel_4 = new JLabel("NOME: ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_4.setBounds(36, 284, 58, 30);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(104, 35, 234, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(104, 89, 234, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(104, 148, 234, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(104, 221, 234, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(104, 292, 234, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
	}
}
