package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.Email;
import usurio.values.IdCuenta;

public class EmailModificado extends DomainEvent {
    private final Email email;

    public EmailModificado(IdCuenta entityId, Email email) {
        super("biblioteca.usuario.emailmodificado");
        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
