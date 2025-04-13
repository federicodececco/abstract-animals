package org.lessons.abs;

public class App {
    public static void main(String args[]) throws Exception {
        Cane pluto = new Cane("pluto", (short) 4);
        pluto.dormi();
        pluto.verso();
        pluto.mangia();

        Asino lerry = new Asino("Lerry", "marrone");
        lerry.dormi();
        lerry.verso();
        lerry.mangia();
    }

}
