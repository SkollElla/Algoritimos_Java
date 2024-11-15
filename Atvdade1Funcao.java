package Programas;

import java.util.Scanner;

public class Atvdade1Funcao {
	
	public static void main(String...args) {
		
		FuncaoAtividade1 fa1 = new FuncaoAtividade1();
		Scanner sc = new Scanner(System.in);
		int op = 0;
		int op2 = 0;
		double x,y;
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
					x = sc.nextDouble();
					System.out.println("Agora digite sua altura em metros!");
					y = sc.nextDouble();
					double resimc =  fa1.imc(x, y);
					System.out.println("Seu IMC é :" + resimc + "\n");
					
				break;
				case 2:
					
					System.out.println("Iremos converter Cecios para kelvin, digite quantos graus Cecios quer convverter!");
					x = sc.nextDouble();
					double reskelvin = fa1.conversor1(x);
					System.out.println("Convertendo para Kelvin fica :" + reskelvin + "\n");
					
				break;
				case 3:
					System.out.println("Iremos converter Cecios para Fahrenheit, digite quantos graus Cecios quer convverter!");
					 x = sc.nextDouble();
					double resfahrenheit = fa1.conversor2(x);
					System.out.println("A conversao para Fahrenheit deu :" + resfahrenheit + "\n");
					
				break;
				case 4:
					do {
						
						System.out.println("Escolha a opção que deseja realizar:");
						System.out.println("1) Somar.");
						System.out.println("2) Subtrair.");
						System.out.println("3) Multiplicar.");
						System.out.println("4) Dividir.");
						System.out.println("0) Sair");
						op2 = sc.nextInt();
						
						switch(op2){
						
						case 1:
							
							System.out.println("Entre com o primerio numero");
							x = sc.nextDouble();
							
							System.out.println("Entre com o segundo numero");
							y = sc.nextDouble();
							
							double resSomar =  fa1.somar(x, y);
							System.out.println("O resultado da soma é: " + resSomar+ "\n");
							
						break;
						case 2:
						
							System.out.println("Entre com o primerio numero");
							x = sc.nextDouble();
							
							System.out.println("Entre com o segundo numero");
							y = sc.nextDouble();
							
							double resSubtrair =  fa1.subtrair(x, y);
							System.out.println("O resultado da subtração é: " + resSubtrair+ "\n");
							
						break;
						case 3:
							
							System.out.println("Entre com o primerio numero");
							x = sc.nextDouble();
							
							System.out.println("Entre com o segundo numero");
							y = sc.nextDouble();
							
							double resMultiplicar =  fa1.multipicar(x, y);
							System.out.println("O resultado da mutiplicação é: " + resMultiplicar+ "\n");
							
						break;
						case 4:
							
							System.out.println("Entre com o primerio numero");
							x = sc.nextDouble();
							
							System.out.println("Entre com o segundo numero");
							y = sc.nextDouble();
							
							double resDividir =  fa1.dividir(x, y);
							System.out.println("O resultado da divisão é: " + resDividir + "\n");
							
						break;
						}
					}while(op2 !=0);
						
			break;
			}
		}while(op != 0);
	}
		
}


