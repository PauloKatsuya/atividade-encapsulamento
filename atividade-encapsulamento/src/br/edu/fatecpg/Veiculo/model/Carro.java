package br.edu.fatecpg.veiculo.model;

public class Carro {
	private String chassi;
	private String marca;
	private String modelo;
	private String placa;
	private double motor;
	private double capacidadeTanque;
	
	public boolean ligado = false;
	
	public Carro(String chassi, String marca, String modelo, double motor) {
		this.chassi = chassi;
		this.marca = marca;
		this.modelo = modelo;
		this.motor = motor;
	}
	
	public void abastecer(double precoLitroCombustivel, double quantidadeArmazenada) {
		System.out.println("Preço do Combustível: "+precoLitroCombustivel+"\nQuanttidade no tanque: "+
				quantidadeArmazenada + " litros\n"+"Total a gastar para encher o tanque: R$"+
				(this.capacidadeTanque - quantidadeArmazenada) * precoLitroCombustivel);
	}
	
	public void ligar() {
		System.out.println("Ligou");
		this.ligado = true;
	}
	
	public void desligar() {
		System.out.println("desligou");
		this.ligado = false;
	}
	
	public void andar() {
		if(this.ligado == true) {
			System.out.println("Andando");
		}else {
			System.out.println("Ligue o carro!");
		}
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void setMotor(double motor) {
		this.motor = motor;
	}
	
	public void setCapacidadeTanque(double capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public String getChassi() {
		return this.chassi;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getMarca() {
		return this.marca;
	}
	
	public String getPlaca() {
		return this.placa;
	}
	
	public double getMotor() {
		return this.motor;
	}
	
	public double getCapacidadeTanque() {
		return this.capacidadeTanque;
	}
}
