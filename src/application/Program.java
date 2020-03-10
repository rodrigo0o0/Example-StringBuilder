package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		

		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),"Traveling to New Zeland","i'm going to visit this wonderful country!",12);
		Comment c1 = new Comment("Have a nice Trip!");
		Comment c2 = new Comment("Wow! That is awesome!");
		p1.addComment(c1);
		p1.addComment(c2);
	
		Post p2 = new Post(sdf.parse("28/07/2018 23:14:19"),"Good night guys","see you tomorrow",7);
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the Force be with you");
		p2.addComment(c3);
		p2.addComment(c4);
		
		
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
