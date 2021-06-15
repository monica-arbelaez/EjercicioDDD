package usurio;

import co.com.sofka.domain.generic.AggregateEvent;
import usurio.events.*;
import usurio.values.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Usuario extends AggregateEvent<IdUsuario> {


    protected Nombre nombre;
    protected Cedula cedula;
    protected Direccion direccion;
    protected Cuenta cuenta;
    protected Carnet carnet;


    public Usuario(IdUsuario entityId, Nombre nombre, Cedula cedula, Direccion direccion){

        super(entityId);
        appendChange(new UsuarioRegistrado(nombre,cedula,direccion)).apply();
    }

    // para afectar los estados se impleneta un constructor privado
    private Usuario(IdUsuario entityId){
        super(entityId);
        // esta pendiente del evento para cambiar el estado
        subscribe((new UsuarioChange(this)));
    }

    public void modificarUsuario(IdUsuario entityId, Nombre nombre, Cedula cedula, Direccion direccion){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(cedula);
        Objects.requireNonNull(direccion);

        appendChange(new UsuarioModificado(entityId,nombre,cedula,direccion)).apply();
    }

    public void agregarCuenta(IdCuenta idCuenta, Contrasena contrasena, Email email){
        Objects.requireNonNull(idCuenta);
        Objects.requireNonNull(email);
        Objects.requireNonNull(contrasena);

        appendChange(new CuentaAgregada(idCuenta, contrasena, email)).apply();
    }
    public void modificarCuenta(Cuenta cuenta){
        Objects.requireNonNull(cuenta);
        appendChange(new CuentaModificada(cuenta)).apply();
    }

    public void crearCarnet(IdCarnet idCarnet, FechaDeVencimiento fechaDeVencimiento){
        Objects.requireNonNull(idCarnet);
        Objects.requireNonNull(fechaDeVencimiento);

        appendChange(new CarnetCreado(idCarnet, fechaDeVencimiento)).apply();
    }

    public void modificarCarnet(IdCarnet idCarnet, FechaDeVencimiento fechaDeVencimiento){
        Objects.requireNonNull(idCarnet);
        Objects.requireNonNull(fechaDeVencimiento);

        appendChange(new CarnetModificado(idCarnet, fechaDeVencimiento)).apply();
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
//

    public Nombre nombre(){
        return nombre;
    }
    public Cedula cedula(){
        return cedula;
    }
    public Direccion direccion(){
        return direccion;
    }
    public Cuenta cuenta(){
        return cuenta;
    }
    protected Carnet carnet(){
        return  carnet;
    }


}
