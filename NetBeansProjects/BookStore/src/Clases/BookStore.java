/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Formulario.Tienda_de_Libros;

/**
 *
 * @author DuvHer
 */
public class BookStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tienda_de_Libros miTienda= new Tienda_de_Libros();
        miTienda.setLocationRelativeTo(null);
        miTienda.setVisible(true);
        //String[][] Catalogo = new String[10][3];
        //ArrayList<String> Catalogo= new ArrayList<String>();
        Libro book=new Libro(1234,"programacion java",90000);
        
        
        
    }
    
}
