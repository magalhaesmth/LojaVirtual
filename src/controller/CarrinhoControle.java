package controller;

import java.util.List;

import models.Carrinho;
import models.ItensCarrinho;
import models.Produto;

public class CarrinhoControle {
	
	private List<ItensCarrinho> carrinhoItens
	
	public void adicionarItem(Carrinho carrinho, Produto produto, Double valorUnitario, Double quantidade) {
		ItensCarrinho itens = new ItensCarrinho();
		itens.setProduto(produto);
		itens.setCarrinho(carrinho);
		itens.setQuantidade(quantidade);
		itens.setValorUnitario(valorUnitario);
		carrinhoItens.add(itens);
	}
	
	public void removerItem() {
		
	}
	
	@Override
	public String toString() {
		//Fazer descricao de cada produto
		//quantidade adicionada 
		//valor unitario
		//valor total
		return "";
	}
}
