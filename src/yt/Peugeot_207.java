package yt;

public class Peugeot_207 implements Carro{
    final int limiteDeVelocidade = 120;

    public int velocidadeAtual = 0;

    @Override
    public void ligar() {
        System.out.println("Ligando o Peugeot 207");
    }

    @Override
    public void acelerar() {
        if (this.velocidadeAtual <= limiteDeVelocidade) {
            this.velocidadeAtual += 30;
            System.out.println("Acelerando atual: " + this.velocidadeAtual + "km/h");
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
