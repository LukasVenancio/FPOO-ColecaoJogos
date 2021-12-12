package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FrameListaFabricantes extends JFrame {

	private JPanel contentPane;
	public FrameAdicionarFabricante frameAdicionarFabricantes;

	public FrameListaFabricantes() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 305, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 29, 133, 199);
		contentPane.add(scrollPane);
		
		JList lstFabricantes = new JList();
		scrollPane.setViewportView(lstFabricantes);
		
		JLabel lblFabricantesAdicionados = new JLabel("Fabricantes adicionados:");
		lblFabricantesAdicionados.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFabricantesAdicionados.setBounds(10, 0, 175, 25);
		contentPane.add(lblFabricantesAdicionados);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdicionar.setBounds(165, 29, 107, 35);
		contentPane.add(btnAdicionar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(165, 95, 107, 35);
		contentPane.add(btnExcluir);
		
		JButton btnVerMais = new JButton("Ver mais");
		btnVerMais.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnVerMais.setBounds(165, 162, 107, 35);
		contentPane.add(btnVerMais);
		
		frameAdicionarFabricantes = new FrameAdicionarFabricante(this);
		
		btnAdicionar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frameAdicionarFabricantes.setVisible(true);
				
			}
		});
	}
}
