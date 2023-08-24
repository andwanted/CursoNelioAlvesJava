package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		File patch = new File("c:\\temp\\in.txt");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

		Set<User> users = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(patch))) {
			String line = br.readLine();
			while (line != null) {
				String lin[] = line.split(" ");
				String name = lin[0];
				Date date = dateFormat.parse(lin[1]);
				users.add(new User(name, date));
				line = br.readLine();
				sc.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Set<String> usersCount = new HashSet<>();

		for (User listUser : users) {
			usersCount.add(listUser.getName());
		}

		System.out.print("Enter file full path: " + patch);
		System.out.print("\nTotal users: " + usersCount.size());

	}

}
