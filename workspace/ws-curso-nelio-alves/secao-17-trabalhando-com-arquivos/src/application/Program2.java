package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	// filareader e bufferreader

	public static void main(String[] args) {
		
		//para testar o erro podemos mudar o nome do arquivo
		String path = "c:\\temp\\in.txt";
		
		//instacia um filereader e bufferedreader 
		FileReader fr = null;
		BufferedReader br = null;
		
		
		try {
			
			//instancia o caminho de fr e passa um file dentro de buffer para otimizar o processo, vale a pesquisa
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();
			int c = 0;
			while (line != null) {
				System.out.println("Linha: " + c + " " + line);
				line = br.readLine();
				c++;
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
