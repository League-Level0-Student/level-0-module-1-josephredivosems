package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
			String Pablo = "Good coder";
			String pabllav = "GOOD UHHH";
			String Peeblo = "YEETER";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String ace =	JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
	if (ace.equals("Pablo")) {
	JOptionPane.showMessageDialog(null, "You are a " + Pablo);	
	}
	else {
	if (ace.equals("pabllav")) {
	JOptionPane.showMessageDialog(null, "You are a "+ pabllav);
	}
	else {
		if (ace.equals("Peeblo")) {
		JOptionPane.showMessageDialog(null, "You are a " + Peeblo);
		}
	}
	}
}
}

