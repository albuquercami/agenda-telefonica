package ucs.exerciciosDiversosI;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float numero = 0, maior = 0;

        encontrarMaiorNumero(scanner, numero, maior);

    }

    public static void encontrarMaiorNumero (Scanner scanner, float numero, float maior){
        while (maior == numero) {
            System.out.print("Digite o 1o número: ");
            maior = Float.parseFloat(scanner.nextLine());

            System.out.print("Digite o 2o número: ");
            numero = Float.parseFloat(scanner.nextLine());

            if (maior == numero){
                System.out.println("Erro: os dois valores não podem ser iguais.");
            }
        }

        if (numero > maior){
            maior = numero;
        }

        System.out.println("O maior número é " + maior);

    }

}
