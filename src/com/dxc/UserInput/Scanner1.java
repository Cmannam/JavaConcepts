package com.dxc.UserInput;
import java.util.Scanner;
public class Scanner1 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter the Number");
        double user_input_number = scan.nextDouble();
        System.out.println("The entered value is");
        System.out.println(user_input_number);
    }
}
