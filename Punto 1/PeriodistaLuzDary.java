public class PeriodistaLuzDary implements Observer {
    @Override
    public void actualizar(String accion, Curso curso) {
        System.out.println("Periodista Luz Dary: Enterada de la novedad!");
        if ("NUEVO".equals(accion)) {
            System.out.println("Preparando spot publicitario para el nuevo curso: '" + curso.getNombre() + "'.");
        }
    }
}

