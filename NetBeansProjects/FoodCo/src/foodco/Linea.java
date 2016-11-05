/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodco;

import java.util.ArrayList;

/**
 *
 * @author faris
 */
public class Linea {
    private int id;
    private String nombre;
    private Fabrica fabrica;
    private ArrayList<RegistroProduccion> registro;
    private Supervisor supervisor;
    private Empleado[] empleados;
   
    public Linea(int id, String nombre, Fabrica fabrica,Supervisor supervisor,Empleado[] empleados ) {
        this.id = id;
        this.nombre = nombre;
        this.fabrica = fabrica;
        this.registro = new ArrayList<RegistroProduccion>();
        this.supervisor = supervisor;
        this.empleados=empleados;
    }
}
