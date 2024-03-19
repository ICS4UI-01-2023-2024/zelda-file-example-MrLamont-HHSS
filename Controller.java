import java.awt.image.BufferedImage;

public class Controller {
    
    private MainScreen screen;
    private Map map;

    public Controller(MainScreen screen, String mapFilename){
        this.screen = screen;
        this.map = new Map(mapFilename);
        this.screen.updateScreen(this.map.getImage(), this.map.getDescription());
    }

    public void moveNorth(){
        this.map.moveNorth();
        this.screen.updateScreen(this.map.getImage(), this.map.getDescription());
    }

    public void moveEast(){
        this.map.moveEast();
        this.screen.updateScreen(this.map.getImage(), this.map.getDescription());
    }

    public void moveSouth(){
        this.map.moveSouth();
        this.screen.updateScreen(this.map.getImage(), this.map.getDescription());
    }

    public void moveWest(){
        this.map.moveWest();
        this.screen.updateScreen(this.map.getImage(), this.map.getDescription());
    }


    
}
