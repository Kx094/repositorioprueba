/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author sarav
 */
public class Municipio {
    private int id;
    private String Nombre;
    
    public Municipio() {
    }    
    public Municipio(int id, String Nombre) {
        this.id = id;
        this.Nombre = Nombre;
    }
    
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
    }
    
    @Override
    public String toString() {
    return "municipios{" + "id=" + id + ", Nombre=" + Nombre + '}';
    }
}
