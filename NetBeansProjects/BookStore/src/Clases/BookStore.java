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
        Libro book1=new Libro(123876653,"Algoritmia y Programaciòn",57000);
        Libro book2=new Libro(345980343,"Programacion en Java",75000);
        Libro book3=new Libro(908654873,"El lenguaje UML",43500);
        Libro book4=new Libro(243865443,"Usando JUnit",63092);
        Libro book5=new Libro(877765343,"Programacion en C++",65432);
        
    }
    
}
