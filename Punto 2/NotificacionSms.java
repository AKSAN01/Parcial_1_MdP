public class NotificacionSms implements EstrategiaNotificacion {
    @Override
    public void enviar(String usuario, String mensaje) {
        System.out.println(" ");
        System.out.println("Enviando SMS a: " + usuario);
        System.out.println("Mensaje: --- " + mensaje + "---");
        System.out.println("Estado: [ENTREGADO]");
        System.out.println(" ");
    }
}
