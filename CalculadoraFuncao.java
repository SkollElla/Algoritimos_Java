package Programas;
import java.util.Scanner;

public class CalculadoraFuncao {
	
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
	
	
	public static void main(String...args) {
		
		Scanner sc = new Scanner(System.in);
		
		int op;
		double x, y;
		
		System.out.println("|| Bem Vindo a Calculadora ||");
		
		do {
			
			System.out.println("Escolha a opção que deseja realizar:");
			System.out.println("1) Somar.");
			System.out.println("2) Subtrair.");
			System.out.println("3) Multiplicar.");
			System.out.println("4) Dividir.");
			System.out.println("0) Sair");
			op = sc.nextInt();
			
			switch(op){
			
			case 1:
				
				System.out.println("Entre com o primnerio numero");
				x = sc.nextDouble();
				
				System.out.println("Entre com o segundo numero");
				y = sc.nextDouble();
				
				double resSomar =  somar(x, y);
				System.out.println("O resultado da soma é: " + resSomar+ "\n");
				
			break;
			case 2:
			
				System.out.println("Entre com o primnerio numero");
				x = sc.nextDouble();
				
				System.out.println("Entre com o segundo numero");
				y = sc.nextDouble();
				
				double resSubtrair =  subtrair(x, y);
				System.out.println("O resultado da subtração é: " + resSubtrair+ "\n");
				
			break;
			case 3:
				
				System.out.println("Entre com o primnerio numero");
				x = sc.nextDouble();
				
				System.out.println("Entre com o segundo numero");
				y = sc.nextDouble();
				
				double resMultiplicar =  multipicar(x, y);
				System.out.println("O resultado da mutiplicação é: " + resMultiplicar+ "\n");
				
			break;
			case 4:
				
				System.out.println("Entre com o primnerio numero");
				x = sc.nextDouble();
				
				System.out.println("Entre com o segundo numero");
				y = sc.nextDouble();
				
				double resDividir =  dividir(x, y);
				System.out.println("O resultado da divisão é: " + resDividir + "\n");
				
			break;
			}
			
		}while(op != 0);
				
	}

}