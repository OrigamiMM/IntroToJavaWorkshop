package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {

		Robot mike=new Robot();
		
		// 5. Set your robot's pen to the down position
              mike.penDown();
              mike.setSpeed(10);
               for (int i = 0; i < 10000; i++) {
	              mike.setRandomPenColor();
                  mike.move(5*i);
				  mike.turn(50);
				  mike.setPenWidth(5*i);
			}
			

	}

}
