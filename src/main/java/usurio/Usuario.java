package usurio;

import co.com.sofka.domain.generic.AggregateEvent;
import usurio.events.*;
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

    public void modificarUsuario(IdUsuario entityId, Nombre nombre, Cedula cedula, Direccion direccion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(direccion);

        appendChange(new UsuarioModificado(entityId,nombre,cedula,direccion)).apply();
    }

    public void agregarCuenta(IdCuenta entityId, Contrasena contrasena, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);
        Objects.requireNonNull(contrasena);

        appendChange(new CuentaAgregada(entityId, contrasena, email)).apply();
    }

    public void modificiarContraseña(IdCuenta entityId, Contrasena contrasena){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(contrasena);
        appendChange(new ContrasenaModificada(entityId, contrasena)).apply();
    }

    public void modificarEmail(IdCuenta entityId, Email email){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(email);

        appendChange(new EmailModificado(entityId, email)).apply();
    }

    public void modificarCuenta(Cuenta cuenta){
        Objects.requireNonNull(cuenta);
        appendChange(new CuentaModificada(cuenta)).apply();
    }

    public void crearCarnet(IdCarnet entityId, FechaDeVencimiento fechaDeVencimiento){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(fechaDeVencimiento);

        appendChange(new CarnetCreado(entityId, fechaDeVencimiento)).apply();
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
