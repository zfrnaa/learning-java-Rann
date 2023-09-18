import java.util.Scanner;
class Calculators
{
    public void add(int n1, int n2)
    {
        int addition = n1 + n2;
        System.out.println("Here is your result of adding: " + addition);
    }

    public void multiply(int n1, int n2)
    {
        int multiplication = n1 * n2;
        System.out.println("Here is your result of multiplication: " + multiplication);
    }

    public void divide(double n1, double n2)
    {
        double division = n1/n2;
        System.out.println("Here is your result of division: " + division);
    }

    public void modulo(double n1, double n2)
    {
        double modulating = n1 % n2;
        System.out.println("Here is your result of modulo: " + modulating);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Here is your calculation for each operation\n");

        int num1 = 4;
        int num2 = 5;

        Calculators calc = new Calculators();

        Scanner input = new Scanner(System.in);
        System.out.println("Select the operation:\n");
        System.out.println("1. Addition\n2. Multiply\n3. Division\n4. Modulus");
        System.out.println("5.Exit\n");

        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                calc.add(num1,num2);
                break;
            case 2:
                calc.multiply(num1, num2);
                break;
            case 3:
                calc.divide(num1, num2);
                break;
            case 4:
                calc.modulo(num1, num2);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}