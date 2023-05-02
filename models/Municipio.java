/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author sarav
 */
public class Municipio {
    private int id;
    private String Nombre;
    
    public static ArrayList<Municipio> municipios = new ArrayList<>();
    
    public static void llenarMunicipios(){
        insertarMunicipio(1, "Calkini");
        insertarMunicipio(2, "Campeche");
        insertarMunicipio(3, "Carmen");
        insertarMunicipio(4, "Hecelchakan");
        insertarMunicipio(5, "Champoton");
        insertarMunicipio(6, "Escarcega");
    }
    
    public static void listarMunicipiosForE(){
        System.out.println("For each");
        for(Municipio municipio : municipios){
            System.out.println(municipio.toString());
        }
    }
    
    public static void listarMunicipiosForI(){
        System.out.println("For i");
        System.out.println(municipios.size());
        
        for(int i=0;i<municipios.size();i++){
            System.out.println(municipios.get(i).toString());
        }
    }
    
    public static void eliminarMunicipio(int posicion){
        municipios.remove(posicion);
    }
    
    public static void insertarMunicipio(int id, String nombre){
        municipios.add(new Municipio(id, nombre));

    }
    /*public Municipio() {
    }*/    
    public Municipio(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }
    /*
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }*/
    
    @Override
    public String toString() {
    return "municipios{" + "id=" + id + ", Nombre=" + Nombre + '}';
    }
}
