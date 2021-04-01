 
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {


    
    
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("CSC 120 Practicum # 2");
        setBackground(new Color(102, 0, 102));

        
		
		
		
		
//  winner # 0: Milton Friedman won the Nobel Prize for Economics in 1976
//  winner # 1: Saul Bellow won the Nobel Prize for Literature in 1976
//  winner # 2: Toni Morrison won the Nobel Prize for Literature in 1993
//  winner # 3: George Smoot won the Nobel Prize for Physics in 2006
//  winner # 4: Al Gore won the Nobel Prize for Peace in 2007
//  winner # 5: Carol Greider won the Nobel Prize for Medicine in 2009
//  winner # 6: Eric Betzig won the Nobel Prize for Chemistry in 2014
//  winner # 7: Bob Dylan won the Nobel Prize for Literature in 2016
//  winner # 8: Oliver Hart won the Nobel Prize for Economics in 2016
        
        

    
        System.out.println("\nAmerican Nobel Prize Winners:\n======================");
//        displayAllNobelWinners();

        System.out.println("\nAmerican Nobel Prize Winners in Literature:\n======================");
//        displayNobelWinnersInLiterature();


    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        g.setFont( new Font("SansSerif", Font.BOLD, 18));
        g.setColor(Color.YELLOW);
        g.drawString("Look in Java Console for Output....", 50, 190);        
        
    } // end of method paintComponent
    
    // Add other methods here:
    
	

    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel().frame();}

} // end of class MUPanel
