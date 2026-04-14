package Basic;

import java.util.Scanner;

public class CelsiousToFerenite {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter a Temperatur in Celsious : ");
        float TemC = Input.nextFloat();
        float TemF = (TemC*9/5) + 32;
        System.out.println("Temperature Is Fereh is : " + TemF);
    }
}
