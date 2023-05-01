/**
 * Catepillar.java - Draw a Caterpillar
 * Author:            Ethan Grant
 * Module:     2
 * Project:    Homework 2 - Four Graphics
 *  Problem Statment: Draw an original picture, in this case a catepillar.
 * 
 * Algorithim: 
 * 1. Set up constants for the title,height, and width of the Jframe.
 * 2. Create the JFrame and set its size, title, close operation, 
 *    and location and make the picture visible. 
 * 3. Draw the catepillar's body.
 * 4. Draw the catepillar's eyes.
 * 5. Draw the catepillar's mouth
 * 6. Draw the catepillar's green legs
 * 7. Draw the catepillar's red legs
 * 8. Draw the catepillar's yellow legs
 * 9. Draw the catepillar's magenta legs
 * 10.Draw the catepillar's blue legs
 * 11.Draw the catepillar's hat
 * 12.Draw the catepillar's hair
 * 13.Compile and test
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Caterpillar extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "(Caterpillar)" ;
    final static int WIDTH = 1000,           // width of JFrame (including borders)
                     HEIGHT = 1000 ;         // height of JFrame (borders and controls)
                     
    public void paint(Graphics canvas) {
        
        canvas.setColor(Color.ORANGE) ;
        canvas.fillRect(0, 0, 10000, 10000) ;
        
         //Catepillar Body
        canvas.setColor(Color.GREEN);
        canvas.fillOval(240,260,100,100);  
        
        canvas.setColor(Color.RED);
        canvas.fillOval(180,240,100,100); 
        
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(110,210,100,100);  
        
        canvas.setColor(Color.MAGENTA);
        canvas.fillOval(60,180,100,100);  
        
        canvas.setColor(Color.BLUE);
        canvas.fillOval(30,130,100,100);  
        
        canvas.setColor(Color.CYAN);
        canvas.fillOval(30,90,90,90);  
        
        // Eyes
        canvas.setColor(Color.BLACK);
        canvas.fillOval(40,110,15,15);  
        canvas.fillOval(60,110,15,15);  
        
        // Mouth
        canvas.drawArc(30,130,50,15,180,180);
        
        // Green Legs
        canvas.fillRect(280,350,5,20);
        canvas.fillRect(300,350,5,20);
        
        // Red Legs
        canvas.fillRect(240,335,5,20);
        canvas.fillRect(220,335,5,20);
        
        // Yellow Legs
        canvas.fillRect(140,300,5,20);
        canvas.fillRect(160,300,5,20);
        
        // Magenta Legs
        canvas.fillRect(110,270,5,20);
        canvas.fillRect(90,270,5,20);
        
        // Blue Legs
        canvas.fillRect(70,215,5,20);
        canvas.fillRect(50,215,5,20);
        
        // Hat
        canvas.fillRect(50,225,10,50);
        canvas.fillRect(40,235,10,25);
        canvas.setColor(new Color(102,51,0));
        canvas.fillRect(55,225,3,50);
        
        // Head hair
        canvas.drawArc(55,80,5,15,90,180);
        canvas.drawArc(57,80,5,15,90,190);
        canvas.drawArc(59,80,5,15,90,180);
        canvas.drawArc(61,80,5,15,80,180);
        canvas.drawArc(63,80,5,15,90,180);
        canvas.drawArc(65,80,5,15,90,180);
        canvas.drawArc(67,80,5,15,90,180);
        canvas.drawArc(69,81,5,15,70,170);
        canvas.drawArc(71,81,5,15,85,190);
        canvas.drawArc(73,81,5,15,95,170);
    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Caterpillar frame = new Caterpillar() ;
        frame.setSize(500,500) ;
        frame.setTitle("Caterpillar") ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make the picture visible
        frame.setVisible(true) ;
        
    }
}
