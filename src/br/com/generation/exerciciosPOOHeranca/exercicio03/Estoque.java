package br.com.generation.exerciciosPOOHeranca.exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

	private List<Produto> produtos = new ArrayList<>();
	
	public void armazenarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void removerProduto(Produto produto) {
		produtos.remove(produto);
	}
	
	public void atualizarProduto(int indice, Produto produto) {
		
				produtos.add( indice-1, produto);
		
	}
	
	public void apresentarProdutos() {
		for (Produto produto : produtos) {
			System.out.println("Id: " + produto.getId());
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Categoria: " + produto.getCategoria());
			System.out.println("Quantidade: " + produto.getQuantidade());
		}
	}
}
