
public class Simulador2 {

    public static void main(String[] args) {
        Notificador notificador = new Notificador();

        String emailUsuario = "laura.molano@email.com";
        String telefonoUsuario = "3001234567";
        String nombreUsuario = "Laura Molano";

        System.out.println("--------------------------------------------------\n");

        System.out.println("Notificacion de una nueva transaccion.");
        notificador.setEstrategia(new NotificacionPush());
        notificador.ejecutarNotificacion(nombreUsuario, "Compra de $45.000 en Crepes & Waffles aprobada.");

        System.out.println("\nEnvio de una promocion semanal.");
        notificador.setEstrategia(new NotificacionEmail());
        notificador.ejecutarNotificacion(emailUsuario, " Aprovecha 2x1 en entradas de cine con tu tarjeta.");

        System.out.println("\n alerta de seguridad importante.");
        notificador.setEstrategia(new NotificacionSms());
        notificador.ejecutarNotificacion(telefonoUsuario, "Alerta: Se detecto un inicio de sesion desde un nuevo dispositivo. Si no fuiste tu, contacta a soporte.");
        
        System.out.println("\n--------------------------------------------------");
    }
}



// Se agregan los datos del usuario y se simulan diferentes escenarios de notificación en este caso push, email y sms respectivamente.