package ejercicio3;

public class CanalPush implements CanalDeEnvio {
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Notificación push a " + destinatario + ": " + mensaje);
    }
}
