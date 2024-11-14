package Plataformas;

public class WhatsApp implements PlataformaNotificaciones {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando por Plataformas.WhatsApp: " + mensaje);
    }
}
