/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqClases;

/**
 *
 * @author norbert
 */

import java.util.ArrayList;

public class PrimeraClase {
    String unaCadena;
    int unEntero;
    
    public void mostrar(){
        System.out.println("unaCadena: " + unaCadena + "\nunEntero: " + unEntero + "\n");
    }
    
    public static void main(String[] args){
        // creando 5 objetos del tipo PrimeraClase
        PrimeraClase Objeto1 = new PrimeraClase();
        PrimeraClase Objeto2 = new PrimeraClase();
        PrimeraClase Objeto3 = new PrimeraClase();
        PrimeraClase Objeto4 = new PrimeraClase();
        PrimeraClase Objeto5 = new PrimeraClase();
        
        Objeto1.unaCadena = "hola";
        Objeto2.unaCadena = "que tal?";
        Objeto3.unaCadena = "como te va";
        Objeto4.unaCadena = "esto es una cadena";
        Objeto5.unaCadena = "texto texto";
        
        Objeto1.unEntero = 1;
        Objeto2.unEntero = 2;
        Objeto3.unEntero = 3;
        Objeto4.unEntero = 4;
        Objeto5.unEntero = 5;
        
        // presentando los atributos
        Objeto1.mostrar();
        Objeto2.mostrar();
        Objeto3.mostrar();
        Objeto4.mostrar();
        Objeto5.mostrar();
        
        System.out.println("-------------------\n");
        
        // ArrayList de elementos de tipo Primera Clase
        ArrayList<PrimeraClase> arrayObjetos = new ArrayList<>();
        
        arrayObjetos.add(Objeto1);
        arrayObjetos.add(Objeto2);
        arrayObjetos.add(Objeto3);
        arrayObjetos.add(Objeto4);
        arrayObjetos.add(Objeto5);
        
        // muestro por pantalla el array
        
        for(PrimeraClase objeto : arrayObjetos){
            objeto.mostrar();
        }
        
        System.out.println("-------------------\n");
        
        // modifico algunos valores
        Objeto5.unaCadena = "este valor fue cambiado";
        Objeto2.unEntero = 888;
        Objeto1.unaCadena = "esta cadena debería cambiar también";
        
        for(PrimeraClase objeto : arrayObjetos){
            objeto.mostrar();
        }
        
        System.out.println("\nTodo parece haber salido como era esperado!\n");
    }
}
