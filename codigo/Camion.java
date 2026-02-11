package parqueadero;

public class Camion extends Vehiculo {

    private double capacidadCarga;

    public Camion(String placa, String marca, String modelo, double capacidadCarga) {
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    @Override
    public String toString() {
        return super.toString() + ", Capacidad: " + capacidadCarga + " toneladas";
    }
}
