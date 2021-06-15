package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.Contrasena;
import usurio.values.IdCuenta;

public class ContrasenaModificada extends DomainEvent {
    private final Contrasena contrasena;

    public ContrasenaModificada(IdCuenta entityId, Contrasena contrasena) {
        super("sofka.usuario.contrasenamodificada");
        this.contrasena =contrasena;
    }

    public Contrasena getContrasena() {
        return contrasena;
    }
}
