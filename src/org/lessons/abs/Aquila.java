package org.lessons.abs;

public class Aquila extends AbstractAnimale implements IVolante {
    private String nome;
    private String piumaggio;

    public Aquila(String nome, String piumaggio) {
        this.nome = nome;
        this.piumaggio = piumaggio;
    }

     public void vola() {

        System.out.println("Sto volando!!!");

    }

    @Override
    public void verso() {
        System.out.println("striddio");
    }

    @Override
    public void mangia() {
        System.out.println("Carne, frutta");
    }

}
