package br.com.financeiro.modelo;

public abstract class Pessoa {
	
	private String nome;
	private TipoPessoa tipo;

	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoPessoa getTipo() { return tipo; }
	public void setTipo(TipoPessoa tipo) { this.tipo = tipo; }
}