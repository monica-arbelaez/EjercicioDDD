package usurio;

import co.com.sofka.domain.generic.AggregateEvent;
import usurio.events.CuentaAgregada;
import usurio.events.UsuarioRegistrado;
import usurio.values.*;

import java.util.Objects;
import java.util.Set;

public class Usuario extends AggregateEvent<IdUsuario> {

    protected Nombre nombre;
    protected Cedula cedula;
    protected Direccion direccion;
    protected Set<Cuenta> cuenta;
    protected Set<Carnet> carnet;


    public Usuario(IdUsuario entityId, Nombre nombre, Cedula cedula, Direccion direccion){

        super(entityId);
        appendChange(new UsuarioRegistrado(nombre,cedula,direccion)).apply();
    }
    public void agregarCuenta(IdCuenta entityId ,Contraseña contraseña, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        Objects.requireNonNull(contraseña);

        appendChange(new CuentaAgregada(entityId, contraseña, email)).apply();
    }
    public void editarNombre(Nombre nombre){
        this.nombre = Objects.requireNonNull(nombre);
    }
    public void editarCedula(Cedula cedula){
        this.cedula = Objects.requireNonNull(cedula);
    }
    public void editarDireccion(Direccion direccion){
        this.direccion = Objects.requireNonNull(direccion);
    }

}
