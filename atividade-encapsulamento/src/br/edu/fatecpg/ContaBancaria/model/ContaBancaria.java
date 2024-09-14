package br.edu.fatecpg.ContaBancaria.model;

import java.util.Scanner;

public class ContaBancaria {
	
	Scanner entrada = new Scanner(System.in);
	
	private String Titular;
	private double Saldo;
	
	private double valor;
	
	public void depositar() {
		pegarValor();
		this.Saldo += this.valor;
		System.out.println("Depósito de R$ "+ this.valor +" realizado com sucesso!\nNovo Saldo: R$ "+this.Saldo);
	}
	
	public void sacar() {
		pegarValor();
		verificarQuantiaSaldo();
		this.Saldo -= this.valor;
		System.out.println("Saque de R$ "+ this.valor +" realizado com sucesso!\nNovo Saldo: R$ "+this.Saldo);
	}
	
	public void verificarQuantiaSaldo() {
		if(this.valor > this.Saldo) {
			while(true) {
				if(this.valor <= this.Saldo) {
					break;
				}
				System.out.println("Saldo Insuficiente para saque, retire menos: ");
				this.valor = entrada.nextDouble();
			}
		}
	}
	
	public void pegarValor() {
		System.out.print("Informe o valor: ");
		this.valor = entrada.nextDouble();
		while(this.valor <= 0) {
			System.out.println("O valor não pode ser igual nem inferior a 0!");
			System.out.print("Informe o valor: ");
			this.valor = entrada.nextDouble();
		}
	}
	
	// GETTERS AND SETTERs
	public String getTitular() {
		return Titular;
	}
	public void setTitular(String titular) {
		Titular = titular;
	}
	public double getSaldo() {
		return Saldo;
	}
	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
}
