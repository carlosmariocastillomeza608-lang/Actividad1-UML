package parqueadero;

public class Vehiculo {

    protected String placa;
    protected String marca;
    protected String modelo;

    public Vehiculo(String placa, String marca, String modelo) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo;
    }
}
