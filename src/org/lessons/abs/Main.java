package org.lessons.abs;

public class Main {
    static public void faiVolare(IVolante animale) {
        animale.vola();

    }

    static public void faiNuotare(INuotante animale) {
        animale.nuota();

    }

    public static void main(String args[]) throws Exception {
        Cane pluto = new Cane("pluto", (short) 4);
        pluto.dormi();
        pluto.verso();
        pluto.mangia();

        Passerotto lerry = new Passerotto("Lerry", "marrone");
        Delfino giorgio = new Delfino("giorgio", "grigio");
        faiVolare(lerry);
        faiNuotare(giorgio);
    }

}
