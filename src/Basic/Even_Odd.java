package Basic;

import java.util.Scanner;

//Write a program to print whether a number is even or odd, also take input from the user.
public class Even_Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number :");
        int N = input.nextInt();
        if (N%2==0) {
            System.out.println("Number is Even ");

        }else
            System.out.println("Number is Odd ");

    }
}
