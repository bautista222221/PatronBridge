package TiposDeNotificaciones;

import Plataformas.PlataformaNotificaciones;

public class PedidoCancelado extends NotificarPedido {

    public PedidoCancelado(PlataformaNotificaciones plataformaNotificaciones){
        super(plataformaNotificaciones);
    }

    @Override
    public void notificar(String detallesPedido) {
        plataforma.enviarMensaje("El pedido ("+detallesPedido+") ha sido cancelado!");
    }
}
