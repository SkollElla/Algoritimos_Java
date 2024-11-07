package Programas;

import java.util.Scanner;

public class Escada {
	
	public static void main(String...args) {
		
		Scanner scanner = new Scanner(System.in);
		int linha, contador = 0, caracter = 0;
		System.out.println("Bemvindo ao criador de escadas");
		System.out.println("escolhas quantas linhas tem a escada:");
		linha = scanner.nextInt();
		while(contador <= linha){
			caracter = 1;
			while(caracter <= contador) {
				System.out.print("$");
				caracter++;
			}
			System.out.print(".\n");
			contador++;
		}
		
	}

}
