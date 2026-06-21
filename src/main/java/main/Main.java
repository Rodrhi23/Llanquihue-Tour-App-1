package main;

import model.Tour;
import service.GestorDatos;
import java.util.ArrayList;
import java.util.InputMismatchException; 
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        
        GestorDatos gestor = new GestorDatos();
        ArrayList<Tour> misTours = gestor.cargarTours();
        
        System.out.println("=== SISTEMA DE TOURS LLANQUIHUE (MAVEN) ===");
        
        for (Tour tour : misTours) {
            System.out.println(tour.toString());
        }
        System.out.println("===========================================");
        
  
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n--- BUSCADOR DE TOURS ---");
        System.out.print("Ingrese el ID del tour que desea buscar (ej: 101 a 105): ");
        
        try {
            int idABuscar = teclado.nextInt(); 
            
            Tour tourEncontrado = null;
            for (Tour t : misTours) {
                if (t.getId() == idABuscar) {
                    tourEncontrado = t;
                    break; 
                }
            }
            
            System.out.println("\n=== RESULTADO DE LA BUSQUEDA ===");
            if (tourEncontrado != null) {
                System.out.println("Tour encontrado con exito");
                System.out.println(tourEncontrado.toString());
            } else {
                System.out.println("Error: El tour con el ID " + idABuscar + " no existe en el sistema.");
            }
            
        } catch (InputMismatchException e) {
            // Si ingresa letras, el programa entra aquí en vez de romperse
            System.out.println("\n=== RESULTADO DE LA BUSQUEDA ===");
            System.out.println("Error critico: Debes ingresar un numero entero, no se permiten letras");
        }
        
        System.out.println("===========================================");
        teclado.close(); 
    }
}