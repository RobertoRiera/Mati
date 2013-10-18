package Concesionario;

import java.util.ArrayList;

public class Concesionario {
    private String nombre;
    private ArrayList<Coche> lista= new ArrayList<Coche>();

    public Concesionario(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void añadir(Coche coche){
        for (Coche car : lista)
            if (car.equals(coche)) return;
        lista.add(coche);
    }
    public void borrarDeConductor(String conductor){
        for (Coche car : lista) 
            if (car.getConductor()==conductor) lista.remove(car);
    }
    public void listarCoches(){
        for (Coche coche : lista)
            System.out.println(coche);
    }
}
