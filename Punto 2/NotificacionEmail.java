public class NotificacionEmail implements EstrategiaNotificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println(" ");
        System.out.println("Enviando correo a: " + usuario);
        System.out.println("Mensaje: ---" + mensaje + "----");
        System.out.println("Estado: [ENVIADO]");
        System.out.println(" ");
    }
}