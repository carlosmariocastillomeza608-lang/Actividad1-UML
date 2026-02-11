package parqueadero;

public class Motocicleta extends Vehiculo {

    private int cilindraje;

    public Motocicleta(String placa, String marca, String modelo, int cilindraje) {
        super(placa, marca, modelo);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindraje: " + cilindraje;
    }
}
