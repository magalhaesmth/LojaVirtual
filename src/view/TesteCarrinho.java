package view;

import controller.CarrinhoControle;
import models.Carrinho;
import models.Cliente;
import models.Produto;

public class TesteCarrinho {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setCpf("08493827194");
		cliente.setNome("Matheus");
		
		Produto produto1 = new Produto();
		produto1.setDescricao("Mochila");
		produto1.setEstoque(9.);
		produto1.setValorVenda(99.);
		
		Produto produto2 = new Produto();
		produto2.setDescricao("Estojo");
		produto2.setEstoque(0.);
		produto2.setValorVenda(59.);
		
		Carrinho carrinho = new Carrinho();
		carrinho.setCliente(cliente);
		
		CarrinhoControle carrinhoControle = new CarrinhoControle();
		carrinhoControle.adicionarItem(carrinho, produto1, 30., 2.);
		carrinhoControle.adicionarItem(carrinho, produto2, 19., 3.);
		System.out.println(carrinhoControle);

	}

}
