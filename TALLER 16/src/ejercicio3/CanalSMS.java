package ejercicio3;

public class CanalSMS implements CanalDeEnvio {
    public void enviar(String destinatario, String mensaje) {
        System.out.println("SMS a " + destinatario + ": " + mensaje);
    }
}
