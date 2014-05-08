import java.applet.Applet;
import java.util.*;
import java.awt.*;

public class Lab2_10A extends Applet {
		
		public static final int MIDX_SCREEN = 300;
		public static final int MIDY_SCREEN = 200;
		public void paint(Graphics page) {
		Random rand = new Random();
		int x, y, width, height;
		
		HashMap<Integer, Integer> coordMap = new HashMap<Integer, Integer>();

		// Set the background color
		setBackground(Color.cyan);
		
		page.setColor(Color.black);
		page.fillRect(MIDX_SCREEN - 45, MIDY_SCREEN - 85, 90, 10);
		page.fillRect(MIDX_SCREEN - 25, MIDY_SCREEN - 135, 50, 60);
		
		//ArmLeft
		
		//page.drawLine(MIDX_SCREEN - 60, MIDY_SCREEN + 20, MIDX_SCREEN - 100, MIDY_SCREEN - 30);
		
		// Set color for the next shape to be drawn
		page.setColor(Color.blue);
		x = 0;
		y = 300;
		width = 600;
		height = 100;
		page.fillRect(x, y, width, height);
		
		// Bottom - Set color for the next shape to be drawn
		page.setColor(Color.white);
		x = MIDX_SCREEN - 100;
		y = MIDY_SCREEN + 50;
		width = 200;
		height = 100;
		page.fillOval(x, y, width, height);

		// Torso - Set color for the next shape to be drawn
		page.setColor(Color.white);
		x = MIDX_SCREEN - 75;
		y = MIDY_SCREEN;
		width = 150;
		height = 50;
		page.fillOval(x, y, width, height);

		// Head - Set color for the next shape to be drawn
		page.setColor(Color.white);
		x = MIDX_SCREEN - 35;
		y = MIDY_SCREEN - 75;
		width = 75;
		height = 75;
		page.fillOval(x, y, width, height);
		
				// Bottom - Set color for the next shape to be drawn
		page.setColor(Color.black);
		x = MIDX_SCREEN - 100;
		y = MIDY_SCREEN + 50;
		width = 200;
		height = 100;
		page.drawOval(x, y, width, height);

		// Torso - Set color for the next shape to be drawn
		page.setColor(Color.black);
		x = MIDX_SCREEN - 75;
		y = MIDY_SCREEN;
		width = 150;
		height = 50;
		page.drawOval(x, y, width, height);

		// Head - Set color for the next shape to be drawn
		page.setColor(Color.black);
		x = MIDX_SCREEN - 35;
		y = MIDY_SCREEN - 75;
		width = 75;
		height = 75;
		page.drawOval(x, y, width, height);
		
		page.setColor(Color.black);
		//ARMS
		page.drawLine(MIDX_SCREEN - 50, MIDY_SCREEN + 10, MIDX_SCREEN - 100, MIDY_SCREEN - 100);
		page.drawLine(MIDX_SCREEN + 50, MIDY_SCREEN + 10, MIDX_SCREEN + 100, MIDY_SCREEN - 100);
		
		//Face
		//Smile
		page.drawArc(MIDX_SCREEN - 25, MIDY_SCREEN-55, 50, 50, 190, 160);
		//Eyes			
		page.fillOval(MIDX_SCREEN - 25, MIDY_SCREEN - 60, 15, 15);
		page.fillOval(MIDX_SCREEN + 10, MIDY_SCREEN - 60, 15, 15);
		
		//Sign
		page.setColor(new Color(196, 154, 104));
		page.fillRect(MIDX_SCREEN - 200, MIDY_SCREEN, 100, 50);
		page.setColor(Color.white);
		page.drawString("Happy Holidays",MIDX_SCREEN - 190, MIDY_SCREEN + 20);
		}

}