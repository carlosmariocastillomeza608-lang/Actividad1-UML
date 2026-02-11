package parqueadero;

import java.time.LocalDateTime;

public class Ticket {

    private Vehiculo vehiculo;
    private LocalDateTime horaEntrada;
    private LocalDateTime horaSalida;
    private double valorPagado;

    public Ticket(Vehiculo vehiculo, LocalDateTime horaEntrada) {
        this.vehiculo = vehiculo;
        this.horaEntrada = horaEntrada;
    }

    public void cerrarTicket(LocalDateTime horaSalida, double valorPagado) {
        this.horaSalida = horaSalida;
        this.valorPagado = valorPagado;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public double getValorPagado() {
        return valorPagado;
    }
}
