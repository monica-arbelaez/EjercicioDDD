package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.*;

public class UsuarioModificado extends DomainEvent {
    private final Nombre nombre;
    private final Cedula cedula;
    private final Direccion direccion;


    public UsuarioModificado(IdUsuario entityId, Nombre nombre, Cedula cedula, Direccion direccion) {
        super("biblioteca.usuario.usuariomodificado");
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;

    }

    public Nombre getNombre() {
        return nombre;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public Direccion getDireccion() {
        return direccion;
    }
}
