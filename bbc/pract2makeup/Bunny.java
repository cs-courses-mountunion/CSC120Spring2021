import java.awt.*;
import java.util.*;

public class Bunny {
    private int over, down;
    private Color bunnyColor;
    
    public Bunny (Color colorOfBun) {
        Random gen = new Random();
        over = gen.nextInt(550) + 200;
        down = gen.nextInt(480) + 50;
        bunnyColor = colorOfBun;
    }
    
    public int getDown() {
        return down;
    }
    
    public void setOver(int x) {
    	over = x;
    }
	
    public void setDown(int y) {
    	down = y;
    }
    
    public void setColor(Color c) {
        bunnyColor = c;
    }
    
    public void draw(Graphics g) {
        g.setColor(bunnyColor);
        g.fillOval(over-2, down+35, 10, 10);
        g.fillOval(over+13, down+35, 10, 10);
        g.setColor(Color.BLACK);
        g.drawOval(over-2, down+35, 10, 10);
        g.drawOval(over+13, down+35, 10, 10);
		
        g.setColor(bunnyColor);
        g.fillOval(over-5, down+10, 30, 30);
        g.setColor(Color.BLACK);
        g.drawOval(over-5, down+10, 30, 30);
        
        g.setColor(bunnyColor);
        g.fillOval(over, down, 20, 20);
        g.fillOval(over+2, down-28, 5, 30);
        g.fillOval(over+13, down-28, 5, 30);
        g.setColor(Color.BLACK);
        g.drawOval(over, down, 20, 20);
        g.drawOval(over+2, down-28, 5, 30);
        g.drawOval(over+13, down-28, 5, 30);
        
        g.fillOval(over+4, down+5, 4, 4);
        g.fillOval(over+12, down+5, 4, 4);
        g.fillOval(over+8, down+9, 4, 4);
        g.drawLine(over+6, down+16, over+14, down+16);
    } // end of draw()
        
} // end of class Bunny

