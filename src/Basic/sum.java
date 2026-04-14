package Basic;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        float Num_1 = Input.nextFloat();
        float Num_2  = Input.nextFloat();

        float Sum = Num_1 + Num_2 ;
        System.out.println("The Sum of two Number is " +Sum);

    }
}
