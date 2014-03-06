/**
 * This program draws a pie chart
 */
package p2;

import javax.swing.JApplet;
import java.awt.*;

/**
 * @author Lawrence
 *  Student # A00780938
 *  Set 1A
 */

public class PieChart extends JApplet
{

    private static final long serialVersionUID = 1L;

    //Draws a pie chart
    public void paint(Graphics page) 
    {
        
        final int CHARTXY = 75; //X and y coordinates of the chart
        final int CHART_SIZE = 100; //Size of the chart
        
        final int RENT_START = 0;   //Start angle of rent section
        final int RENT_ANG = 126;   //Size angle of rent section
        
        final int TRANS_START = 126;    //Start angle of transportation section
        final int TRANSFOOD_ANG = 54;   //Size of angle of trans and food section
        
        final int FOOD_START = 180; //Start angle of food section
        
        final int EDU_START = 234;  //Start angle of education section
        final int EDU_ANG = 90; //Size of angle of education section
        
        final int MISC_START = 324; //Start angle of misc section
        final int MISC_ANG = 36;    //Size of angle of misc section
        
        final int RSTRINGX = 150;    //Rent string x coordinate
        final int RSTRINGY = 70;    //Rent string y coordinate
        
        final int TSTRINGX = 0; //Trans string x coordinate
        final int TSTRINGY = 100;   //Trans string y coordinate
        
        final int FSTRINGX = 45;    //Food string x coordinate
        final int FSTRINGY = 140;   //Food string y coordinate
        
        final int ESTRINGX = 100;   //Education string x coordinate
        final int ESTRINGY = 185;   //Education string y coordinate
        
        final int MSTRINGX = 175;   //Misc string x coordinate
        final int MSTRINGY = 140;   //Misc string y coordinate

        //Rent
        page.setColor(Color.red);
        page.fillArc (CHARTXY, CHARTXY, CHART_SIZE, CHART_SIZE, RENT_START, RENT_ANG);
        
        //Transportation
        page.setColor(Color.blue);
        page.fillArc(CHARTXY, CHARTXY, CHART_SIZE, CHART_SIZE, TRANS_START, TRANSFOOD_ANG);
        
        //Food
        page.setColor(Color.green);
        page.fillArc(CHARTXY, CHARTXY, CHART_SIZE, CHART_SIZE, FOOD_START, TRANSFOOD_ANG);
        
        //Education
        page.setColor(Color.pink);
        page.fillArc(CHARTXY, CHARTXY, CHART_SIZE, CHART_SIZE, EDU_START, EDU_ANG);
        
        //Miscellaneous
        page.setColor(Color.cyan);
        page.fillArc(CHARTXY, CHARTXY, CHART_SIZE, CHART_SIZE, MISC_START, MISC_ANG);
        
        page.setColor(Color.black);
        page.drawString("Rent and utilities", RSTRINGX, RSTRINGY);
        page.drawString("Transportation", TSTRINGX, TSTRINGY);
        page.drawString("Food", FSTRINGX, FSTRINGY);
        page.drawString("Education", ESTRINGX, ESTRINGY);
        page.drawString("Miscellaneous", MSTRINGX, MSTRINGY);
        

    }

}
