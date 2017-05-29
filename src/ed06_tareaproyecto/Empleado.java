/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed06_tareaproyecto;

/**
 *
 * @author ED06
 */
public class Empleado {
    private String dni;
    private String nombre;
    private String direccion;
    private String cargo;
    private int numHijos;
    
    public Empleado (String dni, String nombre){
        this.dni=dni;
        this.nombre=nombre;
        this.cargo="EMPLEADO";
        this.numHijos=0;
    }
       
    public double calcula_sueldo(double base){
        double total=base;
        switch (getCargo())
        {
            case "ENCARGADO":
                total+=300;
                break;
            
            case "DIRECTOR":
                total+=1000;
                break;   
        }
       if (getNumHijos()>=3)
           total+=getNumHijos()*50;
      return total;
    }

     public void imprimir_emp (int sueldo, String direccion, int hijos)
     {  
         this.setNumHijos(hijos);
         this.setDireccion(direccion);
        System.out.println("DNI: "+this.getDni());
        System.out.println("Nombre: "+this.getNombre());
        System.out.println("Cargo: "+this.getCargo());
        System.out.println("Número de hijos: "+this.getNumHijos());
        System.out.println("Sueldo: " +calcula_sueldo(sueldo));
     }   

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public void setNumHijos(int numHijos) {
        this.numHijos = numHijos;
    }
}
