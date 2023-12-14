package org.generation.jaita.veicoli;

public class Veicolo {
    private int numberOfPlate;
    private int yearOfImmatricolation;

    public Veicolo(int numberOfPlate, int yearOfImmatricolation) {
        this.numberOfPlate = numberOfPlate;
        this.yearOfImmatricolation = yearOfImmatricolation;
    }

    public int getNumberOfPlate() {
        return numberOfPlate;
    }

    public int getYearOfImmatricolation() {
        return yearOfImmatricolation;
    }

    @Override
    public String toString() {
        return "Veicolo{" +
                "numberOfPlate=" + numberOfPlate +
                ", yearOfImmatricolation=" + yearOfImmatricolation +
                '}';
    }
}
