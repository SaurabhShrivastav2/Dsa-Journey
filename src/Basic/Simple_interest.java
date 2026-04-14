package Basic;

import java.util.Scanner;

public class Simple_interest {
//    Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Principal :");
        float Principla = input.nextFloat();

        System.out.println("Enter a Time :");
        float Time = input.nextFloat();

        System.out.println("Enter a rate : ");
        float Rate = input.nextFloat();

        float Simple_Interest  = (Principla * Rate * Time)/100;
        System.out.println("Simple interest is "+Simple_Interest);

    }
}
