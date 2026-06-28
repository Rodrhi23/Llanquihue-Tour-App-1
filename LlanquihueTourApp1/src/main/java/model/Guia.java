package model;

public class Guia {
    
    private String rut;
    private String nombre;
    private String especialidad;
    private Contacto contacto; 

   
    public Guia(String rut, String nombre, String especialidad, Contacto contacto) {
        setRut(rut);
        setNombre(nombre);
        setEspecialidad(especialidad);
        setContacto(contacto);
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        if (rut == null || rut.trim().isEmpty()) {
            this.rut = "00.000.000-0";
        } else {
            this.rut = rut;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            this.nombre = "Sin Nombre";
        } else {
            this.nombre = nombre;
        }
    }

    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.trim().isEmpty()) {
            this.especialidad = "General";
        } else {
            this.especialidad = especialidad;
        }
    }

    public Contacto getContacto() {
        return contacto;
    }

    public void setContacto(Contacto contacto) {
        if (contacto == null) {
            this.contacto = new Contacto();
        } else {
            this.contacto = contacto;
        }
    }

    @Override
    public String toString() {
        return "Guia: " + nombre + " (RUT: " + rut + ") | Especialidad: " + especialidad + " | [" + contacto.toString() + "]";
    }
}
