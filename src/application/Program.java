package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		// Lista para armazenar as linhas do arquivo de texto (Strings)
		List<String> listString = new ArrayList<>();

		// Caminho do arquivo que contém dados do tipo String
		String pathString = "G:\\Eclipse\\Exercising\\in.String.txt";

		// Bloco try-with-resources para garantir que o BufferedReader será fechado automaticamente
		try (BufferedReader br = new BufferedReader(new FileReader(pathString))) {
			String line = br.readLine(); // Lê a primeira linha do arquivo
			while (line != null) { 		 // Continua lendo enquanto não for fim do arquivo (null)
				listString.add(line);	 // Adiciona a linha lida à lista
				line = br.readLine();	 // Lê a próxima linha
			}
		} catch (IOException e) {
			// Em caso de erro na leitura do arquivo, exibe mensagem de erro
			System.out.println("Erro: " + e.getMessage());
		}

		// Imprime todas as linhas armazenadas na lista de Strings
		for (String line : listString) {
			System.out.println(line);
		}

		// Lista para armazenar os números inteiros lidos do arquivo
		List<Integer> listInteger = new ArrayList<>();

		// Caminho do arquivo que contém dados do tipo Integer
		String pathInteger = "G:\\Eclipse\\Exercising\\in.Integer.txt";

		// Mesmo processo acima, mas agora lendo inteiros
		try (BufferedReader br = new BufferedReader(new FileReader(pathInteger))) {
			String line = br.readLine(); // Lê a primeira linha
			while (line != null) {
				// Converte a String lida para Integer e adiciona à lista
				listInteger.add(Integer.parseInt(line));
				line = br.readLine(); // Lê a próxima linha
			}
		} catch (IOException e) {
			// Em caso de erro, exibe mensagem de erro
			System.out.println("Erro: " + e.getMessage());
		}

		// Imprime todos os números inteiros lidos
		for (Integer line : listInteger) {
			System.out.println(line);
		}
	}
}
