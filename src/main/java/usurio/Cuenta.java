package usurio;

import co.com.sofka.domain.generic.Entity;
import usurio.values.*;

import java.util.Objects;

public class Cuenta extends Entity <IdCuenta>{
    private  Sancion sancion;
    private Email email;
    private Contraseña contraseña;


    public Cuenta(IdCuenta entityId, Email email, Contraseña contraseña) {
        super(entityId);
        this.email = email;
        this.contraseña = contraseña;
    }

    public void ActualizarEmail(Email email) {
        this.email = Objects.requireNonNull(email);

    }

    public Sancion sancion(){
        return sancion;
    }

    public Email email() {
        return email;
    }


}
