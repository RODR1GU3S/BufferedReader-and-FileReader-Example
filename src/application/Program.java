package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		String path = "G:\\Eclipse\\Projetos\\arquivos\\Example\\BufferedReader_and_FileReader\\Arquivo - Aula BufferedReader and FileReader.txt";

		List<String> list = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader (path))) {
			
			String line = br.readLine();
			while(line != null) {
				list.add(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
		for(String line : list) {
			System.out.print("Leitura da linha: ");
			System.out.println(line);	
		}
	}
}
