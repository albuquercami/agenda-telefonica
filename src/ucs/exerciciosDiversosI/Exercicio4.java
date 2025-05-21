package ucs.exerciciosDiversosI;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float n1, n2, n3;

        while (true) {
            System.out.print("Digite o 1º número: ");
            n1 = Float.parseFloat(scanner.nextLine());

            System.out.print("Digite o 2º número: ");
            n2 = Float.parseFloat(scanner.nextLine());

            System.out.print("Digite o 3º número: ");
            n3 = Float.parseFloat(scanner.nextLine());

            // Verifica se algum número é igual a outro
            if (n1 == n2 || n1 == n3 || n2 == n3) {
                System.out.println("Erro: os três números devem ser diferentes. Tente novamente.\n");
            } else {
                break; // Sai do loop se todos forem diferentes
            }
        }

        float menor = acharMenorNumero(n1, n2, n3);
        System.out.println("O menor número é: " + menor);

    }

    public static float acharMenorNumero (float a, float b, float c){

        float menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        return menor;
    }
}
