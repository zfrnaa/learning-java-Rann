//created by zafran - 20212022 q3

//abstraction with public variables

import java.util.Scanner;

abstract class Customer
{
    int extension;
    double totalPayment;
    double discount;
    final int FREE_FOOD_VOUCHER = 2;

    public abstract void totalPaymentAfterDiscount();

    public abstract void extensionMonth();

    public void display()
    {
        System.out.println("To display something.");
    }
}

class TripleParkCustomer extends Customer
{
    public void totalPaymentAfterDiscount()
    {
        discount = 0.1;
        System.out.println("Payment before discount: " + totalPayment);
        totalPayment = totalPayment - (totalPayment * discount);
    }

    public void extensionMonth()
    {
        extension = 10;
    }

    @Override
    public void display()
    {
        totalPaymentAfterDiscount();
        extensionMonth();
        System.out.println("Payment after discount: " + totalPayment);
        System.out.println("Months of extension: " + extension);
        System.out.println("Number of free food vouchers: " + FREEFOODVOUCHER);
    }
}

class DoubleParkCustomer extends Customer
{
    public void totalPaymentAfterDiscount()
    {
        discount = 0.05;
        System.out.println("Payment before discount: " + totalPayment);
        totalPayment = totalPayment - (totalPayment * discount);
    }

    public void extensionMonth()
    {
        extension = 5;
    }

    @Override
    public void display()
    {
        totalPaymentAfterDiscount();
        extensionMonth();
        System.out.println("Payment after discount: " + totalPayment);
        System.out.println("Months of extension: " + extension);
    }
}

public class RestaurantA
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // TripleParkCustomer
        System.out.println("Enter the TripleParkCustomer details:");
        System.out.print("Total payment: ");
        double tripleParkTotalPayment = input.nextDouble();
        input.nextLine(); // Consume the newline character
        TripleParkCustomer tripleParkCustomer = new TripleParkCustomer();
        tripleParkCustomer.totalPayment = tripleParkTotalPayment;
        tripleParkCustomer.display();

        // DoubleParkCustomer
        System.out.println("\nEnter the DoubleParkCustomer details:");
        System.out.print("Total payment: ");
        double doubleParkTotalPayment = input.nextDouble();
        input.nextLine(); // Consume the newline character
        DoubleParkCustomer doubleParkCustomer = new DoubleParkCustomer();
        doubleParkCustomer.totalPayment = doubleParkTotalPayment;
        doubleParkCustomer.display();
    }
}