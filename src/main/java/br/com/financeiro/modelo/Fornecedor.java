package br.com.financeiro.modelo;

public class Fornecedor extends Pessoa {

    private String cnpj;

    public Fornecedor(String nome, String cnpj) {
        this.setNome(nome);
        this.setTipo(TipoPessoa.JURIDICA);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}