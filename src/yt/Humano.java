package yt;

public class Humano extends SerVivo{

    public String nome;

    public Humano() {
        super(21);
        this.nome = "Camila";
    }

    public void respirar() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Inalando e exalando CO2 e O2");
    }
}
