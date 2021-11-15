package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {
	
	private Jogo[] colecao;
	
	public JogoRepository(int tamanhoColecao) {
		colecao = new Jogo[tamanhoColecao];
	}
	
	public void gravar(int posicao, Jogo jogo) {
		colecao[posicao] = jogo;
	}
	
	public Jogo retornarJogo(int posicao) {
		return colecao[posicao];
	}
	
	public Jogo[] retornarTodos() {
		return colecao;
	}
	
	public int retornarTamanho() {
		return colecao.length;
	}

}
