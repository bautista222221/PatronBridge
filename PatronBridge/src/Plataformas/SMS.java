package Plataformas;

public class SMS implements PlataformaNotificaciones {
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando por Mensaje de Texto: " + mensaje);
    }
}
