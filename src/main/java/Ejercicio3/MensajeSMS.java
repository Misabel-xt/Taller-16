package Ejercicio3;

public class MensajeSMS implements Mensaje {
    @Override
    public void enviarMensaje() {
        System.out.println("Enviando mensaje SMS...");
    }
}
