package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		
		//encapsula o objeto tipo file, tendo varias opções de acesso
		File file = new File("C:\\temp\\in.txt");
		
		//inicia o scanner vazio
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			//trata o fechamento de scanner se for diferente de vazio
			if (sc != null) {
				sc.close();
			}
		}
	}
}
