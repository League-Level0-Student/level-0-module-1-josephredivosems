package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
	String hmm =	JOptionPane.showInputDialog("Imagine you are in a dark room "
				+ "\n How do you get out?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(hmm.contentEquals("Stop Imagining")) {
		score = score + 1;
		JOptionPane.showMessageDialog(null, "Correct!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer
		else {
		JOptionPane.showMessageDialog(null, "Nope. The answer is 'Stop Imagining' ");
		}
		
		// 6. Add some more riddles
		String hm = JOptionPane.showInputDialog(" Which word is wrong? "
				+ "\nI went to "
				+ "\n Paris in the "
				+ "\n the springtime.");
		if(hm.equals("The")) {
			score = score + 1;
			JOptionPane.showMessageDialog(null, "Nice!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Oof! The answer is The");
		}
		
	String joe =	JOptionPane.showInputDialog("Who's JOE");
		if(joe.equals("Joe Mama")) {
			score = score + 1;
		JOptionPane.showMessageDialog(null, "Woohoo");
		}
		else {
			JOptionPane.showMessageDialog(null, "Your wrong. So is JOe Mama");
		}
		
		// 2. Make a pop up to show the score.
		
		
		
		
		
		JOptionPane.showMessageDialog(null, "Your score is " + score);
	}
}

