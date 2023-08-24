package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String patch = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(patch))) {

			Set<User> users = new HashSet<>();

			String line = br.readLine();
			while (line != null) {

				String lin[] = line.split(" ");
				String name = lin[0];
				Date date = Date.from(Instant.parse(lin[1]));

				users.add(new User(name, date));

				line = br.readLine();

			}
			System.out.print("Total users: " + users.size());

		} catch (IOException e) {

			e.printStackTrace();
		}
		sc.close();
	}

}
