package org.generation.jaita.veicoli;

import java.util.ArrayList;

public class GestoreFlotta {
    //attribute
    private ArrayList<Veicolo> listOfVehicle=new ArrayList<>();

   //constructor
    public GestoreFlotta(ArrayList<Veicolo> listOfVehicle) {
        this.listOfVehicle = listOfVehicle;
    }

    //methods
    public void AddVehicle(Veicolo vehicle) {
        listOfVehicle.add(vehicle);
    }

    public int numberOfAuto() {
        int cont=0;
        for (Veicolo veicolo: listOfVehicle) {
         if(veicolo instanceof Auto) {
             cont++;
         }
        }
        return cont;
    }

    public int numberOfMoto() {
        int cont2=0;
        for (Veicolo veicolo: listOfVehicle) {
            if(veicolo instanceof Moto) {
                cont2++;
            }
        }
        return cont2;
    }




}
