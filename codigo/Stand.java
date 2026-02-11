package feria;

public class Stand {

    private int numero;
    private String ubicacion;
    private String tamano;

    // Opcional pero útil: a qué empresa pertenece el stand
    private Empresa empresa;

    public Stand(int numero, String ubicacion, String tamano) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
    }

    public int getNumero() {
        return numero;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getTamano() {
        return tamano;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void asignarEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        String empresaTxt = (empresa == null) ? "Sin empresa" : empresa.getNombre();
        return "Stand #" + numero + " - " + empresaTxt + " - " + ubicacion;
    }
}
