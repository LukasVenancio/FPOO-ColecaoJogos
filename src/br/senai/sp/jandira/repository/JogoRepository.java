package br.senai.sp.jandira.repository;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Jogo;

public class JogoRepository {

	private ArrayList<Jogo> colecao;

	public JogoRepository() {
		colecao = new ArrayList<Jogo>();
	}

	public void gravar(Jogo jogo) {
		colecao.add(jogo);
	}

	public Jogo retornarJogo(int posicao) {
		return colecao.get(posicao);
	}

	public ArrayList<Jogo> retornarTodos() {
		return colecao;
	}

	public int retornarTamanho() {
		return colecao.size();
	}
	
	public void excluirJogo(int posicao) {
		colecao.remove(posicao);
	}

}
