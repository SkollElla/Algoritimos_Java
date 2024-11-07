package Programas;
import java.util.Scanner;


public class CalculoSalario {
	
	public static void main(String...args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double sal,ven,com,total;
		int op;
		
		String nome;
		char sex;
		
		System.out.println("Bem vindo ao sistema de comissão.");
		System.out.println("Qual nome do funcionario:");
		nome = scanner.next();
			
		System.out.println("O funcionario é:\n" + "(H) Homem | (M) Mulher");
		sex = scanner.next().charAt(0);
			
		System.out.println("Qual salario do funcionario?");
		sal = scanner.nextDouble();
			
		System.out.println("Quanto ele vendeu?");
		ven = scanner.nextDouble();
		do {
			             // Menu
			System.out.println("\n \n1) Comissão.");
			System.out.println("2) Total de Salario.");
			System.out.println("3) Toedas as Informações.");
			System.out.println("4) Sair do Sistema.");
			op = scanner.nextInt();
			
			switch(op) {
				
			case 1:
				
				if(sex == 'H' || sex == 'h') {
					
					com = (ven * 0.09);	
					System.out.println("O valor da  sua comissão foi de:" + com);
					
				}
				else if(sex == 'M' || sex == 'm') {
					
					com = (ven * 0.095); 
					System.out.println("O valor da  sua comissão foi de:" + com);	
				}
				
				
				
			break;
				
			case 2:
							
				if(sex == 'H' || sex == 'h') {
								
					com = (ven * 0.09);	
					total = sal + com;
					System.out.println("O valor do salario com sua comissão foi de:" + total);	
				}
				else if(sex == 'M' || sex == 'm') {
								
					com = (ven * 0.095);
					total = sal + com;
					System.out.println("O valor do salario com sua comissão foi de:" + total);			
				}
							
							
							
			break;
			
			case 3:
				
				if(sex == 'H' || sex == 'h') {
					
					com = (ven * 0.09);
					total = sal + com;
					System.out.println("O funcionario:" + nome );
					System.out.println("Tem o salario de:" + sal);
					System.out.println("vendeu:" + ven);
					System.out.println("Recebeu comissão de:" + com);
					System.out.println("Recebendo um salario total de:" + total);
				}
				else if(sex == 'M' || sex == 'm') {
					
					com = (ven * 0.095);
					total = sal + com;
					System.out.println("O funcionario:" + nome );
					System.out.println("Tem o salario de:" + sal);
					System.out.println("vendeu:" + ven);
					System.out.println("Recebeu comissão de:" + com);
					System.out.println("Recebendo um salario total de:" + total);
				}
				
				
			break;
			
			
			}
		
		}while(op != 0);
		
	}
	
}
