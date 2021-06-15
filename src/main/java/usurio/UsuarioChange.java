package usurio;

import co.com.sofka.domain.generic.EventChange;
import usurio.events.*;


public class UsuarioChange extends EventChange {
    public UsuarioChange(Usuario usuario){
        //acá se aplica cada evento de dominio que tenemos dentro del agregado

        apply((UsuarioRegistrado event)->{
            usuario.nombre = event.getNombre();
            usuario.cedula = event.getCedula();
            usuario.direccion = event.getDireccion();
        });
        apply((UsuarioModificado event)->{
            usuario.nombre = event.getNombre();
            usuario.cedula = event.getCedula();
            usuario.direccion = event.getDireccion();
        });

        apply((CuentaAgregada event)->{
            usuario.agregarCuenta(event.getIdCuenta(), event.getContrasena(), event.getEmail());

        });
        apply((CuentaModificada event)->{
            usuario.modificarCuenta(event.getCuenta());
        });
        apply((CarnetCreado event)->{
            usuario.crearCarnet(event.getIdCarnet(), event.getFechaDeVencimiento());
        });
        apply((CarnetModificado event)->{
            usuario.modificarCarnet(event.getIdCarnet(), event.getFechaDeVencimiento());
        });

    }



}
