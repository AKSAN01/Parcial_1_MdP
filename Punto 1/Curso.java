public class Curso {
    private String nombre;
    private String Descripcion;

    public Curso(String nombre, String descripcion) {
        this.nombre = nombre;
        Descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return "Curso " + nombre;
    }

}