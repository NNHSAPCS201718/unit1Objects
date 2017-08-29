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
        
        /*
         * We use the new operator to construct (create) an object.
         *  The class of the object is specified immediately after the
         *      new operator (e.g., Turtle).
         *  If we have to pass additional information to create the object,
         *      arguments are specified in parentheses after the class
         *      (e.g., turtleWorld).
         *  A reference to the newly created object is returned by the
         *      new operator.
         */
        Turtle crush = new Turtle(turtleWorld);
        
        /*
         * When invoking methods, we use the dot operator to invoke a method
         *      on an object.
         *  Some methods, take no arguments, but we still hav eparentheses
         *      (e.g., penDown).
         *  Some methods take one or more arguments (e.g., forward).
         *  
         *  Mutator methods modify the state (i.e., properties) of the object.
         *      setPenColor, penDown, forward are all mutator methods
         */
        crush.setPenColor(Color.RED);
        crush.penDown();
        crush.forward(50);
        crush.setPenWidth(width);
        
        /*
         * Accessor methods return the value of a property of the object.
         *  The state of the object does not change.
         *  In general, accessor methods start with "get" and return values.
         *  
         *  getHeading is an accessor method
         */
        double heading = crush.getHeading();
    }
}



