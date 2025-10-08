public class WebmasterAndrea implements Observer {
    @Override
    public void actualizar(String accion, Curso curso) {
        System.out.println("Webmaster Andrea: Notificacion recibida!");
        if ("NUEVO".equals(accion)) {
            System.out.println(" Agregando el curso '" + curso.getNombre() + "' al sitio web de EDCO.");
        } else if ("ELIMINADO".equals(accion)) {
            System.out.println(" Retirando el curso '" + curso.getNombre() + "' del sitio web.");
        }
    }
}