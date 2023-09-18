import java.util.Scanner;

public class TestInput {

    public static void main(String[] args)
    {
        //Create a scanner object
        Scanner input = new Scanner(System.in);

        //Prompt the user to enter a value of radius
        System.out.println("Enter a number for radius: ");
        double radius = input.nextDouble();

        //Compute area
        double area = radius * radius * 3.14159;

        //display result
        System.out.println("The area for the circle of radius " + radius + " is " + area);
    }

}
