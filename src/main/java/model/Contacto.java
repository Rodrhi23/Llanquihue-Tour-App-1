package model;

public class Contacto {
    
    private String telefono;
    private String correo;

    public Contacto() {
        this.telefono = "+56999418336";
        this.correo = "contacto@llanquihuetour.cl";
    }

    public Contacto(String telefono, String correo) {
        setTelefono(telefono);
        setCorreo(correo);
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            this.telefono = "+56999418336";
        } else {
            this.telefono = telefono.trim();
        }
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        if (correo == null || !correo.contains("@")) {
            this.correo = "contacto@llanquihuetour.cl";
        } else {
            this.correo = correo.trim();
        }
    }

    @Override
    public String toString() {
        return "Fono: " + telefono + " | Correo: " + correo;
    }
}