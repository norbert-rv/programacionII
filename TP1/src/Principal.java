/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author norbert
 */

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        
        // tipos de datos primitivos
        byte unByte = 20;
        short unShort = 256;
        int unInt = 15656;
        long unLong = 12345678;
        float unFloat = 25.55f;
        double unDouble = 65.1234;
        
        System.out.println("Tipos de datos primitivos...\n");
        System.out.println("byte: " + unByte);
        System.out.println("short: " + unShort);
        System.out.println("int: " + unInt);
        System.out.println("long: " + unLong);
        System.out.println("float: " + unFloat);
        System.out.println("double: " + unDouble);
        
        System.out.println("\nOtro tipo...\n");
        
        String unString = "Esto es un ejemplo de string!";
        
        System.out.println("String: " + "'" + unString + "'");
        
        // declaracion de ArrayList con datos de tipo float
        ArrayList<Float> miArray = new ArrayList<>();
        
        // inicializo los elementos arbitrariamente
        float numeroFloat = 20.5f;
        for(int i = 0; i < 5; i++){
            miArray.add(numeroFloat + 2);
        }
        
        // muestro por pantalla el array
        
        System.out.print("\n\nMi array: ");
        
        for(Float f : miArray){
            System.out.print(f + "  ");
        }
        
        System.out.println("\n");
        
        // calculo el promedio
        
        int suma = 0;
        
        for(Float f : miArray){
            suma += f;
        }
        
        float promedio = suma / miArray.size();
        
        System.out.println("Promedio de los elementos de mi array: " + promedio);
        
        
    }
}
