class WallPaint {
    private WallDimension size;
    private double paintCost;

    public WallPaint(WallDimension size, double paintCost) {
        this.size = size;
        this.paintCost = paintCost;
    }

    public double getTotalCost() {
        double wallArea = size.getWidth() * size.getLength();
        return wallArea * paintCost;
    }

    /*public String toString() {
        return super.toString();
    }*/
}

class WallDimension {
    private double length;
    private double width;

    public WallDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}


public class PaintCalculator {
    public static void main (String [] args)
    {
        WallDimension dim = new WallDimension(5, 3);
        WallPaint paint = new WallPaint(dim, 2.5);

        double length = dim.getLength();
        dim.setLength(6.5);

        double width = dim.getWidth();
        dim.setWidth(4.2);

        System.out.print("\nWelcome to Paint Calculator tool.");
        System.out.println(" We will calculate for both area and the total cost to be pay for painting the wall");
        System.out.println("Please wait for a moment");
        System.out.println("");
        double area = dim.getArea();
        System.out.println("The area of the Wall is: "+ area);

        double totalCost = paint.getTotalCost();
        System.out.println("The total cost for painting the Wall is: "+ totalCost);
    }
}