package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {

	public static void main(String[] args) {
		String[] lines = new String[] { "Bom dia", "Boa tarde", "Boa noite" };

		String path = "c:\\temp\\out.txt";

		//o parametro true no filewriter informa que deseja "recriar" ou invez de destruir e criar novamente
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
