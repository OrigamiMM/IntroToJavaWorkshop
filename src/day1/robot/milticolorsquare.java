package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class milticolorsquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Robot r2d3=new Robot();
for (int i = 0; i < 100; i++) {
	r2d3.penDown();
	r2d3.setPenWidth(50);
	r2d3.setRandomPenColor();
	r2d3.setSpeed(10);
	r2d3.move(150);
	r2d3.turn(90);
	r2d3.move(100);
	r2d3.turn(90);
	r2d3.move(150);
	r2d3.turn(90);
	r2d3.move(100);
	r2d3.turn(90);
}
	}

	
}

