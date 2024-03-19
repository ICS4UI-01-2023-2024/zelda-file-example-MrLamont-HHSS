import java.io.File;
import java.util.Scanner;
import java.awt.image.BufferedImage;

public class Map {
    private Scene[] scenes;
    private int currentRow;
    private int currentCol;
    private Scene currentScene;

    public Map(String filename){
        // create the Scanner for text input
        Scanner input = null;
        try{
            input = new Scanner(new File(filename));
        }catch(Exception e){
            // print any errors
            e.printStackTrace();
        }
        // get the size of the map
        int numRows = input.nextInt();
        // move down a row
        input.nextLine();
        int numCols = input.nextInt();
        input.nextLine();

        // scan in the starting position
        this.currentRow = input.nextInt();
        input.nextLine();
        this.currentCol = input.nextInt();
        input.nextLine();

        // create the array to store the Scenes
        this.scenes = new Scene[numRows*numCols];
        // scan in and store each Scene
        for(int i = 0; i < this.scenes.length; i++){
            // image file name
            String imageFile = input.next();
            // can move directions
            boolean north = input.nextBoolean();
            boolean east = input.nextBoolean();
            boolean south = input.nextBoolean();
            boolean west = input.nextBoolean();
            // description text (maybe) and move down
            String description = input.nextLine();

            // get the data from the image filename
            // remove the .png from the filename
            String dataString = imageFile.replace(".png","");
            // break up the data based on the dashes
            String[] data = dataString.split("-");
            // recovering the row and col
            int row = Integer.parseInt(data[1]);
            int col = Integer.parseInt(data[3]);

            // make the scene and store it!
            Scene s = new Scene(row,col,imageFile,north,east,
                                    south,west,description);
            this.scenes[i] = s;

            // set the current scene if found
            if(row == this.currentRow && 
                                    col == this.currentCol){
                this.currentScene = this.scenes[i];
            }
        }
    }

    public Scene findScene(int row, int col){
        // go through each scene
        for(int i = 0; i < this.scenes.length; i++){
            // grab a scene to look at
            Scene s = this.scenes[i];
            // does it match the row and col?
            if(s.getRow() == row && s.getCol() == col){
                // found it so return it
                return s;
            }
        }
        // didn't find a scene matching that row or col
        return null;
    }

    private void updateScene(){
        //update the current scene
        this.currentScene = findScene(currentRow, currentCol);
    }

    public void moveNorth(){
        // can we move north?
        if(this.currentScene.canMoveNorth()){
            // move row up
            this.currentRow--;
            updateScene();
        }
    }

    public void moveEast(){
        // can we move East?
        if(this.currentScene.canMoveEast()){
            // move right
            this.currentCol++;
            updateScene();
        }
    }

    public void moveSouth(){
        // can we move north?
        if(this.currentScene.canMoveSouth()){
            // move row down
            this.currentRow++;
            updateScene();
        }
    }

    public void moveWest(){
        // can we move West?
        if(this.currentScene.canMoveWest()){
            // move left
            this.currentCol--;
            updateScene();
        }
    }

    public BufferedImage getImage(){
        return this.currentScene.getImage();
    }

    public String getDescription(){
        return this.currentScene.getDescription();
    }

}
