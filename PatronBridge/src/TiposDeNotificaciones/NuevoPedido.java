package TiposDeNotificaciones;

import Plataformas.PlataformaNotificaciones;

public class NuevoPedido extends NotificarPedido {

    public NuevoPedido(PlataformaNotificaciones plataforma){
        super(plataforma);
    }

    @Override
    public void notificar(String detallesPedido){
        plataforma.enviarMensaje("Nuevo Pedido: (" + detallesPedido+")");
    }
}
