import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Scene {
    private int row;
    private int col;
    private BufferedImage image;
    private boolean moveNorth;
    private boolean moveEast;
    private boolean moveSouth;
    private boolean moveWest;
    private String description;

    public Scene(int row, int col, String filename, boolean moveNorth, boolean moveEast, boolean moveSouth, boolean moveWest, String description){
       this.row = row;
       this.col = col;
       this.moveNorth = moveNorth;
       this.moveEast = moveEast;
       this.moveSouth = moveSouth;
       this.moveWest = moveWest;
       this.description = description;

       // load in an image
       // start off saying "no image present"
        this.image = null;
        // try to use ImageIO to load the image
        try{
            this.image = ImageIO.read(new File(filename));
        }catch(Exception e){
            // print out any errors
            e.printStackTrace();
        }
    }


    public int getRow(){
        return this.row;
    }

    public int getCol(){
        return this.col;
    }

    public BufferedImage getImage(){
        return this.image;
    }

    public boolean canMoveNorth(){
       return this.moveNorth;
    }

    public boolean canMoveEast(){
       return this.moveEast;
    }

    public boolean canMoveSouth(){
        return this.moveSouth;
    }

    public boolean canMoveWest(){
        return this.moveWest;
    }

    public String getDescription(){
        return this.description;
    }
}
