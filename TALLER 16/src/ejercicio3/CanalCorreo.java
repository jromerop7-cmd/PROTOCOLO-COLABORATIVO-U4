package ejercicio3;

public class CanalCorreo implements CanalDeEnvio {
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Correo a " + destinatario + ": " + mensaje);
    }
}

