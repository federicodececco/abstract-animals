package org.lessons.abs;

public class Asino extends Animale {
    private String nome;
    private String mantello;

    public Asino(String nome, String mantello) {
        this.nome = nome;
        this.mantello = mantello;
    }

    @Override
    public void verso() {
        System.out.println("Raglio");
    }

    @Override
    public void mangia() {
        System.out.println("Carne,frutta e verudra");
    }

}
