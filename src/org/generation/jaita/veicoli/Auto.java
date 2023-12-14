package org.generation.jaita.veicoli;

public class Auto extends Veicolo {
     private int numberOfDoor;

    public Auto(int numeroTarga, int yearOfImmatricolation) {
        super(numeroTarga, yearOfImmatricolation);
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }
}
