package br.com.financeiro.modelo;

public class Cliente extends Pessoa {

    private String cpf;

    public Cliente(String nome, String cpf) {
        this.setNome(nome);
        this.setTipo(TipoPessoa.FISICA);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
	
}