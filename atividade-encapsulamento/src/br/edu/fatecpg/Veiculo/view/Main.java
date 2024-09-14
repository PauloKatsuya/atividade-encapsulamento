package br.edu.fatecpg.veiculo.view;

import br.edu.fatecpg.veiculo.model.Carro;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double quantidadeNoTanque;
		double precoCombustivel;
		
		Carro ferrariSpyder = new Carro("retsyh", "Ferrari", "Spyder", 3.8);
		ferrariSpyder.andar();
		ferrariSpyder.ligar();
		ferrariSpyder.andar();
		ferrariSpyder.desligar();
		ferrariSpyder.andar();
		
		Carro CarroDoPaulo = new Carro("retsyh", "Ferrari", "Spyder", 3.8);
		CarroDoPaulo.setChassi("hsrhtr");
		CarroDoPaulo.setMarca("Fiat");
		CarroDoPaulo.setModelo("Uno");
		CarroDoPaulo.setPlaca("adw-6893");
		CarroDoPaulo.setMotor(1.8);
		CarroDoPaulo.setCapacidadeTanque(50);
		
		System.out.println(CarroDoPaulo.getPlaca());
		
		System.out.print("Informe a quantidade já armazenada no tanque do Carro: ");
		quantidadeNoTanque = entrada.nextDouble();
		
		System.out.print("Preço COmbustível: ");
		precoCombustivel = entrada.nextDouble();
		
		entrada.close();
		
		CarroDoPaulo.abastecer(precoCombustivel, quantidadeNoTanque);
	}
}
