package Programas;

import java.util.Scanner;

public class TabuadaEntrada {
	
	public static void main(String...args) {
			
		int x , y = 10, res;
		Scanner scanner = new Scanner(System.in);
		System.out.println("|| Bem vindo ao criador de tabuadas até o 1000 ||");
		System.out.println("_________________________________________________");
		System.out.println("Entre com a tabuada que deseja");
		x = scanner.nextInt(); 
		System.out.println("Tabuada do: " + x);
		y = 1;
		while(y <= 1000) {
			res = x * y;
			System.out.println(x + " X " + y + " = " + res);
			y++;
		}
	}
}