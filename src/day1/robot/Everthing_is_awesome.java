package day1.robot;

import javax.swing.JOptionPane;

public class Everthing_is_awesome {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is awesome?");
	    JOptionPane.showMessageDialog(null, answer + " is awesome!");
	    String answer1 = JOptionPane.showInputDialog("You know else is awesome?");
	    JOptionPane.showMessageDialog(null, "NOT" + answer1 +  "Wanna know why?");
	}

}
