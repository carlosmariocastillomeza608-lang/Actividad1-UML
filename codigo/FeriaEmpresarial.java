package feria;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FeriaEmpresarial {

    private String nombre;

    private ArrayList<Empresa> empresas = new ArrayList<>();
    private ArrayList<Stand> stands = new ArrayList<>();
    private ArrayList<Visitante> visitantes = new ArrayList<>();
    private ArrayList<Comentario> comentarios = new ArrayList<>();
    private ArrayList<Visita> visitas = new ArrayList<>();

    public FeriaEmpresarial(String nombre) {
        this.nombre = nombre;
    }

    // REGISTROS BÁSICOS
    public void registrarEmpresa(Empresa e) {
        empresas.add(e);
    }

    public void registrarStand(Stand s) {
        stands.add(s);
    }

    public void registrarVisitante(Visitante v) {
        visitantes.add(v);
    }

    // ASIGNAR STAND A EMPRESA (buscando por número y nombre)
    public boolean asignarStand(int numeroStand, String nombreEmpresa) {
        Stand stand = buscarStand(numeroStand);
        Empresa empresa = buscarEmpresa(nombreEmpresa);

        if (stand == null || empresa == null) {
            return false;
        }

        stand.asignarEmpresa(empresa);
        return true;
    }

    // REGISTRAR VISITA (aunque no haya comentario)
    public boolean registrarVisita(String idVisitante, int numeroStand) {
        Visitante v = buscarVisitante(idVisitante);
        Stand s = buscarStand(numeroStand);

        if (v == null || s == null) {
            return false;
        }

        visitas.add(new Visita(v, s, LocalDateTime.now()));
        return true;
    }

    // AGREGAR COMENTARIO
    public boolean agregarComentario(String idVisitante, int numeroStand, int calificacion, String texto) {
        Visitante v = buscarVisitante(idVisitante);
        Stand s = buscarStand(numeroStand);

        if (v == null || s == null) {
            return false;
        }

        comentarios.add(new Comentario(v, s, LocalDate.now(), calificacion, texto));
        return true;
    }

    // BÚSQUEDAS (para que no sea todo manual)
    private Empresa buscarEmpresa(String nombre) {
        for (Empresa e : empresas) {
            if (e.getNombre().equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    private Stand buscarStand(int numero) {
        for (Stand s : stands) {
            if (s.getNumero() == numero) {
                return s;
            }
        }
        return null;
    }

    private Visitante buscarVisitante(String id) {
        for (Visitante v : visitantes) {
            if (v.getIdentificacion().equalsIgnoreCase(id)) {
                return v;
            }
        }
        return null;
    }

    // REPORTES SIMPLES
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public ArrayList<Visita> getVisitas() {
        return visitas;
    }

    @Override
    public String toString() {
        return "Feria: " + nombre + " | Empresas: " + empresas.size() + " | Stands: " + stands.size();
    }
}
