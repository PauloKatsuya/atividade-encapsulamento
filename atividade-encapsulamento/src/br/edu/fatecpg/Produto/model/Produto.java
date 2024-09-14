package br.edu.fatecpg.Produto.model;

import java.util.Scanner;

public class Produto {
	
	Scanner entrada = new Scanner(System.in);
	
	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public double verificarValor(double valor) {
		if(valor<=0) {
			while(true) {
				if(valor>0) {
					break;
				}else {
					System.out.print("O preço não pode ser igual a zero, muitos menos menor: ");
					valor = entrada.nextDouble();
				}
			}
		}
		
		return valor;
	}
	
	public int verificarQuantidadeEstoque(int quantidade) {
		if(quantidade < 0) {
			while(true) {
				if(quantidade>=0) {
					break;
				}else {
					System.out.print("A quantidade não pode ser inferior a 0: ");
					quantidade = entrada.nextInt();
				}
			}
		}
		
		return quantidade;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return this.preco;
	}
	public void setPreco(double preco) {
		this.preco = verificarValor(preco);
	}
	public int getQuantidadeEstoque() {
		return this.quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = verificarQuantidadeEstoque(quantidadeEstoque);
	}
}
