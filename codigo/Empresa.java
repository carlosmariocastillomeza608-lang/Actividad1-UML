package feria;

public class Empresa {

    private String nombre;
    private String sector;
    private String correo;

    public Empresa(String nombre, String sector, String correo) {
        this.nombre = nombre;
        this.sector = sector;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSector() {
        return sector;
    }

    public String getCorreo() {
        return correo;
    }

    @Override
    public String toString() {
        return "Empresa: " + nombre + " (" + sector + ")";
    }
}
