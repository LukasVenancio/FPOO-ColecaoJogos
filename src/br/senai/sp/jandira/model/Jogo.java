package br.senai.sp.jandira.model;

public class Jogo {
	
	private String tiulo;
	private Fabricante fabricante;
	private boolean status;
	private Console console;
	private String valor;
	private String observacoes;
	
	public String getTiulo() {
		return tiulo;
	}
	public void setTiulo(String tiulo) {
		this.tiulo = tiulo;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Console getConsole() {
		return console;
	}
	public void setConsole(Console console) {
		this.console = console;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
}
