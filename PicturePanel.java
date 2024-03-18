import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JComponent;

/**
 * A custom JComponent to paint a picture to the screen
 * @author Mr. Lamont
 */
public class PicturePanel extends JComponent {

    // holds the image
    private BufferedImage image;

    /**
    * Sets the image to be displayed inside of the panel
    * @param img The BufferedImage to show on the pannel
    */
    public void setImage(BufferedImage img) {
        this.image = img;
        // asks the panel to redraw itself
        repaint();
    }

    /**
    * The paint command that is called automatically when showing the panel (not called directly)
    * @param g The graphics object used to paint
    */    
    public void paintComponent(Graphics g) {
    	if(this.image != null){
            g.drawImage(this.image, 0, 0, this.getWidth(), this.getHeight(), null);
        }else{
            g.setColor(Color.BLACK);
            g.fillRect(0, 0, this.getWidth(), this.getHeight());
        }
    }
}
