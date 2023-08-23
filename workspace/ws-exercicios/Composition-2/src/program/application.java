package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class application {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Traveling to New Zealand",
				"I'm going to visit this wonderful country!", 12);

		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("How thats awesome!");

		p1.addComment(c1);
		p1.addComment(c2);

		Post p2 = new Post(sdf.parse("18/04/2023 00:00:18"), "Perfect", "i found a love, for me", 3);
		Comment c3 = new Comment("Ual!");
		Comment c4 = new Comment("O tempo jamais separara!");
		
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);
	}

}
