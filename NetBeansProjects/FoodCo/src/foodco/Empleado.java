/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

/**
 *
 * @author DuvHer
 */
public class Empleado {
    private String name;
    private int id;
    private String experiencias;
    private Linea linea;

    public Empleado(String name, int id, String experiencias, Linea linea) {
        this.name = name;
        this.id = id;
        this.experiencias = experiencias;
        this.linea = linea;
    }
    public int SolicitudVacaciones(){
       return 0;             
    }
    
    public int SolicitudEnfermedad(){
       return 0;             
    }

    
    
}
