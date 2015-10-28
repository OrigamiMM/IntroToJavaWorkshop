package day1.robot;

import javax.swing.JOptionPane;

public class MADLIBS {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("Name for a person");
	String answer1 = JOptionPane.showInputDialog("type of verb");
	String answer2 = JOptionPane.showInputDialog("type of adverb");
	String answer3 = JOptionPane.showInputDialog("type of feeling (ex: enjoy,hate)");
	JOptionPane.showMessageDialog(null, "My name is " + answer + ". All I ever do is " + answer1 + " and I do it " + answer2 + ". I also " + answer3 + " it");
}
}
