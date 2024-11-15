package Programas;

public class Computador{
	
		// variaves da classe computador:
	public String Marca;
	public String Processador;
	public double Memoria;
	public int Ram;
	
	public Computador(String marca, String processador, double memoria, int ram) {
		
		this.Marca = marca;
		this.Processador = processador;
		this.Memoria = memoria;
		this.Ram = ram;
	}
	
	public String getModelo() {
		return Marca;
	}

	public void setModelo(String marca) {
		Marca = marca;
	}

	public String getProcessador() {
		return Processador;
	}

	public void setProcessador(String processador) {
		Processador = processador;
	}

	public double getMemoria() {
		return Memoria;
	}

	public void setMemoria(double memoria) {
		Memoria = memoria;
	}

	public int getRam() {
		return Ram;
	}

	public void setRam(int ram) {
		Ram = ram;
	}
		
}