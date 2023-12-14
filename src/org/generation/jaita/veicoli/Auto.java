package org.generation.jaita.veicoli;

public class Auto extends Veicolo {
     private int numberOfDoor;

    public Auto(int numeroTarga, int yearOfImmatricolation,int numberOfDoor) {
        super(numeroTarga, yearOfImmatricolation);
        this.numberOfDoor=numberOfDoor;
    }

    public int getNumberOfDoor() {
        return numberOfDoor;
    }


    public String toString() {
        return "Auto{" +
                "numberOfDoor=" + numberOfDoor +
                " numberOfPlate="+getNumberOfPlate()+
                " yearOfImmatricolation="+getYearOfImmatricolation()+
                '}';
    }
}
