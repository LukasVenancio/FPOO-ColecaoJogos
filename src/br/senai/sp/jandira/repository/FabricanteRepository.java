package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {
	
	private Fabricante[] colecaoFabricante;
	
	public FabricanteRepository(int tamanho) {
		colecaoFabricante = new Fabricante[tamanho];
	}
	
	public void gravar(int posicao, Fabricante fabricante) {
		colecaoFabricante[posicao] = fabricante; 
	}
	
	public Fabricante retornarFabricante(int posicao) {
		return colecaoFabricante[posicao];
	}
	
	public Fabricante[] retornarTodos() {
		return colecaoFabricante;
	}
	
	
	
		
}
