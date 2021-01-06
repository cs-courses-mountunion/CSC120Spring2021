/* CSC 120 Lab # 5 Part 3
 * Samantha Student
 * Today's Date
 *
 * Project Description: An Interactive Program that shows colors
 *  changing as the message moves across the screen
 *
 * Acknowledgements:
 *
 */
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
    
    private Integer horizPos, vertPos;

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Mount Union Java Program");
        setUp();
        setBackground(Color.DARK_GRAY);

        // 2. Instantiate objects here by calling "new":
        
        horizPos = 10;
        vertPos = 50;
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Call methods of objects here:

        g.setColor(Color.GREEN);
        
        g.setFont(new Font("SansSerif", Font.BOLD, 18));
        g.drawString("Buttons are Fun!", horizPos, vertPos);
		
		
    } // end of paintComponent()
    
    
    public void moveRight() {
        
            horizPos = horizPos + 40;
            
    } // end of moveRight
       
    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(false);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
