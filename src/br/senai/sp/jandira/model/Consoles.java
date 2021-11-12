package br.senai.sp.jandira.model;

public enum Consoles {
	
	XBOX("X-Box", "Microssoft", "250gb", "Primeira Geração" ), PLAYSTATION, SWITCH, WII, PC;

	private String descricao;
	private String Fabricante;
	private String armazenamento;
	private String geracao;
	
	private Consoles(String descricao, String fabricante, String armazenamento, String geracao) {
		
	}
}
