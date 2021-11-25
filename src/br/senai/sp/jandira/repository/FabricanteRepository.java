package br.senai.sp.jandira.repository;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	private ArrayList<Fabricante> colecaoFabricante;

	public FabricanteRepository() {
		colecaoFabricante = new ArrayList<Fabricante>();
	}

	public void gravar(Fabricante fabricante) {
		colecaoFabricante.add(fabricante);
	}

	public Fabricante retornarFabricante(int posicao) {
		return colecaoFabricante.get(posicao);
	}

	public ArrayList<Fabricante> retornarTodos() {
		return colecaoFabricante;
	}
}
