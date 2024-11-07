package Programas;

import java.util.Scanner;

public class TestFizzBuzz 
{

	
	public static void main (String...arg) 
	{
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com um numero.");
		
		num = scanner.nextInt();
		
		if ((num % 3 == 0) & (num % 5 == 0) & num <=100) {
			System.out.println("Seu numero é Fizzbuzz");
		}
		else if(num % 3 ==0 & num <=100) {
			System.out.println("Seu numero é Fizz");
		}
		else if(num % 5 ==0 & num <=100) {
			System.out.println("Seu numero é Buzz");
		}
		else if(num >=100){
			System.out.println("Erro");
		}
		else 
			System.out.println(num);
	}	
}