
/**
 * It draws a complete house on screen using individual shapes.
 *
 * @author J.Yu
 * @version January 10 
 */
public class MyHouse
{
    // instance variables - replace the example below with your own
    // ACCESS-MODIFIER TYPE NAME
    private Circle sun;
    private Triangle roof;
    private Square base;
    private Square window;
    private Square door;
    private Circle handle;
    private Square window2;
    private Square window3;
    private Tree tree1;
    private Tree tree2;
    private Tree tree3;
    private Tree tree4;
    private Tree tree5;
    private People people1;
    private People people2;
    private People people3;
    private People people4;
    private People people5;
    
    
 

    /**
     * The job of a constructer is to initialize all the instance variables.
     */
    public MyHouse()
    {
        // initialise instance variables
        sun = new Circle();
        roof = new Triangle();
        base = new Square();
        window = new Square();
        door = new Square();
        handle = new Circle();
        window2 = new Square();
        window3 = new Square();
        tree1 = new Tree(150,-200);
        tree2 = new Tree(250,-200);
        tree3 = new Tree(300,-200);
        tree4 = new Tree(350,-200);
        tree5 = new Tree(200,-200);
        people1 = new People(200,150);
        people2 = new People(30,100);
        people3 = new People(25,150);
        people4 = new People(50,200);
        people5 = new People(90,200);
        
        
        
        
        // run the method to draw the house
        drawHouse();
        
  
 
    }

    /**
     * Draw the house for us.
     */
   
    public void drawHouse()
    {
        // put the base of the house in position
        base.makeVisible();
        base.changeSize(140);
        base.moveDown();
        base.moveDown();
        base.moveDown();
        base.moveHorizontal(20);
        base.changeColor("green");
       
        // put the roof of the house in position
        roof.makeVisible();
        roof.moveHorizontal(50);
        roof.changeSize(80, 140);
        roof.moveRight();
        roof.moveHorizontal(-15);
        roof.moveVertical(10);
        roof.changeColor("red");
        roof.moveHorizontal(45);
        roof.moveVertical(6);
        
        
        //put a window on the base
        window.makeVisible();
        window.moveHorizontal(80);
        window.moveVertical(150);
        window.changeSize(35);
        window.moveLeft();
        window.moveHorizontal(10);
        window.moveVertical(-65);
        window.changeColor("blue");
        window.moveRight();
        window.moveHorizontal(5);
       
        
        //put a door on the base
        door.makeVisible();
        door.moveHorizontal(60);
        door.changeColor("Black");
        door.moveVertical(150);
        door.moveHorizontal(5);
        door.changeSize(50);
        
        //put a handle on the door
        handle.makeVisible();
        handle.moveHorizontal(130);
        handle.changeColor("white");
        handle.moveVertical(150);
        handle.changeSize(7);
        handle.moveHorizontal(10);
        handle.moveVertical(10);
        
        //put a sun on the left side of the canvas
        sun.makeVisible();
        sun.moveHorizontal(100);
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-50);
        sun.changeSize(30);
        sun.moveRight();
        sun.moveRight();
        sun.moveRight();
        sun.changeSize(80);
        sun.moveLeft();
        sun.moveUp();
        sun.moveLeft();
        sun.moveHorizontal(20);
        
        //put details on the window 1
        
        window2.makeVisible();
        window2.moveHorizontal(70);
        window2.moveVertical(40);
        window2.changeColor("white");
        window2.changeSize(20);
        window2.moveHorizontal(40);
        window2.moveVertical(50);
        window2.changeSize(14);
        window2.moveHorizontal(3);
        
        
   
        
       
        
        
        
        
        
        
       
        
       
       
      
        
        
        
      
        
    
       

        
    }
}
