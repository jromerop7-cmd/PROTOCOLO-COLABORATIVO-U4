package ejercicio3;

public class Mensajero2 {
    private CanalDeEnvio canal;

    public Mensajero2(CanalDeEnvio canal) {
        this.canal = canal;
    }

    public void enviarMensaje(String destinatario, String mensaje) {
        canal.enviar(destinatario, mensaje);
    }
}

