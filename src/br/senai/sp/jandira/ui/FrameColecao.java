package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.JogoRepository;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FrameColecao extends FrameAdicionarJogos {

	private JPanel contentPane;
	private JTextField txtTamanhoColecao;
	//private JogoRepository colecao;
	public FrameAdicionarJogos adicionar;
	public Jogo jogo;
	public int posicao;

	public FrameColecao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 385, 351);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblMeusJogos = new JLabel("Meus jogos:");
		lblMeusJogos.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblMeusJogos.setBounds(186, 11, 109, 19);
		contentPane.add(lblMeusJogos);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(186, 36, 173, 250);
		contentPane.add(scrollPane);

		JList lstJogos = new JList();
		scrollPane.setViewportView(lstJogos);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdicionar.setBounds(10, 81, 109, 34);
		contentPane.add(btnAdicionar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(10, 143, 109, 34);
		contentPane.add(btnExcluir);

		JButton btnFabricantes = new JButton("Fabricantes");
		btnFabricantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFabricantes.setBounds(10, 205, 109, 34);
		contentPane.add(btnFabricantes);

		JLabel lblTamanhoDaColecao = new JLabel("Tamanho da cole\u00E7\u00E3o:");
		lblTamanhoDaColecao.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTamanhoDaColecao.setBounds(10, 11, 155, 19);
		contentPane.add(lblTamanhoDaColecao);

		txtTamanhoColecao = new JTextField();
		txtTamanhoColecao.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtTamanhoColecao.setBounds(9, 36, 143, 34);
		contentPane.add(txtTamanhoColecao);
		txtTamanhoColecao.setColumns(10);

		this.adicionar = new FrameAdicionarJogos();
		
		btnAdicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String tamanhoColecao = txtTamanhoColecao.getText();
				int tamanhoColecaoInt = Integer.parseInt(tamanhoColecao);
				
				if (txtTamanhoColecao.equals(null)) {
					JOptionPane.showMessageDialog(null, "Informe o tamanho da sua coleção!");
				} else {
					adicionar.setVisible(true);
					//System.out.println(colecao.retornarTamanho());
					posicao++;
				}
				colecao = new JogoRepository(tamanhoColecaoInt);
			}
		});

		btnFabricantes.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				FrameListaFabricantes listaFabricantes = new FrameListaFabricantes();
				listaFabricantes.setVisible(true);
			}
		});

	}

//	public JogoRepository getColecao() {
//		return colecao;
//	}
//
//	public void setColecao(JogoRepository colecao) {
//		this.colecao = colecao;
//	}
	
	public void gravarColecao(Jogo jogo, int posicao) {
		this.jogo = jogo;
		System.out.println(jogo.getTiulo());
		colecao.gravar(posicao, jogo);
	}

	public Jogo getJogo() {
		return jogo;
	}

//	public void setJogo(Jogo jogo) {
//		this.jogo = jogo;
//		System.out.println(jogo.getTiulo());
//	}
}
