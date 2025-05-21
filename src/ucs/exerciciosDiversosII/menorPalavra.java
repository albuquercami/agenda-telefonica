package ucs.exerciciosDiversosII;

import java.util.Scanner;

public class menorPalavra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palavra1, palavra2, menorPalavra;

        System.out.print("Digite uma palavra: ");
        palavra1 = scanner.nextLine();
        // scanner.nextLine(); // Limpa o buffer do scanner
        System.out.print("Digite outra palavra: ");
        palavra2 = scanner.nextLine();

        if (palavra1.length() < palavra2.length()) {
            menorPalavra = palavra1;
        } else if (palavra2.length() < palavra1.length()) {
            menorPalavra = palavra2;
        } else {
            menorPalavra = "As palavras têm o mesmo tamanho.";
        }

        System.out.println("A menor palavra é: " + menorPalavra);


    }
}
