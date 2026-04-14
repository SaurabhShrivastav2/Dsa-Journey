package Basic;

import java.util.Scanner;

public class Greater_Small {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a First Number is :");
        float a = input.nextFloat();

        System.out.println("Enter a second Number is : ");
        float b = input.nextFloat();

        if (a >  b) {
            System.out.println("First Number is Greater Than Second.");
        } else if (a<b) {
            System.out.println("Second Number is Greater than First.");
//        } else if (a=b) {
//            System.out.println("first Number is Equal to Second.");
        }else {
            System.out.println("Check it Error !");
        }
    }
}
