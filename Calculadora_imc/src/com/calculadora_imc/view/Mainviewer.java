package com.calculadora_imc.view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.calculadora_imc.control.ImcController;

public class Mainviewer {

	private JFrame appFrame;
	private JTextField PesotextField;
	private JLabel lblNewLabel_2;
	private JTextField AlturatextField;
	private JTextPane ResultadoPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainviewer window = new Mainviewer();
					window.appFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mainviewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appFrame = new JFrame();
		appFrame.setForeground(Color.DARK_GRAY);
		appFrame.getContentPane().setBackground(Color.GRAY);
		appFrame.setBackground(Color.WHITE);
		appFrame.setAlwaysOnTop(true);
		appFrame.setTitle("Calculadora IMC");
		appFrame.setBounds(100, 100, 300, 400);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora IMC");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(28, 11, 227, 30);
		appFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(42, 53, 63, 14);
		appFrame.getContentPane().add(lblNewLabel_1);
		
		PesotextField = new JTextField();
		PesotextField.setForeground(Color.DARK_GRAY);
		PesotextField.setText("0.0");
		PesotextField.setHorizontalAlignment(SwingConstants.CENTER);
		PesotextField.setBounds(128, 52, 130, 20);
		appFrame.getContentPane().add(PesotextField);
		PesotextField.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Altura");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(42, 94, 63, 14);
		appFrame.getContentPane().add(lblNewLabel_2);
		
		AlturatextField = new JTextField();
		AlturatextField.setForeground(Color.DARK_GRAY);
		AlturatextField.setText("0.0");
		AlturatextField.setHorizontalAlignment(SwingConstants.CENTER);
		AlturatextField.setColumns(10);
		AlturatextField.setBounds(128, 93, 130, 20);
		appFrame.getContentPane().add(AlturatextField);
		
		JButton CalcularNewButton = new JButton("calcular");
		CalcularNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		CalcularNewButton.setBounds(28, 124, 227, 40);
		CalcularNewButton.addActionListener(new ImcController(this));
		appFrame.getContentPane().add(CalcularNewButton);
		
		ResultadoPane = new JTextPane();
		ResultadoPane.setFont(new Font("Tahoma", Font.BOLD, 10));
		ResultadoPane.setForeground(Color.DARK_GRAY);
		ResultadoPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		ResultadoPane.setToolTipText("\r\n");
		ResultadoPane.setText("Resultado");
		ResultadoPane.setBounds(10, 185, 264, 118);
		appFrame.getContentPane().add(ResultadoPane);
	}

	public JFrame getAppFrame() {
		return appFrame;
	}

	public void setAppFrame(JFrame appFrame) {
		this.appFrame = appFrame;
	}

	public JTextField getPesotextField() {
		return PesotextField;
	}

	public void setPesotextField(JTextField pesotextField) {
		PesotextField = pesotextField;
	}

	public JLabel getLblNewLabel_2() {
		return lblNewLabel_2;
	}

	public void setLblNewLabel_2(JLabel lblNewLabel_2) {
		this.lblNewLabel_2 = lblNewLabel_2;
	}

	public JTextField getAlturatextField() {
		return AlturatextField;
	}

	public void setAlturatextField(JTextField alturatextField) {
		AlturatextField = alturatextField;
	}

	public JTextPane getResultadoPane() {
		return ResultadoPane;
	}

	public void setResultadoPane(JTextPane resultadoPane) {
		ResultadoPane = resultadoPane;
	}
}
