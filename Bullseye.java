/**
 * Bullseye.java - Draw a bullseye
 * Author:            Ethan Grant
 * Module:     2
 * Project:    Homework 2 - Four Graphics
 * 
 * Problem Statment: Write a program that displays a bulls-eye pattern with a circle in the middle and five 
 * (5) concentric circles around it. 
 * 
 * Algorithim: 
 * 1. Set up constants for the title,height, and width of the Jframe.
 * 2. Create the JFrame and set its size, title, close operation, 
 *    and location and make the picture visible. 
 * 3. Alternate the following the circles with red then yellow.
 * 4. Draw the outer circle #5
 * 5. Draw the outer circle #4
 * 6. Draw the outer cicle #3
 * 7. Draw the outer circle #2
 * 8. Draw the outer circle #1
 * 9. Draw the circle
 * 10.Compile and test.
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Bullseye extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "(Bullseye)" ;
    final static int WIDTH = 1000,           // width of JFrame (including borders)
                     HEIGHT = 1000 ;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) {
        // Outer Circle #5
        canvas.setColor(Color.RED);
        canvas.fillOval(200,200,150,150);
        
        // Outer Circle #4
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(210,210,130,130);
        
        // Outer Circle #3
        canvas.setColor(Color.RED);
        canvas.fillOval(220,220,110,110);
        
        // Outer Circle #2
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(230,230,90,90);
        
        // Outer Circle #1
        canvas.setColor(Color.RED);
        canvas.fillOval(240,240,70,70);
        
        // Circle
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(250,250,50,50);
       
       
    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Bullseye frame = new Bullseye() ;
        frame.setSize(500,500) ;
        frame.setTitle("Bullseye") ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make the picture visible
        frame.setVisible(true) ;
        
    }
}
