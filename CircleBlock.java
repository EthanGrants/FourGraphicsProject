/**
 * CircleBlock.java - Draw a circle inside a square
 * Author:            Ethan Grant
 * Module:     2
 * Project:    Homework 2 - Four Graphics
 * 
 * Problem Statment: Write a graphics program to display a square 
 * containing a circle. Make the diameter of the circle and the length of the square’s side equal,
 * so that the circle just touches each side of the square. Use one color to fill the circle, and 
 * another color for the part of the square not covered by the circle and draw 
 * a two line border around the image.
 * 
 * Algorithim: 
 * 1. Set up constants for the title,height, and width of the Jframe.
 * 2. Create the JFrame and set its size, title, close operation, 
 *    and location and make the picture visible. 
 * 3. Draw the square
 * 4. Draw the circle
 * 5. Draw the border
 * 6. Compile and test.
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class CircleBlock extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "(Circle Inside Block)" ;
    final static int WIDTH = 1000,           // width of JFrame (including borders)
                     HEIGHT = 1000 ;         // height of JFrame (borders and controls)

    public void paint(Graphics canvas) {
        // Square
        canvas.setColor(Color.BLUE.darker()) ;
        canvas.fillRect(250, 250, 300, 300) ;
        
        // Circle
        canvas.setColor(Color.YELLOW);
        canvas.fillOval(250,250,300,300);
        
        // Border
        canvas.setColor(Color.BLACK);
        canvas.drawRect(240,240,320,320);
        canvas.drawRect(235,235,330,330);
        
    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        CircleBlock frame = new CircleBlock() ;
        frame.setSize(500,500) ;
        frame.setTitle("Circle Inside Block") ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make the picture visible
        frame.setVisible(true) ;
        
    }
}
