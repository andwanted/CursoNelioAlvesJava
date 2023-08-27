package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			Map<String, Integer> total = new TreeMap<>();
			String lines = br.readLine();
			while (lines != null) {
				String bit[] = lines.split(",");
				if (total.containsKey(bit[0])) {
					total.put(bit[0], total.get(bit[0]) + Integer.parseInt(bit[1]));
					lines = br.readLine();
				} else {
					total.put(bit[0], Integer.parseInt(bit[1]));
					lines = br.readLine();
				}
			}
			for (String key : total.keySet()) {
				System.out.println("Chave " + key + " Valor: " + total.get(key));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sc.close();
	}

}
