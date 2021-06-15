package usurio;

import co.com.sofka.domain.generic.Entity;
import usurio.values.*;

import java.util.Objects;

public class Cuenta extends Entity <IdCuenta>{
    private Email email;
    private Contrasena contrasena;


    public Cuenta(IdCuenta entityId, Email email, Contrasena contrasena) {
        super(entityId);
        this.email = email;
        this.contrasena = contrasena;
    }

    public void ActualizarEmail(Email email) {
        this.email = Objects.requireNonNull(email);

    }
    public void ActualizarContrasena(Contrasena contrasena){
        this.contrasena = Objects.requireNonNull(contrasena);
    }

    public Contrasena contasena(){
        return contrasena;
    }

    public Email email() {
        return email;
    }


}
