package Basic;

import java.util.Scanner;

public class greeting_Message {
//    Take name as input and print a greeting message for that particular name.
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Your Name :");
    String Name = input.nextLine();
    System.out.println("Hello, " +Name+  "I hope you’re doing well. Wishing you a productive and successful day ahead.");
}
}
