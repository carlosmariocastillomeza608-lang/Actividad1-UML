package feria;

import java.time.LocalDateTime;

public class Visita {

    private Visitante visitante;
    private Stand stand;
    private LocalDateTime fechaHora;

    public Visita(Visitante visitante, Stand stand, LocalDateTime fechaHora) {
        this.visitante = visitante;
        this.stand = stand;
        this.fechaHora = fechaHora;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public Stand getStand() {
        return stand;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    @Override
    public String toString() {
        return visitante.getNombre() + " visitó el stand " + stand.getNumero() + " en " + fechaHora;
    }
}
