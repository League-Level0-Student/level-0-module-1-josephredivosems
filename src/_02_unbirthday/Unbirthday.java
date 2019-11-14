package _02_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
public static void main(String[] args) {
	
String response = JOptionPane.showInputDialog("What day is your birthday");


if (response.equals("11/13")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday");
}
else {
	JOptionPane.showMessageDialog(null, "Happy unBirthday");
}































































































}
}
