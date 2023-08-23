package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		/**
		 * • É um bloco try que declara um ou mais recursos, e garante que esses
		 * recursos serão fechados ao final do bloco
		 */

		String path = "c:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			int c = 0;
			while (line != null) {
				System.out.println("Linha: " + c + " " + line);
				line = br.readLine();
				c++;
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
