package org.lessons.abs;

public class Cane extends Animale {
    private short età;
    private String nome;

    public Cane(String nome, short età) {
        this.nome = nome;
        this.età = età;
    }

    @Override
    public void verso() {
        System.out.println("Abbaio");
    }

    @Override
    public void mangia() {
        System.out.println("Carne e vegetali");
    }
}