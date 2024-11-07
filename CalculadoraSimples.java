package Programas;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String...args) {
		
		double num1,num2,res;
		int op;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("||Beem vindo a Calculadora||");
		
		
		do {
			
			System.out.print("Primeiro entre com um numero: ");
			num1 = scanner.nextDouble();
			System.out.print("Entre com outro numero: ");
			num2 = scanner.nextDouble();
			System.out.println("Agora escolha uma opção:");
			System.out.println("1) Somar.");
			System.out.println("2) Subtração.");
			System.out.println("3) Multiplicação.");
			System.out.println("4) Divisão.");
			System.out.println("0) Sair.");
			op = scanner.nextInt();
			
			switch(op) {
			
				case 1:
					
					res = num1 + num2;
					System.out.println("O resultado da soma foi:" + res);
			
				break;
			
				case 2:
					
					res = num1 - num2;
					System.out.println("O resultado da subtração foi:" + res);
			
				break;
			
				case 3:
					
					res = num1 * num2;
					System.out.println("O resultado da multiplicação foi:" + res);
			
				break;

				case 4:

					res = num1 / num2;
					System.out.println("O resultado da divisão foi:" + res);
				
				break;
			
			}	
				
		}while(op != 0);
		
	}
	
}