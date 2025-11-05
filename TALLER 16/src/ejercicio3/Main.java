package ejercicio3;

public class Main {
    public static void main(String[] args) {
        Mensajero2 correo = new Mensajero2(new CanalCorreo());
        correo.enviarMensaje("juan@gmail.com", "Hola Juan, ¿cómo estás?");

        Mensajero2 sms = new Mensajero2(new CanalSMS());
        sms.enviarMensaje("3001234567", "Tu código es 9999");

        Mensajero2 push = new Mensajero2(new CanalPush());
        push.enviarMensaje("usuarioApp", "Tienes una nueva alerta");
    }
}

