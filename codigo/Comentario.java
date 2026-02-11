package feria;

import java.time.LocalDate;

public class Comentario {

    private Visitante visitante;
    private Stand stand;
    private LocalDate fecha;
    private int calificacion;
    private String texto;

    public Comentario(Visitante visitante, Stand stand, LocalDate fecha, int calificacion, String texto) {
        this.visitante = visitante;
        this.stand = stand;
        this.fecha = fecha;
        this.calificacion = calificacion;
        this.texto = texto;
    }

    public Visitante getVisitante() {
        return visitante;
    }

    public Stand getStand() {
        return stand;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public String toString() {
        return visitante.getNombre() + " calificó " + calificacion + "/5 al stand " + stand.getNumero();
    }
}
