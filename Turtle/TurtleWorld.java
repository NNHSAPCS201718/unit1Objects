import java.awt.Color;

public class TurtleWorld
{
    public static void main(String args[])
    {
        /*
         * Variables store values to be used later.
         *      Variables have a type (int), a name (width), and a value (1000)
         */
        int width;      // declaring a variable
        width = 1000;   // defining (or assigning) a variable
        
        int height = 100;   // you can decalare and define at the same time
        
        /*
         * Objects are entities in a program.
         *      Objects have properties (attributes).
         *      Objects are manipulated by invoking methods.
         * 
         * turtleWorld and crush reference objects
         * 
         * Classes describe a collection of objects.
         *      All objects of a class have the same behavior (methods)
         *      and have the same types of properties (but may have different values)
         *      
         * World and Turtle are classes
         */
        World turtleWorld = new World();
        Turtle crush = new Turtle(turtleWorld);
        crush.setPenColor(Color.RED);
        crush.penDown();
        crush.forward(50);
    }
}
