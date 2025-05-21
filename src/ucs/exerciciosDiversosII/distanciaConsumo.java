package ucs.exerciciosDiversosII;

import java.util.Scanner;

public class distanciaConsumo {
    public static void main(String[] args) {
        float velMedia, tempoHoras, distancia, consumo, quilometro;
        int opcao;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a velocidade média (km/h): ");
        velMedia = Float.parseFloat(scanner.nextLine());
        
        System.out.println("Informe o tempo de viagem (horas): ");
        tempoHoras = Float.parseFloat(scanner.nextLine());

        System.out.println("Informe a cidade de origem: ");
        System.out.println("1 - Rio de Janeiro");
        System.out.println("2 - Minas Gerais");
        System.out.println("3 - Espírito Santo");
        System.out.println("4 - São Paulo");
        System.out.print("Digite sua opção (1 a 4): ");
        opcao = Integer.parseInt(scanner.nextLine());

        switch (opcao) {
            case 1:
                quilometro = 9;
                break;
            case 2:
                quilometro = 7;
                break;
            case 3:
                quilometro = 6;
                break;
            case 4:
                quilometro = 12;
                break;
            default:
                System.out.println("Opção inválida.");
                return;
        }

        distancia = velMedia * tempoHoras;
        consumo = distancia / quilometro;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Consumo gasto: " + consumo + " litros");

    }
}
