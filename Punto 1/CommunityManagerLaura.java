public class CommunityManagerLaura implements Observer {
    @Override
    public void actualizar(String accion, Curso curso) {
        System.out.println("Community Manager Laura: Contenido fresco ");
        if ("NUEVO".equals(accion)) {
            System.out.println("Creando posts sobre: '" + curso.getNombre() + "'.");
        } else if ("ELIMINADO".equals(accion)) {
            System.out.println("Archivando publicaciones antigus del curso: '" + curso.getNombre() + "'.");
        }
    }
}