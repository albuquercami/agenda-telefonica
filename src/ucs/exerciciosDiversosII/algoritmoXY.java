package ucs.exerciciosDiversosII;

import java.util.Scanner;
import static java.lang.Math.pow;

public class algoritmoXY {
    public static void main(String[] args) {
        float x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        x = Float.parseFloat(scanner.nextLine());

        if (x < 1){
            System.out.println("y = " + x);
        } else if (x == 1) {
            y = 0;
            System.out.println("y = " + y);
        } else if (x > 1) {
            y = (float) pow(x, 2);
            System.out.println("y = " + y);
        }
    }
}
