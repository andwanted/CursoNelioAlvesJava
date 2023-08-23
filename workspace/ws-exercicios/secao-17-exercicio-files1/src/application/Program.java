package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Produto;

/*
 * Correção em https://github.com/acenelio/files1-java	
 */

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o caminho do arquivo");
		String strArq = sc.nextLine();

		File arq = new File(strArq + "\\Produto.csv");

		List<Produto> produto = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {

			String line = br.readLine();
			while (line != null) {
				String lin[] = line.split(",");
				String nomeProd = lin[0];
				double precoProd = Double.parseDouble(lin[1]);
				int quantidadeProd = Integer.parseInt(lin[2]);
				produto.add(new Produto(nomeProd, precoProd, quantidadeProd));
				line = br.readLine();
			}

			for (Produto p : produto) {
				System.out.println(p.toString());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		File arqOut = new File(strArq + "\\out");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arqOut + "\\summary.txt"))) {
			for (Produto p : produto) {
				String lines[] = new String[] { p.getProduto(), Double.toString(p.calculaProduto()) };
				for (String line : lines) {
					bw.write(line);
					bw.newLine();
				}
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}

}
