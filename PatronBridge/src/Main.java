import Plataformas.Email;
import Plataformas.PlataformaNotificaciones;
import Plataformas.SMS;
import Plataformas.WhatsApp;
import TiposDeNotificaciones.*;

public class Main {
    public static void main(String[] args) {
        PlataformaNotificaciones email = new Email();
        PlataformaNotificaciones sms = new SMS();
        PlataformaNotificaciones wpp = new WhatsApp();

        NotificarPedido nuevoPedidoEmail = new NuevoPedido(email);
        NotificarPedido pedidoCancelado = new PedidoCancelado(sms);
        NotificarPedido pedidoEnCamino = new PedidoEnCamino(wpp);
        NotificarPedido pedidoEntregado = new PedidoEntregado(wpp);

        nuevoPedidoEmail.notificar("Detalle: Producto: Cafetera, Cantidad: 2.");
        pedidoCancelado.notificar("Detalle: Producto: Tostadora, Cantidad: 1.");
        pedidoEnCamino.notificar("Detalle: Producto: Microondas, Cantidad: 5.");
        pedidoEntregado.notificar("Detalle: Producto: SmartTV, Cantidad: 11.");
    }
}
