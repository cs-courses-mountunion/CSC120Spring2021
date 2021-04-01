 
import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {


    
    
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("CSC 120 Practicum # 2");
        setBackground(new Color(102, 0, 102));

        
		
		
		
//***** NOTE: IF A PERSON HAS NOT YET DIED, USE 0 AS THE YEAR OF DEATH *****		
//  SecGen # 0: Gladwyn Jebb died in 1996 and was from the United Kingdom
//  SecGen # 1: Trygve Lie died in 1968 and was from Norway
//  SecGen # 2: Kofi Annan died in 2018 and is from Ghana
//  SecGen # 3: U Thant died in 1974 and was from Burma
//  SecGen # 4: Antonio Guterres is still alive and is from Portugal
//  SecGen # 5: Javier Perez de Cuellar died in 2020 and is from Peru
//  SecGen # 6: Ban Ki-moon is still alive and is from South Korea
//  SecGen # 7: Boutros Boutros-Galli died in 2016 and was from Egypt
        
        

    
        System.out.println("\nUN Secretaries-General:\n======================");
//        displayAllSGs();

        System.out.println("\nSecretaries-General that are still living:\n======================");
//        displaySGsStillAlive();


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
