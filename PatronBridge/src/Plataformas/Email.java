package Plataformas;

public class Email implements PlataformaNotificaciones {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando por Plataformas.Email: " + mensaje);
    }
}
