package core.radio.program;

import java.util.ArrayList;
import core.person.Locutor;
import core.person.Artista;

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

    public Locutor getLocutores(int Index) {
        return this.locutores.get(Index);
    }
    public Emision getLastEmision(){
        return this.emisiones.get(this.emisiones.size()-1);
    }
    public boolean addEmision(Emision emision){
        if(!this.emisiones.contains(emision)){
            this.emisiones.add(emision);
            return true;
        }
        return false;
    }
    public int getFrecuenciaCanciones(Artista artista){
        int frecuencia = 0;
        for (Emision emision : this.emisiones){
            frecuencia += emision.getCantidadCanciones(artista);
        }
        return frecuencia;
    }

    public String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
