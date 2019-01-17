
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
    private Triangle mouth;
    

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
        mouth = new Triangle();
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
      
      
      
    
     //position of eye
      eye.makeVisible();
      eye.changeColor("black");
      eye.changeSize(5);
      eye.moveHorizontal(10);
      eye.moveVertical(10);
      
      //position of eye2
      eye2.makeVisible();
      eye2.changeColor("black");
      eye2.changeSize(5);
      eye2.moveHorizontal(20);
      eye2.moveVertical(10);
      
      //position of nose
      nose.makeVisible();
      nose.changeColor("blue");
      nose.changeSize(5, 10);
      nose.moveHorizontal(-10);
      nose.moveVertical(60);
      nose.moveHorizontal(-2);
      
      
      
      
      
      
   
        
     }
    }