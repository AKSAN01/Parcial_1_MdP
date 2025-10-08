public class Notificador {
    private EstrategiaNotificacion estrategia;

    public void setEstrategia(EstrategiaNotificacion estrategia) {
        this.estrategia = estrategia;
    }


    public void ejecutarNotificacion(String usuario, String mensaje) {
        if (estrategia == null) {
            System.out.println("Error: No se ha definido una estrategia de notificación.");
            return;
        }
        estrategia.enviar(usuario, mensaje);
    }
}