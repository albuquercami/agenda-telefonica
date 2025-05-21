package yt;

public class March implements Carro{

    final int limiteDeVelocidade = 150;

    public int velocidadeAtual = 0;

    @Override
    public void ligar() {
        System.out.println("Ligando o March");
    }

    @Override
    public void acelerar() {
        if (this.velocidadeAtual < limiteDeVelocidade) {
            this.velocidadeAtual += 10;
            System.out.println("Velocidade atual: " + this.velocidadeAtual + "km/h");
        }
    }

    @Override
    public void frear() {
        System.out.println("Freando o carro");
    }

    @Override
    public void desligar() {
        System.out.println("Desligando o carro");
    }
}
