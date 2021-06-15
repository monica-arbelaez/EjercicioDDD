package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.Contraseña;
import usurio.values.Email;
import usurio.values.IdCuenta;


public class CuentaAgregada extends DomainEvent {
    private final Contraseña contraseña;
    private final Email email;

    public CuentaAgregada(IdCuenta entityId, Contraseña contraseña,Email email) {
        super("sofka.usuario.cuentaagregada");
        this.contraseña = contraseña;
        this.email = email;
    }

}
