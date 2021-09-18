package br.com.generation.exerciciosPOOHeranca.exercicio03;

public class TestaEstoque {

	public static void main(String[] args) {
		
		Produto produto1Obj = new Produto(1, "Lápis", 422, "Papelaria");
		Produto produto2Obj = new Produto(2, "Caderno", 780, "Papelaria");
		Produto produto3Obj = new Produto(3, "Caneta", 301, "Papelaria");
		
		
		Estoque papelaria = new Estoque();
		System.out.println("Incluindo produto no estoque: ");
		papelaria.armazenarProduto(produto1Obj);
		papelaria.armazenarProduto(produto2Obj);
		papelaria.armazenarProduto(produto3Obj);
		
		papelaria.apresentarProdutos();
		
		System.out.println("\nRemovendo produto 3 do estoque: ");
		papelaria.removerProduto(produto3Obj);
		papelaria.apresentarProdutos();
		
		System.out.println("\nAlterando produto do estoque: ");
		Produto produto4Obj = new Produto(2, "Borracha", 250, "Papelaria");
		papelaria.atualizarProduto(2, produto4Obj);
		papelaria.apresentarProdutos();
		
	}

}
