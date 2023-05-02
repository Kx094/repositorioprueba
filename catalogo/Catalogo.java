/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package catalogo;

import java.util.ArrayList;
import models.Municipio;
import views.Principal;

/**
 *
 * @author sarav
 */
public class Catalogo {
    public static Principal principal = new Principal();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
       //llenarMunicipios();
       //Municipio.llenarMunicipios();
        System.out.println("Inicio Proyecto");
       
        principal.setVisible(true);
        principal.setLocationRelativeTo(null);
    }
}
