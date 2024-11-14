package TiposDeNotificaciones;

import Plataformas.PlataformaNotificaciones;

public abstract class NotificarPedido {
    public PlataformaNotificaciones plataforma;

    public NotificarPedido(PlataformaNotificaciones plataforma){
        this.plataforma = plataforma;
    }

    public abstract void notificar(String detallesPedido);
}