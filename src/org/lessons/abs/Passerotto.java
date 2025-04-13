package org.lessons.abs;

public class Passerotto extends AbstractAnimale implements IVolante {
    private String nome;
    private String piumaggio;

    public Passerotto(String nome, String piumaggio) {
        this.nome = nome;
        this.piumaggio = piumaggio;
    }

    public void vola() {

        System.out.println("Sto volando!!!");

    }

    @Override
    public void verso() {
        System.out.println("Cinguettio");
    }

    @Override
    public void mangia() {
        System.out.println("frutta e verudra");
    }

}
