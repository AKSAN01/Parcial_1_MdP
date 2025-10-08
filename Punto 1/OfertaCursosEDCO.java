import java.util.ArrayList;
import java.util.List;

public class OfertaCursosEDCO implements Subject {
    private List<Observer> observadores;
    private List<Curso> cursos;

    public OfertaCursosEDCO() {
        this.observadores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        this.cursos.add(curso);
        System.out.println(" ");
        System.out.println("Se ha agregado un nuevo curso a la oferta.");
        System.out.println(" ");
        notificarObservadores("NUEVO", curso);
    }

    public void eliminarCurso(Curso curso) {
        if (this.cursos.remove(curso)) {
            System.out.println("EDCO: Se ha retirado un curso de la oferta.");
            notificarObservadores("ELIMINADO", curso);
        }
    }

    @Override
    public void registrarObservador(Observer o) {
        observadores.add(o);
        System.out.println("Se ha suscrito un nuevo observador: " + o.getClass().getSimpleName());
    }

    @Override
    public void removerObservador(Observer o) {
        observadores.remove(o);
        System.out.println("Se ha desuscrito un observador: " + o.getClass().getSimpleName());
    }

    @Override
    public void notificarObservadores(String accion, Curso curso) {
        System.out.println("Enviando notificaciones...");
        for (Observer observador : observadores) {
            observador.actualizar(accion, curso);
        }
    }
}