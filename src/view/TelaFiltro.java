package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;

public class TelaFiltro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFiltro frame = new TelaFiltro();
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
	public TelaFiltro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 455, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(10, 230, 419, 201);
		contentPane.add(list);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(38, 98, 63, 28);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblCurso = new JLabel("Curso:");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblCurso.setBounds(38, 137, 63, 28);
		contentPane.add(lblCurso);
		
		JLabel lblRa = new JLabel("RA:");
		lblRa.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRa.setBounds(38, 59, 63, 28);
		contentPane.add(lblRa);
		
		JLabel lblSemestre = new JLabel("Semestre:");
		lblSemestre.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSemestre.setBounds(38, 176, 91, 28);
		contentPane.add(lblSemestre);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(123, 182, 45, 22);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setBounds(123, 59, 147, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(122, 105, 147, 20);
		contentPane.add(textField_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(123, 143, 141, 22);
		contentPane.add(comboBox_1);
		
		JLabel lblFiltro = new JLabel("FILTRO");
		lblFiltro.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblFiltro.setBounds(133, 0, 63, 28);
		contentPane.add(lblFiltro);
	}
}
