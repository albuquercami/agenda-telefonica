package ucs.exerciciosDiversosII;

import java.util.Scanner;

public class caracteres {
    public static void main(String[] args) {
        String palavra;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        palavra = scanner.nextLine();

        String segundaPalavra = "Linda";
        String palavraResultado = palavra + " " + segundaPalavra;

        System.out.println("Palavra final: " + palavra + " " + segundaPalavra);
        System.out.println("Tamanho da palavra: " + palavraResultado.length());
    }
}
