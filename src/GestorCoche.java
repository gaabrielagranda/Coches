package org.example;

import java.util.ArrayList;

public class GestorCoche {
    private ArrayList<coche> coches = new ArrayList<coche>();
    private int id = 1;
    public void agregarCoche(coche coche) {
        coche.setId(id++);
        coches.add(coche);
    }
    public ArrayList<coche> listarCoches() {
        ArrayList<coche> cochesNoBorrados = new ArrayList<coche>();
        for (coche coche : coches) {
            if (!coche.isBorrado()) {
                cochesNoBorrados.add(coche);
            }
        }
        return cochesNoBorrados;
    }
}
