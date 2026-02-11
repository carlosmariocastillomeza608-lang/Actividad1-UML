package parqueadero;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Parqueadero {

    private ArrayList<Ticket> ticketsActivos = new ArrayList<>();

    // Entrada: crea ticket con hora actual y lo guarda
    public void registrarEntrada(Vehiculo v) {
        Ticket t = new Ticket(v, LocalDateTime.now());
        ticketsActivos.add(t);
    }

    // Busca el ticket por placa
    private Ticket buscarTicketPorPlaca(String placa) {
        for (Ticket t : ticketsActivos) {
            if (t.getVehiculo().getPlaca().equalsIgnoreCase(placa)) {
                return t;
            }
        }
        return null;
    }

    // Salida: calcula cobro y cierra ticket
    public double registrarSalida(String placa) {
        Ticket t = buscarTicketPorPlaca(placa);

        if (t == null) {
            return -1; // no encontrado
        }

        LocalDateTime salida = LocalDateTime.now();
        long minutos = Duration.between(t.getHoraEntrada(), salida).toMinutes();

        // Cobro simple de ejemplo (puedes decir que es una tarifa base)
        double valor = minutos * 100;

        t.cerrarTicket(salida, valor);
        ticketsActivos.remove(t);

        return valor;
    }

    public int cantidadVehiculosDentro() {
        return ticketsActivos.size();
    }
}
