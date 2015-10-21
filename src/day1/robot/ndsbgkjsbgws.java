package day1.robot;

import javax.swing.JOptionPane;

public class ndsbgkjsbgws {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your name?");
		String answer1 = JOptionPane.showInputDialog("How old are you?");
		String answer2 = JOptionPane.showInputDialog("Do you have netflix?( type do, or do not)");
		JOptionPane.showMessageDialog(null, "I know that you are " + answer1);
		JOptionPane.showMessageDialog(null, "I know that your name is " + answer);
		JOptionPane.showMessageDialog(null, "I know that you " + answer2 + " have netflix" );
		JOptionPane.showConfirmDialog(null, "Don't give your info to strange computers");
		
		
		
	}

}
