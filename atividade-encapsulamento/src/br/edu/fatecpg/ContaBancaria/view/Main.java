package br.edu.fatecpg.ContaBancaria.view;

import br.edu.fatecpg.ContaBancaria.model.ContaBancaria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int opcao;
		ContaBancaria contaUsuario = new ContaBancaria();
		contaUsuario.setTitular("Paulo Katsuya");
		contaUsuario.setSaldo(210766.86);
		
		while(true) {
			System.out.println("\nSaldo Atual: R$ "+contaUsuario.getSaldo());
			System.out.println("\n1 - Depositar\n2 - Sacar\n0 - Sair\n");
			System.out.print("O que deseja fazer: ");
			opcao = entrada.nextInt();
			if(opcao == 0) {
				System.out.println("Tchau :)");
				break;
			}else if(opcao == 1) {
				contaUsuario.depositar();
			}else if(opcao == 2) {
				contaUsuario.sacar();
			}else {
				System.out.print("\nNão entendi :( tente de novo");
				opcao = entrada.nextInt();
			}
		}
		
		entrada.close();
	}

}
