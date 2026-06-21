package service;

import model.Contacto;
import model.Guia;
import model.Tour;
import util.DatoInvalidoException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class GestorDatos {

    public ArrayList<Tour> cargarTours() {
        
        ArrayList<Tour> listaTours = new ArrayList<>();
        
        
        File archivo = new File("tours.txt"); 

        try {
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

           
            while ((linea = br.readLine()) != null) {
                if (linea.trim().isEmpty()) {
                    continue; 
                }

                try {
                   
                    String[] partes = linea.split(";");

                    
                    if (partes.length < 8) {
                        throw new DatoInvalidoException("Faltan datos en la línea.");
                    }

                    
                    int id = Integer.parseInt(partes[0].trim());
                    String nombreTour = partes[1].trim();
                    double precio = Double.parseDouble(partes[2].trim());

                    
                    String rutGuia = partes[3].trim();
                    String nombreGuia = partes[4].trim();
                    String especialidad = partes[5].trim();

                    
                    String telefono = partes[6].trim();
                    String correo = partes[7].trim();

                    
                    Contacto contacto = new Contacto(telefono, correo);
                    Guia guia = new Guia(rutGuia, nombreGuia, especialidad, contacto);
                    Tour tour = new Tour(id, nombreTour, precio, guia);

                    
                    listaTours.add(tour);

                } catch (NumberFormatException e) {
                    System.out.println("Error: Un número está mal escrito en el texto.");
                } catch (DatoInvalidoException e) {
                    System.out.println("Error de validación: " + e.getMessage());
                }
            }
            br.close();
        } catch (Exception e) {
            System.out.println("Error crítico: No se encontró el archivo tours.txt. Asegúrate de que esté al lado del archivo pom.xml");
        }

        return listaTours;
    }
}
