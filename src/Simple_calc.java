//created by zafran - simple exercise of calculation modules and input

import java.util.Scanner;

class Calculator_v2
{
    public void add(int n1, int n2)
    {//addition two number
        int addition = n1 + n2;
        System.out.println("Here is your result of adding: " + addition);
    }

    public void multiply(int n1, int n2)
    {//multiplication two number
        int multiplication = n1 * n2;
        System.out.println("Here is your result of multiplication: " + multiplication);
    }

    public void divide(double n1, double n2)
    {//division two number
        double division = n1 / n2;
        System.out.println("Here is your result of division: " + division);
    }

    public void modulo(double n1, double n2)
    {//find remainder two number
        double modulating = n1 % n2;
        System.out.println("Here is your result of modulo: " + modulating);
    }
}

public class Simple_calc
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Here is your calculation for each operation\n");
        //newline with "\n" after the message

        //initialize value
        int num1 = 4;
        int num2 = 5;

        // object calc
        Calculator_v2 calc = new Calculator_v2();

        //scanner object with input as name
        Scanner input = new Scanner(System.in);
        System.out.println("Select the operation:\n");
        System.out.println("1. Addition\n2. Multiply\n3. Division\n4. Modulus");
        System.out.println("5.Exit\n");

        //get input for user choice
        int choice = input.nextInt();

        switch (choice)
        {
            case 1:
                calc.add(num1, num2);
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