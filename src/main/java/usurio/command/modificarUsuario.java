package usurio.command;

import co.com.sofka.domain.generic.Command;
import usurio.values.Cedula;
import usurio.values.Direccion;
import usurio.values.IdUsuario;
import usurio.values.Nombre;

public class modificarUsuario implements Command {
    private IdUsuario entityId;
    private final Nombre nombre;
    private final Cedula cedula;
    private final Direccion direccion;


    public modificarUsuario( IdUsuario entityId, Nombre nombre, Cedula cedula, Direccion direccion){
        this.entityId = entityId;
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
    }

    public IdUsuario getEntityId() {
        return entityId;
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
