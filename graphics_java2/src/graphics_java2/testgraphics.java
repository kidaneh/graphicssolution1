/*
 * This graphics program 
 * Done by kidane G Hailemichael
 * April 21, 2020
 */
package graphics_java2;

import java.awt.*;

public class testgraphics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DrawingPanel panel=new DrawingPanel(400,400);
		panel.setBackground(Color.YELLOW);
		Graphics g=panel.getGraphics();
		g.setColor(Color.RED);
		g.fillRect(75,  75,  100,  100);
		g.setColor(Color.BLUE);
		g.fillOval(45, 45, 60, 60);
		g.fillOval(145, 45, 60, 60);
		g.setColor(Color.BLACK);
		g.drawLine(75, 125, 175, 125);
		
	
		}

}
