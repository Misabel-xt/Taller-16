package Ejercicio3;

public class MensajeSMS implements Mensaje {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("[SMS] Enviando: '" + mensaje + "'");
    }
}
