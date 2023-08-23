package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Produto;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String caminhoArquivo = "C:\\temp\\Produto\\Produto.csv";

		File arquivo = new File(caminhoArquivo);

		boolean testaLeituraEntrada;

		try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			testaLeituraEntrada = true;
			System.out.println("Leitura de arquivo: " + testaLeituraEntrada);

		} catch (IOException e) {
			e.printStackTrace();
		}

		List<Produto> produto = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			String line = br.readLine();
			int i = 0;
			while (line != null) {
				String[] lines = line.split(",");
				String nome = lines[0];
				double preco = Double.parseDouble(lines[1]);
				int quantidade = Integer.parseInt(lines[2]);
				produto.add(new Produto(nome, preco, quantidade));
				i++;
				line = br.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		boolean testaPastaOut = false;

		File arquivoDeSaida = new File(arquivo.getParent() + "\\out");

		try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))) {
			if (arquivoDeSaida.canRead() == true) {
				System.out.println("Pasta de saida encontrada!");
				testaPastaOut = true;
			} else if (arquivoDeSaida.canRead() == false) {
				new File(arquivo.getParent() + "\\out").mkdir();
				System.out.println("Pasta de saida criada!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		boolean testaArquivoDeSaida = false;

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoDeSaida + "\\Summary.csv"))) {
			for (Produto p : produto) {
				bw.write(p.getProduto() + "," + p.calculaProduto());
				bw.newLine();
			}
			testaArquivoDeSaida = true;

		} catch (IOException e) {
			e.printStackTrace();
		}
		if(testaArquivoDeSaida = true) {
			System.out.println("Arquivo de saida gravado com sucesso: " + testaArquivoDeSaida);
		}else {
			System.out.println("Não foi possivel gravar arquivo de saida");
		}

	}

}
