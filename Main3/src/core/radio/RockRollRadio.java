/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.radio;
import core.person.Locutor;
import core.radio.program.Cancion;
import core.radio.program.Emision;
import core.radio.program.Programa;
import core.person.Artista;
import java.util.ArrayList;
import core.person.Invitado;
import java.util.Collections;
/**
 *
 * @author glopr
 */
public class RockRollRadio {

    private ArrayList<Cancion> canciones;
    private ArrayList<Artista> artistas;
    private ArrayList<Invitado> invitados;
    private ArrayList<Locutor> locutores;
    private ArrayList<Programa> programas;

    /**
     *
     */
    public RockRollRadio() {
        this.canciones = new ArrayList<>();
        this.artistas = new ArrayList<>();
        this.invitados = new ArrayList<>();
        this.locutores = new ArrayList<>();
        this.programas = new ArrayList<>();
    }

    public Programa getPrograma(int Index) {
        return this.programas.get(Index);
    }
    
    public boolean addPrograma(Programa programa){
        if(!this.programas.contains(programa)){
            this.programas.add(programa);
            return true;
        }
        return false;
    } 
    
    public boolean addLocutor(Locutor locutor){
        if(!this.locutores.contains(locutor)){
            this.locutores.add(locutor);
            return true;
        }
        return false;
    }
    
    public Locutor getLocutor(int Index) {
        return this.locutores.get(Index);
    }
    public boolean addArtista(Artista artista){
        if(!this.artistas.contains(artista)){
            this.artistas.add(artista);
            return true;
        }
        return false;
    } 
    
    public Artista getArtista(int Index) {
        return this.artistas.get(Index); 
    }

    public boolean addCancion(Cancion cancion) {
        if(!this.canciones.contains(cancion)){
            this.canciones.add(cancion);
            return true;
        }
        return false;
    }
    public boolean addEmision(Emision emision){
        return true;
    }
    public boolean addInvitado(Invitado invitado, Emision emision) {
        if (!this.invitados.contains(invitado)) {
            this.invitados.add(invitado);
            invitado.addEmision(emision);
            emision.addInvitado(invitado);
            return true;
        }
        return false;
    }
    
    public Cancion getCancion(int Index){
        return this.canciones.get(Index);
    }

    public ArrayList<Artista> getArtistas() {
        return artistas;
    }

    public Programa getProgramaConMasCancionesDeArtista(Artista artista) {
        ArrayList<Integer> frecuencias = new ArrayList<>();
        for(Programa programa : this.programas){
            frecuencias.add(programa.getFrecuenciaCanciones(artista));
        }
        int index = frecuencias.indexOf(Collections.max(frecuencias));
        return this.programas.get(index);
    }

    
}
