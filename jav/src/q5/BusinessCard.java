package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * <p>This program creates a "business card." The card displays a company
 * name, my name, address, phone number, fax number, email, website, and 
 * a picture.</p>
 *
 * @author Lawrence Sarmiento, A00780938, Set 1A 
 * @version 1.0
 */
public class BusinessCard extends JFrame {
    
    /**
     * <p>The x position of the Company name.</p>
     */
    private static final int X_POSITION = 50;

    /**
     * <p>The y position of the Company name.</p>
     */
    private static final int Y_POSITION = 20;
    
    /**
     * <P>Width of the business card.</p>
     */
    private static final int CARD_WIDTH = 490;
    
    /**
     * <p>Height of the business card.</p>
     */
    private static final int CARD_HEIGHT = 232;
    
    /**
     * <p>Used for max colour value.</p>
     */
    private static final int COLOUR = 255;
    
    /**
     * <p>X position for text.</p>
     */
    private static final int X_TEXT = 5;
    
    /**
     * <p>Y position for name string.</p>
     */
    private static final int Y_NAME = 50;
    
    /**
     * <p>Y position for address string.</p>
     */
    private static final int Y_ADD = 75;
    
    /**
     * <p>Y position for phone number string.</p>
     */
    private static final int Y_PHONE = 100;
    
    /**
     * <p>Y position for fax string.</p>
     */
    private static final int Y_FAX = 125;
    
    /**
     * <p>Y position for the website string.</p>
     */
    private static final int Y_WEB = 150;
    
    /**
     * <p>Y position for the email string.</p>
     */
    private static final int Y_EMAIL = 175;
    
    /**
     * <p>X position for image.</p>
     */
    private static final int X_IMG = 225;
    
    /**
     * <p>Value used for colour or position.</p>
     */
    private static final int COLPOS = 0;
    
    /**
     * <p>Font size for company name text.</p>
     */
    private static final int COMP_FONT = 16;
    
    /**
     * <p>Font size for the text.</p>
     */
    private static final int TEXT_FONT = 11;

    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public BusinessCard() {
        
        super("Lawrence Sarmiento");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(CARD_WIDTH, CARD_HEIGHT);
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class BusinessCardPanel extends JPanel {

        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        private Image img;

        /**
         * <p>The default contructor that retreives an image to draw.</p>
         */
        public BusinessCardPanel() {
            // NOTE: IF YOU ADD AN IMAGE YOU NEED TO LEAVE 'q5' IN THE STRING!
            img = new ImageIcon(BusinessCardPanel.class.getResource(
                "/q5/supa.gif")).getImage();
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(new Color(COLPOS, COLPOS, COLOUR));
            g.setColor(new Color(COLOUR, COLOUR, COLOUR));
            g.setFont(new Font("Arial", Font.BOLD, COMP_FONT));
            g.drawString("LawSar Inc.", X_POSITION, Y_POSITION);
            g.setFont(new Font("Arial", Font.PLAIN, TEXT_FONT));
            g.drawString("Lawrence Sarmiento", X_TEXT, Y_NAME);
            g.drawString("Address: 3700 Willingdon Ave "
                    + "Burnaby, BC", X_TEXT, Y_ADD);
            g.drawString("Phone: 604-555-5555", X_TEXT, Y_PHONE);
            g.drawString("Fax: 604-111-1111", X_TEXT, Y_FAX);
            g.drawString("Website: www.LawSar.ca", X_TEXT, Y_WEB);
            g.drawString("Email: Sendmestuff@Gmail.com", X_TEXT, Y_EMAIL);
            g.drawImage(img, X_IMG, COLPOS, this);
        }
    }

    /** 
     * <p>Main method.</p>
     * @param args command line arguments
     */
    public static void main(String[] args) {
        
        new BusinessCard();
    }

};
