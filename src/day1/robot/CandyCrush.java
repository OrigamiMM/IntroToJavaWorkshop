package day1.robot;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("Who's face makes you wanna throw up");
		
		if (answer.equals("Oscar")) {
			JOptionPane.showMessageDialog(null, "Lock your door toghit");
			
		}
		else
		JOptionPane.showMessageDialog(null, "You totally have a crush on " + answer);
		
		String answer1 = JOptionPane.showInputDialog("Who is your best freind?");
		
		JOptionPane.showMessageDialog(null, "Well, " + answer1  + " is as sweet as candy");
	} 
}

