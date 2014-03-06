/**
 * This program takes the red, green, and blue values
 * of a rectangle and prints them out
 */
package p3;

import javax.swing.JApplet;
import java.awt.*;

/**
 * @author Lawrence
 *  Student # A00780938
 *  Set 1A
 */

public class ColorsInJava extends JApplet
{

    private static final long serialVersionUID = 1L;
    
    //Declare constants
    final int PAGE_WIDTH = 600;
    final int PAGE_HEIGHT = 400;
    final int RECT1XY = 0;  //White rectangle coordinates
    final int RECT2X = 200; //2nd rectangle x coordinate
    final int RECT2Y = 125; //2nd rectangle y coordinate
    final int RECT2_WIDTH = 200;    //2nd rectangle width
    final int RECT2_HEIGHT = 150;   //2nd rectangle height
    final int TEXTX = 200;  //Text x coordinate
    final int RTEXT_HEIGHT = 150;   //Red value text y coordinate
    final int GTEXT_HEIGHT = 175;   //Green value text y coordinate
    final int BTEXT_HEIGHT = 200;   //Blue value text y coordinate

    public void paint(Graphics page) 
    {
        
        //Declare variables
        //x and y coordinates of the upper left-corner of each shape
        int x, y;
        //width and height of each shape
        int width, height;
        //I took the value (65280) from the lab manual
        int colourvalue = 65280;
                
        Color myColor = new Color(colourvalue);
        
        //Set the background colour and paint the screen with a white rectangle
        setBackground(Color.white);
        page.setColor(Color.white);
        page.fillRect(RECT1XY, RECT1XY, PAGE_WIDTH, PAGE_HEIGHT);
        
        //Set the color for the rectangle
        page.setColor(myColor);
        
        //Assign the corner point and width and height then draw
        x = RECT2X;
        y = RECT2Y;
        width = RECT2_WIDTH;
        height = RECT2_HEIGHT;
        page.fillRect(x, y, width, height);
        
        int rValue = myColor.getRed();      //To get red value
        int gValue = myColor.getGreen();    //To get green value
        int bValue = myColor.getGreen();    //To get blue value
        
        //Colour to black, then draws the rgb values in the rectangle
        page.setColor(Color.black);
        page.drawString("Red: " + rValue, TEXTX, RTEXT_HEIGHT);
        page.drawString("Green: " + gValue, TEXTX, GTEXT_HEIGHT);
        page.drawString("Blue: " + bValue, TEXTX, BTEXT_HEIGHT);
        
    }

}
