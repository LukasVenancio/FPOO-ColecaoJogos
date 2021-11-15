package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class FrameAdicionarFabricante extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtDataFundacao;
	private JTextField txtGeneroPrincipal;

	public FrameAdicionarFabricante() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 522, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNome.setBounds(10, 11, 52, 14);
		contentPane.add(lblNome);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtNome.setBounds(60, 3, 136, 31);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblFundadoaEm = new JLabel("Fundado(a) em:");
		lblFundadoaEm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFundadoaEm.setBounds(216, 13, 124, 14);
		contentPane.add(lblFundadoaEm);
		
		txtDataFundacao = new JTextField();
		txtDataFundacao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtDataFundacao.setColumns(10);
		txtDataFundacao.setBounds(336, 3, 136, 31);
		contentPane.add(txtDataFundacao);
		
		JLabel lblGeneroPrincipal = new JLabel("G\u00EAnero principal:");
		lblGeneroPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblGeneroPrincipal.setBounds(10, 75, 124, 14);
		contentPane.add(lblGeneroPrincipal);
		
		txtGeneroPrincipal = new JTextField();
		txtGeneroPrincipal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtGeneroPrincipal.setColumns(10);
		txtGeneroPrincipal.setBounds(125, 67, 136, 31);
		contentPane.add(txtGeneroPrincipal);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(308, 64, 124, 41);
		contentPane.add(btnNewButton);
	}
}
