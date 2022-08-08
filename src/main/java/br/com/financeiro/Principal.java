package br.com.financeiro;

import br.com.financeiro.modelo.*;

public class Principal {

	public static void main(String[] args) {
		// instanciando fornecedores
		Fornecedor imobiliaria = new Fornecedor("Imobiliaria CasaNossa","99.999.999/9999-99");
		Fornecedor mercado = new Fornecedor("Mercado Preco Bom", "88.888.888/8888-88");
		Fornecedor enel = new Fornecedor("Enel", "77.777.777/7777-77");
		
		// instanciando clientes
		Cliente fernando = new Cliente("Fernando Carvalho","11111111-1");
		Cliente thais = new Cliente("Thais Silva", "22222222-2");
		Cliente maria = new Cliente("Maria dos Santos", "33333333-3");
		
		// instanciando contas a pagar aluguel
		ContaPagar aluguel = new ContaPagar();
		aluguel.setFornecedor(imobiliaria);
		aluguel.setDescricao("Aluguel do estabelecimento");
		aluguel.setValor(1230d);
		aluguel.setDataVencimento("08/08/2022");
		//Pagando o aluguel
		aluguel.pagar();

		// instanciando contas a pagar compras do mês
		ContaPagar compras = new ContaPagar(mercado, "Compras do mês", 690d, "05/08/2022");
		//Cancelando as compras
		compras.cancelar();
		//Tentando cancelar novamente as compras - ERRO
		compras.cancelar();

		// instanciando conta de luz
		ContaPagar luz = new ContaPagar(enel, "Conta de Luz", 390d, "30/08/2022" );
		
		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setCliente(fernando);
		contaReceber1.setDescricao("Bolo de Chocolate");
		contaReceber1.setValor(50d);
		contaReceber1.setDataVencimento("03/08/2022");
		//Recebendo contaReceber1
		contaReceber1.receber();

		ContaReceber contaReceber2 = new ContaReceber(thais, "Bolo de Cenoura", 40d, "04/08/2022");
		//Cancelando contaReceber2
		contaReceber2.cancelar();

		ContaReceber contaReceber3 = new ContaReceber(thais, "Bolo de Fubá", 30d, "05/08/2022");
		
		// exibe listagem de todas as contas com detalhamento
		RelatorioContas relatorio = new RelatorioContas();
		Conta[] contas = new Conta[]{aluguel, compras, luz, contaReceber1, contaReceber2, contaReceber3};
		
		relatorio.exibirListagem(contas);
	}
}