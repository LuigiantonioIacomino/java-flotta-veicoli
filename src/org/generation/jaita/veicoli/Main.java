package org.generation.jaita.veicoli;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GestoreFlotta gestoreFlotta= new GestoreFlotta();
        Auto auto=new Auto(400,2000,4);
        Auto auto2=new Auto(500,2010,6);
        Auto auto3=new Auto(600,2005,7);
        Moto moto=new Moto(200,2022,true);
        Moto moto2=new Moto(700,2008,false);
        gestoreFlotta.AddVehicle(auto3);
        gestoreFlotta.AddVehicle(auto2);
        gestoreFlotta.AddVehicle(moto);
        ArrayList<Veicolo> list=gestoreFlotta.getListOfVehicle();
        for (Veicolo vehicle: list) {
            System.out.println(vehicle.toString());
        }

    }
}
