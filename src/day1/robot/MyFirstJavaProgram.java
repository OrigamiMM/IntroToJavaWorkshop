package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot mike =new Robot();
mike.sparkle();
mike.setSpeed(100);
	for (int i = 0; i < 4; i++) {
	mike.penDown();
	mike.setPenColor(102, 238, 225);
	mike.move(100);
	mike.turn(90);
	mike.setPenColor(136, 0, 0);
	mike.move(100);
	mike.turn(90);
	mike.setPenColor(102, 238, 225);
	mike.move(100);
	mike.turn(90);
	mike.setPenColor(136,0,0);
	mike.move(100);
	mike.penUp();
	mike.move(100);
	mike.turn(90);	
	}	
	
	}
	
}