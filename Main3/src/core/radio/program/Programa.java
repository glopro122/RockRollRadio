package core.radio.program;

import java.util.ArrayList;
import core.person.Locutor;


public class Programa {
    private static int ID = 0;
    private String nombre;
    private int serial;
    private ArrayList<Emision> emisiones;
    private ArrayList<Locutor> locutores;
    
    public Programa(String nombre, Locutor locutor){
        this.nombre = nombre;
        this.serial = Programa.ID;
        this.emisiones = new ArrayList<>();
        this.locutores = new ArrayList<>();
        
        this.locutores.add(locutor);
        this.locutores.get(0).addPrograma(this);
        
    }
}
