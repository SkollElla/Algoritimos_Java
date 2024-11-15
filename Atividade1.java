package Programas;

import java.util.Scanner;

public class Atividade1 {
	
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
	
		double al;
		double peso;
		double cecio;
		double cons = 273.15;
		double cons2 = 9/5;
		
		Scanner sc = new Scanner(System.in);
		int op = 0;
		int op2 = 0;
		System.out.println("|| Bem Vindo a Multipla Calculadora ||");
		
		
		do {
			
			System.out.println("Escolha a opção que deseja realizar:");
			System.out.println("1) Calculadora de IMC.");
			System.out.println("2) Conversor de Celcios para Kenvin.");
			System.out.println("2) Conversor de Celcios para Fahrenheit.");
			System.out.println("4) Calculadora.");
			System.out.println("0) Sair.");
			op = sc.nextInt();
			
			switch(op){
			
			
				case 1:
					
					System.out.println("Iremos calcular o IMC, Primeiro digite o seu peso!");
					peso = sc.nextDouble();
					System.out.println("Agora digite sua altura em metros!");
					al = sc.nextDouble();
					double imc = peso / (al * al);
					System.out.println("Seu IMC é :" + imc + "\n");
					
				break;
				case 2:
					
					System.out.println("Iremos converter Cecios para kelvin, digite quantos graus Cecios quer convverter!");
					cecio = sc.nextDouble();
					double kelvin = cecio + cons;
					System.out.println("Convertendo para Kelvin fica :" + kelvin + "\n");
					
				break;
				case 3:
					System.out.println("Iremos converter Cecios para Fahrenheit, digite quantos graus Cecios quer convverter!");
					cecio = sc.nextDouble();
					double fahrenheit = (cecio * cons2) + 32;
					System.out.println("A conversao para Fahrenheit deu :" + fahrenheit + "\n");
					
				break;
				case 4:
					do {
						double x, y;
						System.out.println("Escolha a opção que deseja realizar:");
						System.out.println("1) Somar.");
						System.out.println("2) Subtrair.");
						System.out.println("3) Multiplicar.");
						System.out.println("4) Dividir.");
						System.out.println("0) Sair");
						op2 = sc.nextInt();
						
						switch(op2){
						
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
					}while(op2 !=0);
						
			break;
			}
		}while(op != 0);
	}	
}
	


