package org.lessons.abs;

public class Delfino extends AbstractAnimale implements INuotante {
    private String nome;
    private String colore;

    public Delfino(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public void nuota() {
        System.out.println("Sto nuotando!!!");

    }

    @Override
    public void verso() {
        System.out.println("biosonar");

    }

    @Override
    public void mangia() {
        System.out.println("pesce,frutta");
    }

}
