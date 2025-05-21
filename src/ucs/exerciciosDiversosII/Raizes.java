package ucs.exerciciosDiversosII;

import java.util.Scanner;
import static java.lang.Math.pow;

public class Raizes {
    public static void main(String[] args) {
        float a, b, c;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        a = Float.parseFloat(scanner.nextLine());

        System.out.print("Digite o valor de b: ");
        b = Float.parseFloat(scanner.nextLine());

        System.out.print("Digite o valor de c: ");
        c = Float.parseFloat(scanner.nextLine());

        float delta = (float) (pow(b, 2) - 4 * a * c);
        float x1 = -b + (float) Math.sqrt(delta) / (2 * a);
        float x2 = -b - (float) Math.sqrt(delta) / (2 * a);

        if (delta > 0) {
            System.out.println("As raízes distintas são: " + x1 + " e " + x2);
        } else if (delta == 0) {
            System.out.println("A raiz é: " + x1);
        } else if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        }
    }
}
