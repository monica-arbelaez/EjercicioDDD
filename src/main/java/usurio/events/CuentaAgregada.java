package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.Usuario;
import usurio.values.Contrasena;
import usurio.values.Email;
import usurio.values.IdCuenta;


public class CuentaAgregada extends DomainEvent {
    private final Contrasena contrasena;
    private final Email email;
    private final IdCuenta idCuenta;

    public CuentaAgregada(IdCuenta idCuenta, Contrasena contrasena, Email email) {
        super("sofka.usuario.cuentaagregada");
        this.contrasena = contrasena;
        this.email = email;
        this.idCuenta = idCuenta;
    }

    public Contrasena getContrasena() {
        return contrasena;
    }

    public Email getEmail() {
        return email;
    }

    public IdCuenta getIdCuenta() {
        return idCuenta;
    }
}


