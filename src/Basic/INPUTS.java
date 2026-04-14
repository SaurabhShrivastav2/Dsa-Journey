package Basic;

import java.util.Scanner;

public class INPUTS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your roll number: ");
        int rollno = input.nextInt();

        System.out.println("Your roll number is " + rollno);

//        input.close(); // good practice
    }
}
