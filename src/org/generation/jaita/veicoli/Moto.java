package org.generation.jaita.veicoli;

public class Moto extends Veicolo {
    private boolean easel;

    public Moto(int numeroTarga, int yearOfImmatricolation) {
        super(numeroTarga, yearOfImmatricolation);
    }

    public boolean isEasel() {
        return easel;
    }
}
