package Programas;

public class FuncaoAtividade1 {
	
	public static double somar(double a, double b) {
		
		double Soma = a + b;
		return Soma;
	}
	
	public static double subtrair(double a, double b) {
		
		double Subtrair = a - b;
		return Subtrair;
		
	}
	
	public static double multipicar(double a, double b) {
		
		double Multiplicar = a * b;
		return Multiplicar;
	}
	
	public static double dividir(double a, double b) {
		
		double Dividir = a / b;
		return Dividir;
		
	}
	
	public static double imc(double alt, double peso) {
		
		double Imc = peso / (alt * alt);
		return Imc;
		
	}
	
	public static double conversor1(double cecio) {
		
		double Kelvin =  cecio + 273.15;
		return Kelvin;
	}
	
	public static double conversor2(double cecio) {
		
		double Fahrenheit = (cecio * (9 / 5)) + 32;
		return Fahrenheit;
	}
	
	public FuncaoAtividade1() {
		
	}
	
}
