package TiposDeNotificaciones;

import Plataformas.PlataformaNotificaciones;

public class PedidoEntregado extends NotificarPedido {

    public PedidoEntregado(PlataformaNotificaciones plataformaNotificaciones){
        super(plataformaNotificaciones);
    }

    @Override
    public void notificar(String detallesPedido) {
        plataforma.enviarMensaje("El pedido ("+detallesPedido+") se ha entregado!");
    }
}
