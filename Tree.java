/**
 * Tree.java - Draw a tree
 * Author:            Ethan Grant
 * Module:     2
 * Project:    Homework 2 - Four Graphics
 * 
 * Problem Statment: Draw an original picture, in this case a tree.
 * 
 * Algorithim: 
 * 1. Set up constants for the title,height, and width of the Jframe.
 * 2. Create the JFrame and set its size, title, close operation, 
 *    and location and make the picture visible. 
 * 3. Draw the trunk.
 * 4. Draw the bottom row leaves.
 * 5. Draw the middle row leaves.
 * 6. Draw the top row leaves.
 * 7. Draw the ground.
 * 8. Compile and test.
 */

import java.awt.Color ;
import java.awt.Graphics ;
import javax.swing.JFrame ;

public class Tree extends JFrame {

    // Set up constants for the title, height, and width of the JFrame
    final static String TITLE = "(Tree)" ;
    final static int WIDTH = 1000,           // width of JFrame (including borders)
                     HEIGHT = 1000 ;         // height of JFrame (borders and controls)
                     
    public void paint(Graphics canvas) {
        // The Trunk
        canvas.setColor(new Color(102,51,0));
        canvas.fillRect(250, 250, 100, 200) ;
        
        // Bottom Row Leaves
        canvas.setColor(Color.GREEN);
        canvas.fillOval(250,160,100,100);  
        canvas.fillOval(300,160,100,100);
        canvas.fillOval(200,160,100,100); 
        canvas.fillOval(200,160,100,100);
        canvas.fillOval(350,160,100,100);
        canvas.fillOval(150,160,100,100);
        
        // Middle Row Leaves
        canvas.fillOval(250,100,100,100);  
        canvas.fillOval(300,100,100,100);  
        canvas.fillOval(200,100,100,100);  
        
        // Top Row Leaf
        canvas.fillOval(250,40,100,100);  
        
        // Ground
        canvas.setColor(new Color(0,153,0));
        canvas.fillRect(175,450,250,20);
    }

    public static void main(String[] args) {

        // Create the JFrame and set its size, title, close operation, and location.
        Tree frame = new Tree() ;
        frame.setSize(500,500) ;
        frame.setTitle("Tree") ;                     // set the title in upper-left corner
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;       // close when X is clicked
        frame.setLocationRelativeTo(null) ;         // center JFrame on user's screen

        // Make the picture visible
        frame.setVisible(true) ;
        
    }
}
