
/**
 * Creates an instance of a People.
 *
 * @author J.Yu
 * @version January 17, 2019
 */
public class People
{
    // instance variables - replace the example below with your own
    private Circle face;
    private Circle eye;
    private Circle eye2;
    private Triangle nose;
    private Circle mouth ;
    private Square neck;
    private Square tshirt;
    

    /**
     * Constructor for objects of class People
     * 
     * @param x     the horizontal position of the people
     * @param y     the vertical position of the people
     */
    public People(int x, int y)
    {
        // initialise instance variables
        face = new Circle();
        eye = new Circle();
        eye2 = new Circle();
        nose = new Triangle();
        mouth = new Circle();
        neck = new Square();
        tshirt = new Square();
        // actually draw the people
        drawPeople(x, y);
    }

    /**
     * Draws the People
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawPeople(int x, int y)
    {
      // Position the face
      face.makeVisible();
      face.changeColor("yellow");
      face.changeSize(35);
      
       // move into the position
        face.moveHorizontal(x);
        face.moveVertical(y);
      
    
     //position of eye
      eye.makeVisible();
      eye.changeColor("black");
      eye.changeSize(5);
      eye.moveHorizontal(10);
      eye.moveVertical(10);
      
       // move into the position
        eye.moveHorizontal(x);
        eye.moveVertical(y);
      
      //position of eye2
      eye2.makeVisible();
      eye2.changeColor("black");
      eye2.changeSize(5);
      eye2.moveHorizontal(20);
      eye2.moveVertical(10);
      
       // move into the position
        eye2.moveHorizontal(x);
        eye2.moveVertical(y);
      
      //position of nose
      nose.makeVisible();
      nose.changeColor("blue");
      nose.changeSize(5, 10);
      nose.moveHorizontal(-10);
      nose.moveVertical(60);
      nose.moveHorizontal(-2);
      
       // move into the position
        nose.moveHorizontal(x);
        nose.moveVertical(y);
      
      
     //position of mouth
     mouth.makeVisible();
     mouth.changeColor("red");
     mouth.moveHorizontal(15);
     mouth.moveVertical(20);
     mouth.changeSize(8);
     mouth.moveHorizontal(-2);
     
      // move into the position
        mouth.moveHorizontal(x);
        mouth.moveVertical(y);
     
     //position of neck
     neck.makeVisible();
     neck.changeSize(12);
     neck.moveHorizontal(14);
     neck.moveVertical(25);
     neck.moveHorizontal(-40);
     neck.moveVertical(16);
     neck.moveHorizontal(-2);
     neck.changeColor("yellow");
     
      // move into the position
        neck.moveHorizontal(x);
        neck.moveVertical(y);
     
     //position of t-shirt
     tshirt.makeVisible();
     tshirt.moveHorizontal(3);
     tshirt.changeColor("black");
     tshirt.moveVertical(30);
     tshirt.moveHorizontal(-20);
     tshirt.moveVertical(20);
     tshirt.moveHorizontal(-20);
     
      // move into the position
        tshirt.moveHorizontal(x);
        tshirt.moveVertical(y);
    
     
      
      
      
      
      
      
   
        
     }
    }