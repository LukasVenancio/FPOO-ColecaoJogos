package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.JogoRepository;

public class FrameAdicionarJogos extends JFrame{

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtObervacoes;
	private Jogo jogo;
	private int posicao;
	public FrameColecao colecao;

	public FrameAdicionarJogos() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 658, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNovoJogo = new JLabel("Novo jogo:");
		lblNovoJogo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNovoJogo.setBounds(10, 11, 95, 27);
		contentPane.add(lblNovoJogo);
		
		JLabel lblTtulo = new JLabel("T\u00EDtulo:");
		lblTtulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTtulo.setBounds(10, 49, 53, 27);
		contentPane.add(lblTtulo);
		
		txtTitulo = new JTextField();
		txtTitulo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtTitulo.setBounds(55, 49, 204, 27);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblFabricante.setBounds(269, 49, 77, 27);
		contentPane.add(lblFabricante);
		
		JButton btnAdicionarFabricante = new JButton("Adicionar fabricante");
		btnAdicionarFabricante.setBounds(480, 49, 129, 27);
		contentPane.add(btnAdicionarFabricante);
		
		JComboBox comboFabricante = new JComboBox();
		comboFabricante.setBounds(342, 51, 114, 26);
		contentPane.add(comboFabricante);
		
		JLabel lblConsole = new JLabel("Console:");
		lblConsole.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblConsole.setBounds(10, 112, 60, 27);
		contentPane.add(lblConsole);
		
		JComboBox comboConsole = new JComboBox();
		comboConsole.setModel(new DefaultComboBoxModel(Console.values()));
		comboConsole.setBounds(67, 114, 129, 26);
		contentPane.add(comboConsole);
		
		JLabel lblValor = new JLabel("Valor:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblValor.setBounds(220, 112, 60, 27);
		contentPane.add(lblValor);
		
		txtValor = new JTextField();
		txtValor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtValor.setColumns(10);
		txtValor.setBounds(269, 112, 105, 27);
		contentPane.add(txtValor);
		
		JCheckBox chckbxStatus = new JCheckBox("J\u00E1 foi zerado?");
		chckbxStatus.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxStatus.setBounds(413, 114, 129, 23);
		contentPane.add(chckbxStatus);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblObservacoes.setBounds(10, 164, 105, 27);
		contentPane.add(lblObservacoes);
		
		txtObervacoes = new JTextField();
		txtObervacoes.setFont(new Font("Tahoma", Font.ITALIC, 15));
		txtObervacoes.setColumns(10);
		txtObervacoes.setBounds(20, 187, 532, 139);
		contentPane.add(txtObervacoes);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancelar.setBounds(128, 350, 162, 41);
		contentPane.add(btnCancelar);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnSalvar.setBounds(342, 350, 162, 41);
		contentPane.add(btnSalvar);
		
		this.jogo = new Jogo();
		this.colecao = null;
		
		
		btnSalvar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				jogo.setTiulo(txtTitulo.getText());
				jogo.setStatus(chckbxStatus.isSelected());
				jogo.setConsole(determinarConsole(comboConsole.getSelectedIndex()));
				jogo.setValor(txtValor.getText());
				jogo.setObservacoes(txtObervacoes.getText());
				posicao++;
				contentPane.setVisible(false);
				colecao = new FrameColecao();
				colecao.gravarColecao(jogo);
				
			}
		});
		
		btnAdicionarFabricante.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FrameAdicionarFabricante adicionarFabricante = new FrameAdicionarFabricante();
				adicionarFabricante.setVisible(true);
				
			}
		});
		
	}
	private Console determinarConsole(int consoleSelecionado) {

		if (consoleSelecionado == 0) {
			return Console.XBOX;
		} else if (consoleSelecionado == 1) {
			return Console.PLAYSTATION;
		} else if (consoleSelecionado == 2) {
			return Console.SWITCH;
		} else if (consoleSelecionado == 2) {
			return Console.WII;	
		}else {
			return Console.PC;
		}
	}
	
	public Jogo retornarJogo() {
		return jogo;
	}
	public int retornarPosicai() {
		return posicao;
	}
	
//	public void testar(JogoRepository colecao) {
//		JogoRepository teste = colecao.getColecao();
//		System.out.println(teste.retornarTamanho());
//		
//	}
}
