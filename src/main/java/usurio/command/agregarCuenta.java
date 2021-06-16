package usurio.command;

import co.com.sofka.domain.generic.Command;
import usurio.values.Contrasena;
import usurio.values.Email;
import usurio.values.IdCuenta;
import usurio.values.IdUsuario;

public class agregarCuenta implements Command {
    private final IdUsuario entityId ;
    private final IdCuenta idCuenta;
    private final Contrasena contrasena;
    private final Email email;


    public  agregarCuenta(IdUsuario entityId, IdCuenta idCuenta, Contrasena contrasena, Email email){
        this.entityId = entityId;
        this.idCuenta = idCuenta;
        this.contrasena = contrasena;
        this.email = email;

    }

    public IdUsuario getEntityId() {
        return entityId;
    }

    public IdCuenta getIdCuenta() {
        return idCuenta;
    }

    public Contrasena getContrasena() {
        return contrasena;
    }

    public Email getEmail() {
        return email;
    }
}
