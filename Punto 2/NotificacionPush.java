public class NotificacionPush implements EstrategiaNotificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println(" ");
        System.out.println("Enviando Notificación PUSH a: " + usuario);
        System.out.println("Mensaje: ---" + mensaje + "---");
        System.out.println("Estado: [VISTO]");
        System.out.println(" ");
    }
}