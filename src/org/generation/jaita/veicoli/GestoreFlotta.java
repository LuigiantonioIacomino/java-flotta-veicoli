package org.generation.jaita.veicoli;

import java.util.ArrayList;

public class GestoreFlotta {
    //attribute
    private ArrayList<Veicolo> listOfVehicle = new ArrayList<>();

    //constructor


    //methods
    public void AddVehicle(Veicolo vehicle) {
        boolean check = true;
        for (Veicolo veicolo : listOfVehicle) {
            if (vehicle.getNumberOfPlate() == veicolo.getNumberOfPlate()) {
                check = false;
            }
        }
        if (check == true) {
            listOfVehicle.add(vehicle);
            System.out.println("Veicolo aggiunto");
        } else {
            System.out.println("non puoi inserire il veicolo perche è gia presente");
        }
    }

        public int numberOfAuto () {
            int cont = 0;
            for (Veicolo veicolo : listOfVehicle) {
                if (veicolo instanceof Auto) {
                    cont++;
                }
            }
            return cont;
        }

        public int numberOfMoto () {
            int cont2 = 0;
            for (Veicolo veicolo : listOfVehicle) {
                if (veicolo instanceof Moto) {
                    cont2++;
                }
            }
            return cont2;
        }

        public Veicolo foundVehicleThroughNumberOfPlate ( int number){
            Veicolo vehicle_found = null;
            for (Veicolo vehicle : listOfVehicle) {
                if (vehicle.getNumberOfPlate() == number) {
                    vehicle_found = vehicle;
                }
            }
            return vehicle_found;
        }

    public ArrayList<Veicolo> getListOfVehicle() {
        return listOfVehicle;
    }
}

