
package model;

public class Tour {
    
    private int id;
    private String nombre;
    private double precio;
    
    
    private Guia guiaAsignado; 

    public Tour(int id, String nombre, double precio, Guia guiaAsignado) {
        this.id = id;
        this.nombre = nombre;
        setPrecio(precio); 
        this.guiaAsignado = guiaAsignado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio < 0) {
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    public Guia getGuiaAsignado() {
        return guiaAsignado;
    }

    public void setGuiaAsignado(Guia guiaAsignado) {
        this.guiaAsignado = guiaAsignado;
    }

    @Override
    public String toString() {
        String infoGuia = (guiaAsignado != null) ? guiaAsignado.toString() : "Sin guia asignado";
        return "ID: " + id + " | Tour: " + nombre + " | Precio: $" + precio + " | " + infoGuia;
    }
}
