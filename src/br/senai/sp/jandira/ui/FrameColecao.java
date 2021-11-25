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
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class FrameColecao extends JFrame {

	private JPanel contentPane;
	private JogoRepository colecao;
	public FrameAdicionarJogos adicionar;
	public Jogo jogo;
	public DefaultListModel<String> modelJogosAdicionados;
	public JList<String> lstJogos;

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

		this.lstJogos = new JList();
		this.modelJogosAdicionados = new DefaultListModel<String>();
		this.lstJogos.setModel(modelJogosAdicionados);

		scrollPane.setViewportView(lstJogos);

		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnAdicionar.setBounds(29, 60, 109, 34);
		contentPane.add(btnAdicionar);

		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnExcluir.setBounds(29, 126, 109, 34);
		contentPane.add(btnExcluir);

		JButton btnFabricantes = new JButton("Fabricantes");
		btnFabricantes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnFabricantes.setBounds(29, 195, 109, 34);
		contentPane.add(btnFabricantes);

		this.adicionar = new FrameAdicionarJogos(this);
		this.colecao = new JogoRepository();

		btnAdicionar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				adicionar.setVisible(true);
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

	public void gravarColecao(Jogo jogo) {
		this.jogo = jogo;
		System.out.println(jogo.getTiulo());
		System.out.println(jogo.getObservacoes());
		System.out.println(jogo.getValor());
		System.out.println(jogo.getConsole());
		colecao.gravar(jogo);

		
		this.modelJogosAdicionados.addElement(jogo.getTiulo());

	

	}

	public Jogo getJogo() {
		return jogo;
	}

//	public DefaultListModel<String> retornarModel() {
//		modelJogosAdicionados = new DefaultListModel<String>();
//		return modelJogosAdicionados;
//	}

}
