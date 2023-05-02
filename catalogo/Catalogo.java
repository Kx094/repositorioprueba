/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catalogo;

import java.util.ArrayList;
import models.Municipio;

/**
 *
 * @author sarav
 */
public class Catalogo {
    static ArrayList<Municipio> municipios = new ArrayList<>();
    
    /*public static void llenarMunicipios(){
        municipios.add(new Municipio(1, "Calkini"));
        municipios.add(new Municipio(2, "Campeche"));
        municipios.add(new Municipio(3, "Carmen"));
        municipios.add(new Municipio(4, "Hecelchakan"));
        municipios.add(new Municipio(5, "Champoton"));
        municipios.add(new Municipio(6, "Escarcega"));
        
        System.out.println("Llenar");
        System.out.println(municipios.toString());
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
    }*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llenarMunicipios();
        Municipio.llenarMunicipios();
        Municipio.listarMunicipiosForE();
        Municipio.listarMunicipiosForI();
        Municipio.eliminarMunicipio(3);
        Municipio.listarMunicipiosForI();
        
        Municipio.insertarMunicipio(4, "Champoton");
        Municipio.insertarMunicipio(7, "Hopelchen");
        Municipio.insertarMunicipio(8, "Palizada");
        Municipio.listarMunicipiosForI();
    }
}
