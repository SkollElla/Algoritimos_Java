package Programas;

import java.util.Scanner;

//entre com um numero e diga se ele e divisivel por 3 ele e fizz,
//se e divisivel por 5 ele e buzz e se e por 3 e 5 ele e fizzbuzz. 

public class FizzBuzz 
{
	public static void main (String...arg) 
	{
		int fizzbuzz;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Entre com um numero.");
		
		fizzbuzz = scanner.nextInt();
		
		//if((fizzbuzz % 3 & 5) ==0 & fizzbuzz <= 100 )
		{
			//System.out.println("Seu numero é Fizzbuzz");
			
		}if((fizzbuzz % 5 ==0 & fizzbuzz <= 100 ))
		{
			System.out.println("Seu numero é Buzz");
			
		}if(fizzbuzz % 3 ==0 & fizzbuzz <= 100 )
		{
			System.out.println("Seu numero é Fizz");
		}
		else 
		{
			System.out.println("Erro");
		}
		
	}
}