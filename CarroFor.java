package Programas;

	import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
// bibliotecas
import java.util.ArrayList;
import java.util.List;

public class CarroFor {
	
	public static void main(String...args) throws IOException {
		
			// Lista e carros
		
		List<Carro> carros = new ArrayList<Carro>();
		
		Carro Fiat_147 = new Carro("147", "Fiat", "Azul Bebê", 1986);
		Carro Corsa = new Carro("Corsa", "GM", "Verde", 1997);
		Carro Dell_Rey = new Carro("Dell Rey", "Ford", "Verde Oceano", 1987);
		Carro Marrua = new Carro("Marrua", "Agrale", "Verde Oliva", 2005);
		
			// add carros a lista de carros da casse de carros
		carros.add(Fiat_147);
		carros.add(Corsa);
		carros.add(Dell_Rey);
		carros.add(Marrua);
		
			// ForEatch
			// modelo
		
		carros.forEach(carro ->{
			System.out.println(carro.Modelo + " " + carro.Marca + " " + carro.Cor + " " + carro.Ano + ".");
		});
		
			// Gravar CSV
			// Pegar e Largar == try catch
		
		try(FileWriter arqCarrocarros = new FileWriter("carros.csv");
				PrintWriter gerarArquivocarros= new PrintWriter(arqCarrocarros)){
				gerarArquivocarros.println("Modelo " + "Marca " + "Cor " + "Ano");
				carros.forEach(carro ->{
					gerarArquivocarros.println(carro.Modelo + " " + carro.Marca + " " + carro.Cor + " " + carro.Ano + ".");
				});
			}catch (IOException e) {
				e.printStackTrace();
				System.out.println("Não foi dessa vez, tente denovo.");
			}
		try(FileWriter arqCarroFiat_147 = new FileWriter("Fiat_147.csv");
			PrintWriter gerarArquivoFiat_147 = new PrintWriter(arqCarroFiat_147)){
			gerarArquivoFiat_147.println("Modelo " + "Marca " + "Cor " + "Ano");
			gerarArquivoFiat_147.println(Fiat_147.getModelo() + " " + Fiat_147.getMarca() + " " + Fiat_147.getCor()+ " " + Fiat_147.getAno());
			
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println("Não foi dessa vez, tente denovo.");
		}
		try(FileWriter arqCarroCorsa = new FileWriter("Corsa.csv");
				PrintWriter gerarArquivoCorsa = new PrintWriter(arqCarroCorsa)){
				gerarArquivoCorsa.println("Modelo " + "Marca " + "Cor " + "Ano");
				gerarArquivoCorsa.println(Corsa.getModelo() + " " + Corsa.getMarca() + " " + Corsa.getCor() + " " + Corsa.getAno());
				
			}catch (IOException e) {
				e.printStackTrace();
				System.out.println("Não foi dessa vez, tente denovo.");
			}
		try(FileWriter arqCarroDell_Rey = new FileWriter("Dell_Rey.csv");
				PrintWriter gerarArquivoDell_Rey = new PrintWriter(arqCarroDell_Rey)){
				gerarArquivoDell_Rey.println("Modelo " + "Marca " + "Cor " + "Ano");
				gerarArquivoDell_Rey.println(Dell_Rey.getModelo() + " " + Dell_Rey.getMarca() + " " + Dell_Rey.getCor() + " " + Dell_Rey.getAno());
				
			}catch (IOException e) {
				e.printStackTrace();
				System.out.println("Não foi dessa vez, tente denovo.");
			}
			try(FileWriter arqCarroMarrua = new FileWriter("Marrua.csv");
					PrintWriter gerarArquivoMarrua = new PrintWriter(arqCarroMarrua)){
					gerarArquivoMarrua.println("Modelo " + "Marca " + "Cor " + "Ano");
					gerarArquivoMarrua.println(Marrua.getModelo() + " " + Marrua.getMarca() + " " + Marrua.getCor() + " " + Marrua.getAno());
					
				}catch (IOException e) {
					e.printStackTrace();
					System.out.println("Não foi dessa vez, tente denovo.");
				}
	}
}
