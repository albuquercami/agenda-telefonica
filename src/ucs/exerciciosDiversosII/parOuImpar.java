package ucs.exerciciosDiversosII;

import java.util.Scanner;

public class parOuImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada;
        int quantCaracteres;

        System.out.print("Digite uma palavra: ");
        entrada = scanner.nextLine();

        quantCaracteres = entrada.length();

        if (quantCaracteres % 2 == 0) {
            System.out.println("A palavra tem um número par de caracteres.");
        } else {
            System.out.println("A palavra tem um número ímpar de caracteres.");
        }
    }
}
