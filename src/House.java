import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class House {
	static Robot sami= new Robot();
public static void main(String[] args) {
	sami.setX(10);
	for (int i = 0; i < 9; i++) {
		drawHouse(i*10);
	}
	drawPointyRoof("small", Color.blue);
	
}
static void drawHouse(int height) {
	sami.setPenWidth(5);
	sami.penDown();
	sami.setSpeed(100);
	sami.setRandomPenColor();
	sami.move(height);
	sami.turn(90);
	sami.move(30);
	sami.turn(90);
	sami.move(height);
	sami.turn(-90);
	sami.setPenColor(Color.green);
	sami.move(20);
	sami.turn(-90);
}

static void drawPointyRoof(String height, Color c) {
int b=0;
	if(height.equals("small")) {
		b=60;
	}
	else if(height.equals("medium")) {
		b=120;
	}
	else if(height.equals("large")) {
		b=250;
	}
	sami.setPenColor(c);
	sami.move(b);
	sami.turn(45);
	sami.move(30);
	sami.turn(85);
	sami.move(30);
	sami.turn(50);
	sami.move(50);
}
}
