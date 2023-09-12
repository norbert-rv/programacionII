package unPaquete;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Producto {
    
    private String nombre;
    private String descripcion;
    private boolean estado; // 1 disponible, 2 para no disponible
    private double precio;
    private String categoria;

    Producto(String nombre, String descripcion, String categoria, double precio, boolean estado){
        this.nombre= nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.precio = precio;
        this.estado = estado;
    }
    
    public void mostrar(){
        System.out.println("\nMostrando datos de Producto...");
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Categoria: " + categoria);
        System.out.println("Precio: " + precio);
        if(estado)
            System.out.println("Estado: disponible");
        else
            System.out.println("Estado: no disponible");
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
