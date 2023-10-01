// Created by zafran - 20202021 q2

class WallPaint
{
    // Represents a wall with its dimensions and paint cost.

    private final WallDimension size; // The dimensions of the wall.
    private final double paintCost; // The cost of the paint per square meter.

    public WallPaint(WallDimension size, double paintCost)
    {
        // Constructs a new WallPaint object with the given dimensions and paint cost.
        this.size = size;
        this.paintCost = paintCost;
    }

    public double getTotalCost()
    {
        // Calculates the total cost to paint the wall.
        double wallArea = size.getWidth() * size.getLength();
        return wallArea * paintCost;
    }

    /*public String toString() {
        // Returns a string representation of the WallPaint object.
        return super.toString();
    }*/
}

class WallDimension
{
    // Represents the dimensions of a wall.

    private double length; // The length of the wall in meters.
    private double width; // The width of the wall in meters.

    public WallDimension(double length, double width)
    {
        // Constructs a new WallDimension object with the given length and width.
        this.length = length;
        this.width = width;
    }

    public double getLength()
    {
        // Returns the length of the wall.
        return length;
    }

    public void setLength(double length)
    {
        // Sets the length of the wall.
        this.length = length;
    }

    public double getWidth()
    {
        // Returns the width of the wall.
        return width;
    }

    public void setWidth(double width)
    {
        // Sets the width of the wall.
        this.width = width;
    }

    public double getArea()
    {
        // Calculates the area of the wall.
        return length * width;
    }
}


public class PaintCalculator
{
    // A tool to calculate the area and total cost to paint a wall.

    public static final String SPACE = "";

    public static void wait(int ms)
    {
        // Prints "ms/1000 s" to the console and waits for milliseconds.
        try
        {
            System.out.print(ms / 1000 + "s");
            Thread.sleep(ms);
        } catch (InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args)
    {
        // Creates a new WallDimension object with dimensions 5 meters by 3 meters.
        WallDimension dim = new WallDimension(5, 3);

        // Creates a new WallPaint object with the given dimensions and a paint cost of 2.5 dollars per square meter.
        WallPaint paint = new WallPaint(dim, 2.5);

        // Stores the original length of the wall in a variable.
        double length = dim.getLength();

        // Sets the length of the wall to 6.5 meters.
        dim.setLength(6.5);

        // Stores the original width of the wall in a variable.
        double width = dim.getWidth();

        // Sets the width of the wall to 4.2 meters.
        dim.setWidth(4.2);

        // Prints a welcome message to the console.
        System.out.println("Welcome to Paint Calculator tool.");
        System.out.println(
                " We will calculate for both area and the total cost to be pay for painting the wall");
        System.out.print("Please wait for ");

        // Indicates to the user that the program is calculating.
        wait(4000);

        // Prints a blank line to the console.
        System.out.println(SPACE);

        // Calculates the area of the wall.
        double area = dim.getArea();

        // Prints the area of the wall to the console.
        System.out.println("The area of the Wall is: " + area);

        // Calculates the total cost to paint the wall.
        double totalCost = paint.getTotalCost();

        // Prints the total cost to paint the wall to the console.
        System.out.println("The total cost for painting the Wall is: " + totalCost);
    }
}
