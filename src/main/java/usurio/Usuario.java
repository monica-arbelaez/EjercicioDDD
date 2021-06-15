package usurio;

import co.com.sofka.domain.generic.AggregateEvent;
import usurio.values.IdUsuario;
import usurio.values.Nombre;

public class Usuario extends AggregateEvent<IdUsuario> {

    protected Nombre nombre;

    public Usuario(IdUsuario entityId, Nombre nombre){
        super(entityId);
    }

}
