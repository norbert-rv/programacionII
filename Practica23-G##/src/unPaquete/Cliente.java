package unPaquete;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Cliente {
    
    private String nombre;
    private String apellido;
    private String correo;
    private int clave;
    
    public void mostrar(){
        System.out.println("\nDatos Cliente...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Correo: " + correo);
        System.out.println("Clave: " + clave);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){      
        this.correo = correo;
    }
    
    public int getClave(){
        return clave;
    }
    
    public void setClave(int clave){
        this.clave = clave;
    }
}
