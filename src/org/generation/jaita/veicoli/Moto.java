package org.generation.jaita.veicoli;

public class Moto extends Veicolo {
    private boolean easel;

    public Moto(int numeroTarga, int yearOfImmatricolation, boolean easel) {
        super(numeroTarga, yearOfImmatricolation);
        this.easel=easel;
    }

    public boolean isEasel() {
        return easel;
    }

    public String toString() {
        return "Moto{" +
                "easel=" + easel +
                " numberOfPlate="+getNumberOfPlate()+
                " yearOfImmatricolation="+getYearOfImmatricolation()+
                '}';
    }
}
