package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.Cedula;
import usurio.values.Direccion;
import usurio.values.Nombre;

public class UsuarioRegistrado extends DomainEvent {
    private final Nombre nombre;
    private final Cedula cedula;
    private final Direccion direccion;


    public UsuarioRegistrado( Nombre nombre, Cedula cedula, Direccion direccion) {
        super("sofka.usuario.usuarioregistrado");
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
