package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class CadastrarCurso extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarCurso frame = new CadastrarCurso();
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
	public CadastrarCurso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 325);
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(150, 47, 174, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(31, 40, 63, 28);
		getContentPane().add(lblNewLabel);
		
		JLabel lblMensalidade = new JLabel("Mensalidade:");
		lblMensalidade.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblMensalidade.setBounds(31, 88, 109, 28);
		getContentPane().add(lblMensalidade);
		
		JLabel lblDurao = new JLabel("Dura\u00E7\u00E3o:");
		lblDurao.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblDurao.setBounds(41, 137, 81, 28);
		getContentPane().add(lblDurao);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(150, 95, 174, 20);
		getContentPane().add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(150, 143, 81, 22);
		getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Cadastrar");
		btnNewButton.setBounds(116, 204, 119, 35);
		getContentPane().add(btnNewButton);
	}
}
