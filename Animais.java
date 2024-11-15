package Programas;

public class Animais {
	
	public String Raça;
	public String Cor;
	public String Tipo;
	public double Peso;
	
	public Animais(String raça, String cor, String tipo, double peso) {
		this.Raça = raça;
		this.Cor = cor;
		this.Tipo = tipo;
		this.Peso = peso;
	}

	public String getRaça() {
		return Raça;
	}

	public void setRaça(String raça) {
		Raça = raça;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}
	
}
