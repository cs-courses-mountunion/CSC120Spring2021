import java.awt.*;

public class CupAndSaucer {

    private Color color;
    private Integer over, down;
	
	
    public CupAndSaucer(Color c) {
        color = c;
    } // end of constructor

	
    public void setOver(Integer x) {
        over = x;
    } // end of setOver()
	
    public void setDown(Integer y) {
        down = y;
    } // end of setDown()
        

    public void draw(Graphics g) {

        Color cupColor;
  

        cupColor = color;
        
        
        
        
        // draw the saucer
        g.setColor(cupColor);        
        g.fillOval(over-10, down+30, 100, 30);
        g.setColor(Color.BLACK);
        g.drawOval(over-10, down+30, 100, 30);
        
        
        // draw the cup
        g.setColor(cupColor);
        g.fillArc(over, down-45, 80, 90, 180, 180);
        g.fillArc(over+70, down, 25, 25, 240, 230);
        g.setColor(Color.WHITE);
        g.fillOval(over, down-10, 80, 20);
        g.setColor(Color.LIGHT_GRAY);
        g.fillArc(over+75, down+5, 15, 15, 240, 230);
        g.setColor(Color.BLACK);
        g.drawArc(over+70, down, 25, 25, 240, 230);
        g.drawArc(over+75, down+5, 15, 15, 240, 230);
        g.drawArc(over, down-45, 80, 90, 180, 180);
        g.drawOval(over, down-10, 80, 20);
        
    } // end of draw()
    

	
} // end of class CupAndSaucer
