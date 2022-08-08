package br.com.financeiro;

import br.com.financeiro.modelo.Conta;

public class RelatorioContas {
	
	public void exibirListagem(Conta[] contas) {
		System.out.println("\n*************************************");
		System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");
		System.out.println("*************************************");

		for (int i = 0; i < contas.length; i++) {
			contas[i].exibirDetalhes();
		}
		
		System.out.println("*************************************");
	}
	
}