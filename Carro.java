package Programas;

public class Carro {
	
		// variaves da classe carro:
	public String Modelo;
	public String Marca;
	public String Cor;
	public int Ano;
	
	public Carro(String modelo, String marca, String cor, int ano) {
		
		this.Modelo = modelo;
		this.Marca = marca;
		this.Cor = cor;
		this.Ano = ano;
		
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public int getAno() {
		return Ano;
	}

	public void setAno(int ano) {
		Ano = ano;
	}

}
