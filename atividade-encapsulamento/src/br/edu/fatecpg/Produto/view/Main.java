package br.edu.fatecpg.Produto.view;

import br.edu.fatecpg.Produto.model.Produto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double preco;
		int quantidade;
		
		Produto cocaCola = new Produto();
		
		System.out.print("Preço do produto: ");
		preco = entrada.nextDouble();
		
		System.out.print("Quantidade em estoque: ");
		quantidade = entrada.nextInt();
		
		cocaCola.setNome("Coca-Cola");
		cocaCola.setPreco(preco);
		cocaCola.setQuantidadeEstoque(quantidade);	
		
		System.out.println("Preço do Produto: "+cocaCola.getPreco());
		System.out.println("Estoque do Produto: "+cocaCola.getQuantidadeEstoque());
		
		entrada.close();
	}

}
