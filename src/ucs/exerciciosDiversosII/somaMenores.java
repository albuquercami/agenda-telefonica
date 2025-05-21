package ucs.exerciciosDiversosII;

import java.util.Scanner;

public class somaMenores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite quatro números distintos:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        double num4 = scanner.nextDouble();

        double maior = num1;
        if (num2 > maior) maior = num2;
        if (num3 > maior) maior = num3;
        if (num4 > maior) maior = num4;

        double soma = num1 + num2 + num3 + num4 - maior;

        System.out.println("A soma dos três menores números é: " + soma);
    }
}
