package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.Contrasena;
import usurio.values.Email;
import usurio.values.IdCuenta;


public class CuentaAgregada extends DomainEvent {
    private final Contrasena contraseña;
    private final Email email;

    public CuentaAgregada(IdCuenta entityId, Contrasena contraseña, Email email) {
        super("sofka.usuario.cuentaagregada");
        this.contraseña = contraseña;
        this.email = email;
    }

}
