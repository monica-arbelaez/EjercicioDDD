package usurio.command;

import co.com.sofka.domain.generic.Command;
import usurio.Cuenta;
import usurio.values.IdUsuario;

public class modificarCuenta implements Command {
    private IdUsuario entityId;
    private Cuenta cuenta;

    public modificarCuenta(IdUsuario entityId, Cuenta cuenta){
        this.entityId = entityId;
        this.cuenta = cuenta;
    }

    public IdUsuario getEntityId() {
        return entityId;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }
}
