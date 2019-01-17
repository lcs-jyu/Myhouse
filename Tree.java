
/**
 * Creates an instance of a Tree.
 *
 * @author J.Yu
 * @version January 15, 2019
 */
public class Tree
{
    // instance variables - replace the example below with your own
    private Square trunk;
    private Triangle leaf;
    private Triangle leaf2;
    

    /**
     * Constructor for objects of class Tree
     * 
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public Tree(int x, int y)
    {
        // initialise instance variables
        trunk = new Square();
        leaf = new Triangle();
        leaf2 = new Triangle();
        
        
        // actually draw the tree
        drawTree(x, y);
    }

    /**
     * Draws the tree
     *
     * @param x     the horizontal position of the tree
     * @param y     the vertical position of the tree
     */
    public void drawTree(int x, int y)
    {
        // position the trunk
        trunk.makeVisible();
        trunk.moveHorizontal(50);
        trunk.moveVertical(400);
        trunk.changeColor("black");
        trunk.changeSize(20);
        trunk.moveHorizontal(5);
        
        // move into the position
        trunk.moveHorizontal(x);
        trunk.moveVertical(y);
       
        //position the leaf
        leaf.makeVisible();
        leaf.changeColor("green");
        leaf.moveVertical(400);
        leaf.changeSize(40, 40);
        leaf.moveHorizontal(40);
        leaf.moveRight();
        leaf.moveHorizontal(15);
        leaf.moveVertical(5);
        
        // move into the position
        leaf.moveHorizontal(x);
        leaf.moveVertical(y);
        
        
        //position of second leaf
        leaf2.makeVisible();
        leaf2.changeColor("green");
        leaf2.moveVertical(400);
        leaf2.changeSize(40, 40);
        leaf2.moveHorizontal(30);
        leaf2.moveVertical(-10);
        leaf2.moveHorizontal(45);
        
        // move into the position
        leaf2.moveHorizontal(x);
        leaf2.moveVertical(y);
        
        
        
       
        
        
        
        
        
        
        
        
     
        
        
        
        
       
        
        
     
        
        
        
        
    }
    
}