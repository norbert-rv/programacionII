/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unPaquete;

/**
 *
 * @author estudiante
 */

import java.util.ArrayList;

public class ControladorPrincipal {
    public static void main(String[] args){
        
        // defino los ArrayList para cada clase
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        ArrayList<Encargado> listaEncargados = new ArrayList<>();
        ArrayList<Producto> listaProductos = new ArrayList<>();
        
        // instancio 3 objetos de cada clase
        Cliente cliente1 = new Cliente();
        
        cliente1.setNombre("Tomas");
        cliente1.setApellido("Cabrera Bellomo");
        cliente1.setCorreo("tomascabrerabellomo@gmail.com");
        cliente1.setClave(123456);
        
        Cliente cliente2 = new Cliente();
        
        cliente2.setNombre("Norberto");
        cliente2.setApellido("Rodriguez Vaquero");
        cliente2.setCorreo("norberto.rodriguezvaquero@gmail.com");
        cliente2.setClave(321654);
        
        Cliente cliente3 = new Cliente();
        
        cliente3.setNombre("Ivana");
        cliente3.setApellido("Romano");
        cliente3.setCorreo("ivanaromano2001@gmail.com");
        cliente3.setClave(89888);
        
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
        listaClientes.add(cliente3);
        
        // instancio objetos de tipo Empleado (utilizo constructor)
        Empleado empl1 = new Empleado("Martin", "Middagh", "martinm2003@gmail.com", 6685);
        Empleado empl2 = new Empleado("Lucas", "Rodriguez", "luquitas@gmail.com", 888);
        Empleado empl3 = new Empleado("Raul", "Rodriguez", "raulito23@gmail.com", 444);
        
        
        listaEmpleados.add(empl1);
        listaEmpleados.add(empl2);
        listaEmpleados.add(empl3);
        
        // instancio objetos de tipo Encargado y agrego al ArrayList
        
        Encargado encargado1 = new Encargado("Pedro", "Juarez", "pedrito@gmail.com", 654987);
        Encargado encargado2 = new Encargado("Lourdes", "Laroz", "lurdecita@gmail.com", 555);
        Encargado encargado3 = new Encargado("Nicolas", "Nieva", "nico2003@gmail.com", 888);
        
        listaEncargados.add(encargado1);
        listaEncargados.add(encargado2);
        listaEncargados.add(encargado3);
        
        // ahora para los productos
        
        Producto prod1 = new Producto("Lapicera", "Lapicera marca bic", "Utiles", 50.00, true);
        Producto prod2 = new Producto("Cartuchera", "Cartuchera color verde", "Utiles", 5500.00, false);
        Producto prod3 = new Producto("Botas Wonder", "Botas Ricky Sarkany", "Calzado", 6000.00, true);
     
        listaProductos.add(prod1);
        listaProductos.add(prod2);
        listaProductos.add(prod3);
        
        // recorriendo cada ArrayList y mostrando su contenido por pantalla
        
        for(Cliente cli : listaClientes){
            cli.mostrar();
        }
        
        System.out.println("\n-------------------------");
        
        for(Empleado empl : listaEmpleados){
            empl.mostrar();
        }
        
        System.out.println("\n-------------------------");
        
        for(Encargado encargado : listaEncargados){
            encargado.mostrar();
        }
        
        System.out.println("\n-------------------------");
        
        for(Producto prod : listaProductos){
            prod.mostrar();
        }
        
        // modifico algunos atributos de algunos objetos
        
        cliente1.setNombre("Tomás Ignacio");
        
        prod2.setEstado(true);
        
        encargado3.setCorreo("nicolasnieva2004@gmail.com");
        
        // vuelvo a mostrar para corroborar que se hicieron los cambios
        
        System.out.println("\n\n¿SE CAMBIARON LOS VALORES DE LOS ATRIBUTOS?");
        
        for(Cliente cli : listaClientes){
            cli.mostrar();
        }
        
        System.out.println("\n-------------------------");
        
        for(Empleado empl : listaEmpleados){
            empl.mostrar();
        }
        
        System.out.println("\n-------------------------");
        
        for(Encargado encargado : listaEncargados){
            encargado.mostrar();
        }
        
        System.out.println("\n-------------------------");
        
        for(Producto prod : listaProductos){
            prod.mostrar();
        }
    }
}
