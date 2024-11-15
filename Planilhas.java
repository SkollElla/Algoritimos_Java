package Programas;

import java.util.List;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Planilhas {
	
	public static void main(String...args) throws IOException {
	
		// Lista de Computadores
		List<Computador> computadores = new ArrayList<Computador>();
		
		Computador Dell = new Computador("Dell", "I9-1090", 10.0, 32);
		Computador Acer = new Computador("Acer", "I7-7700", 2.0, 12);
		Computador Lenovo = new Computador("Lenovo", "I5-200", 4.0, 16);
		Computador Positivo = new Computador("Positivo", "I3-1340", 2.0, 16);
		
		// add computadores a lista de computadores da classe de computadores
		computadores.add(Dell);
		computadores.add(Acer);
		computadores.add(Lenovo);
		computadores.add(Positivo);
		
		// lista de Animais
		List<Animais> animal = new ArrayList<Animais>();
		
		Animais Macaco =  new Animais("Macaquito", "Azulzinho", "Ave", 15.0);
		Animais Tucano =  new Animais("Tucanaro", "Preto", "Ave", 3.0);
		Animais Baleia =  new Animais("Baleario", "Cinza", "Mamifero", 3500.0);
		Animais Veado =  new Animais("Veadinho", "Azulzinho", "Mamifero", 30.0);
		
		// add Animais a lista de animais da classe animais
		animal.add(Macaco);
		animal.add(Tucano);
		animal.add(Baleia);
		animal.add(Veado);
		
		// Gravar CSv
		// try catcha
		try(FileWriter arqComputadorcomputadores = new FileWriter("Computadores.csv");
				PrintWriter gerarArquivoComputadores = new PrintWriter(arqComputadorcomputadores)){
				gerarArquivoComputadores.println("Marca;" + "Processador;" + "Armazenamento;" + "Ram");
				computadores.forEach(computador ->{
					gerarArquivoComputadores.println(computador.Marca + ";" + computador.Processador + ";" + computador.Memoria + ";" + computador.Ram); 
				});
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi dessa vez, tente denovo.");
		}
		
		try(FileWriter arqAnimaisanimal = new FileWriter("Animal.csv");
				PrintWriter gerarArquivoAnimal = new PrintWriter(arqAnimaisanimal)){
				gerarArquivoAnimal.println("Raça;" + "Cor;" + "Tipo;" + "Peso");
				animal.forEach(animais ->{
					gerarArquivoAnimal.println(animais.Raça + ";" + animais.Cor + ";" + animais.Tipo + ";" + animais.Peso); 
				});
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi dessa vez, tente denovo.");
		}
	}

}
