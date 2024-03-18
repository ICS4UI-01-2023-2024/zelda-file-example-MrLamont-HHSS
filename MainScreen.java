import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

/**
* Creates the main screen that displays everything
* @author Mr. Lamont
*/
public class MainScreen extends JFrame implements ActionListener{

  // instance variables
  private JPanel mainPanel;
  private JPanel southPanel;
  private JButton northButton;
  private JButton eastButton;
  private JButton southButton;
  private JButton westButton;
  private JTextField infoText;
  private PicturePanel picturePanel;

  private Controller controller;


  /**
  * Constructor for the main screen
  */
  public MainScreen(){
    initializeComponents();


  }
  
  
  


  /**
  * Create and add all parts to the screen
  */
  private void initializeComponents(){
    // set the frame size
    this.setSize(800, 600);
    // make the x button work
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    // create the main panel with a border layout
    this.mainPanel = new JPanel();
    this.mainPanel.setLayout(new BorderLayout());

    // make the buttons
    this.northButton = new JButton("NORTH");
    this.northButton.addActionListener(this);
    this.northButton.setActionCommand("moveNorth");

    this.eastButton = new JButton("EAST");
    this.eastButton.addActionListener(this);
    this.eastButton.setActionCommand("moveEast");

    this.southButton = new JButton("SOUTH");
    this.southButton.addActionListener(this);
    this.southButton.setActionCommand("moveSouth");

    this.westButton = new JButton("WEST");
    this.westButton.addActionListener(this);
    this.westButton.setActionCommand("moveWest");

    // create the text field
    this.infoText = new JTextField();

    // create south panel with grid layout
    this.southPanel = new JPanel();
    this.southPanel.setLayout(new GridLayout(2,1));

    // make picture panel
    this.picturePanel = new PicturePanel();

    // assmble the GUI
    this.southPanel.add(this.southButton);
    this.southPanel.add(this.infoText);

    this.mainPanel.add(this.northButton, BorderLayout.PAGE_START);
    this.mainPanel.add(this.eastButton, BorderLayout.LINE_END);
    this.mainPanel.add(this.southPanel, BorderLayout.PAGE_END);
    this.mainPanel.add(this.westButton, BorderLayout.LINE_START);
    this.mainPanel.add(this.picturePanel, BorderLayout.CENTER);

    // add the main panel into the frame
    this.add(this.mainPanel);
    // make the window visible
    this.setVisible(true);
    

    
  
  }



  /** 
  * The method called when a button is pressed
  * @param e The actionEvent created from the button press
  */
  public void actionPerformed(ActionEvent e){
    // determine the action command
    String command = e.getActionCommand();
   

    // doing the correct movement
    if(command.equals("moveNorth")){
     
    }else if(command.equals("moveEast")){
      
    }else if(command.equals("moveSouth")){
      
    }else if(command.equals("moveWest")){
      
    }



  }




}
