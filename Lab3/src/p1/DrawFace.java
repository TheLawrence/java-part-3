/**
 * This program draws a face
 */
package p1;

import javax.swing.JApplet;
import java.awt.*;

/**
 * @author Lawrence
 *  Student # A00780938
 *  Set 1A
 */

public class DrawFace extends JApplet
{

    private static final long serialVersionUID = 1525447378794347555L;
        
    public void paint (Graphics page) 
    {      
        
        //Face
        final int CNTR = 50;
        final int MID = 75;
        final int SIZE1 = 100;
        
        //Eyes
        final int EYE1 = CNTR + 20;
        final int EYE2 = CNTR + 60;
        
        //Eye level
        final int EYE_HEIGHT = MID + 20;
        
        //Eye size
        final int SIZE2 = 20;
        
        //Ears
        final int L_EAR = CNTR - 20; //Left
        final int R_EAR = CNTR + 70; //Right
        //Ear dimensions
        final int EAR1 = 50;
        final int EAR2 = 25;
        final int EAR3 = 30;
        final int EAR4 = 15;
        final int IN_EAR1 = CNTR - 15;  //Left inner ear
        final int IN_EAR2 = CNTR + 85;  //Right inner ear
        final int IN_EAR_HEIGHT = EYE_HEIGHT + 10;
        
        //Pupils
        final int PUP1 = EYE1+8;
        final int PUP2 = EYE2+8;
        final int PUP_HEIGHT = IN_EAR_HEIGHT;
        final int PUP_SIZE = 5;
        
        //Nose
        final int NOSEX = CNTR + 27;
        final int NOSEY = MID + 50;
        final int N_SIZE1 = 45;
        final int N_SIZE2 = 20;
        
        //Smile
        final int SMEX = CNTR + 38;
        final int SMEY = MID + 75;
        final int S1 = 20;
        final int S2 = 10;
        final int S3 = 190;
        final int S4 = 175;
                
        
        //Left ear
        page.setColor(Color.black);                        
        page.fillOval(L_EAR, EYE_HEIGHT, EAR1, EAR2);
        
        //Left inner ear
        page.setColor(Color.pink);                         
        page.fillOval(IN_EAR1, IN_EAR_HEIGHT, EAR3, EAR4);
        
        //Right ear
        page.setColor(Color.black);                        
        page.fillOval(R_EAR, EYE_HEIGHT, EAR1, EAR2);
        
        //Right inner ear
        page.setColor(Color.pink);                         
        page.fillOval(IN_EAR2, IN_EAR_HEIGHT, EAR3, EAR4);
        
        //Face
        page.setColor(Color.black);                        
        page.fillOval(CNTR, MID, SIZE1, SIZE1);
        
        //Left eye
        page.setColor(Color.white);                        
        page.fillOval(EYE1, EYE_HEIGHT, SIZE2, SIZE2);
        
        //Right eye
        page.setColor(Color.white);                        
        page.fillOval(EYE2, EYE_HEIGHT, SIZE2, SIZE2);
        
        //Left pupil
        page.setColor(Color.black);                        
        page.fillOval(PUP1, PUP_HEIGHT, PUP_SIZE, PUP_SIZE);
        
        //Right pupil
        page.setColor(Color.black);                       
        page.fillOval(PUP2, PUP_HEIGHT, PUP_SIZE, PUP_SIZE);
        
        //Nose
        page.setColor(Color.pink);                         
        page.fillOval(NOSEX, NOSEY, N_SIZE1, N_SIZE2);
        
        //Smile
        page.setColor(Color.pink);                          
        page.fillArc(SMEX, SMEY, S1, S2, S3, S4);
        

    }

}