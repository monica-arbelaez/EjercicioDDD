package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.Cuenta;

public class CuentaModificada extends DomainEvent {
    private final Cuenta cuenta;

    public CuentaModificada(Cuenta cuenta) {
        super("biblioteca.usuario.emailmodificado");
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
