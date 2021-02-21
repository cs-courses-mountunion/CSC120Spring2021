import java.awt.*;
import java.util.*;

public class Oinker {

    private Color color;
    private Integer x, y, size;
	
	
    public Oinker(Color c, Integer s) {
        color = c;
        x = 0;
        y = 0;
        size = s;
    } // end of constructor

	
    public void setX(Integer xx) {
        x = xx;
    } // end of setX()
	
    public void setY(Integer yy) {
        y = yy;
    } // end of setY()
        
    public void setSize(Integer s) {
        size = s;
    } // end of setSize()
        

    public void draw(Graphics g) {

        Color pigColor = color;

        
        
        
        
                // back legs
        g.setColor(pigColor);  g.fillRect(x+5, y+size/2, 10, size/2);
        g.setColor(Color.black); g.drawRect(x+5, y+size/2, 10, size/2);
        g.setColor(pigColor);  g.fillRect(x+size-15, y+size/2, 10, size/2);
        g.setColor(Color.black); g.drawRect(x+size-15, y+size/2, 10, size/2);
        // front legs
        g.setColor(pigColor);  g.fillRect(x+18, y+size/2, 5, size/2-5);
        g.setColor(Color.black); g.drawRect(x+18, y+size/2, 5, size/2-5);
        g.setColor(pigColor);  g.fillRect(x+size-23, y+size/2, 5, size/2-5);
        g.setColor(Color.black); g.drawRect(x+size-23, y+size/2, 5, size/2-5);
        // body
        g.setColor(pigColor);  g.fillOval(x+5, y, size-10, size-10);
        g.setColor(Color.black); g.drawOval(x+5, y, size-10, size-10);
        // head
        g.drawOval(x+size/4, y+size/4-5, size/2, size/2);
        // nose
        g.drawOval(x+size/2-5, y+size/2-7, 10, 10);
        g.drawLine(x+size/2-2, y+size/2-5, x+size/2-2, y+size/2-2);
        g.drawLine(x+size/2+2, y+size/2-5, x+size/2+2, y+size/2-2);
        // eyes
        g.setColor(Color.WHITE);
        g.fillOval(x+size/2-13, y+size/4+2, 11, 11);
        g.fillOval(x+size/2+2, y+size/4+2, 11, 11);
        g.setColor(Color.BLACK);
        g.drawOval(x+size/2-13, y+size/4+2, 11, 11);
        g.drawOval(x+size/2+2, y+size/4+2, 11, 11);
        g.fillOval(x+size/2-10, y+size/4+5, 5, 5);
        g.fillOval(x+size/2+5, y+size/4+5, 5, 5);

    } // end of draw()

	
} // end of class Oinker
