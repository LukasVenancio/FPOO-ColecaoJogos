package br.senai.sp.jandira.model;

public enum Console {
	
	XBOX("X-Box", "Microssoft", "2TB" ), 
	PLAYSTATION("Play Station", "Sony", "850GB"), 
	SWITCH("Nintendo Switch", "Nintendo", "32GB"), 
	WII("Nintendo WII", "Nintendo", "32GB"), 
	PC("Computador", "Pode possuir diversas marcas de seus componentes", "1TB");

	private String descricao;
	private String fabricante;
	private String armazenamento;
	
	private Console(String descricao, String fabricante, String armazenamento) {
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(String armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	
}
