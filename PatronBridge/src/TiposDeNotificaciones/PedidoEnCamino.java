package TiposDeNotificaciones;

import Plataformas.PlataformaNotificaciones;

public class PedidoEnCamino extends NotificarPedido {

    public PedidoEnCamino(PlataformaNotificaciones plataforma){
        super(plataforma);
    }

    @Override
    public void notificar(String detallesPedido) {
        plataforma.enviarMensaje("El pedido ("+detallesPedido+") esta en camino!");
    }
}
