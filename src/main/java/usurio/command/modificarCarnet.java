package usurio.command;

import co.com.sofka.domain.generic.Command;
import usurio.values.FechaDeVencimiento;
import usurio.values.IdCarnet;
import usurio.values.IdUsuario;

public class modificarCarnet implements Command {
    private final IdUsuario entityId;
    private final FechaDeVencimiento fechaDeVencimiento;
    private final IdCarnet idCarnet;


    public modificarCarnet(IdUsuario entityId, IdCarnet idCarnet, FechaDeVencimiento fechaDeVencimiento){
        this.entityId = entityId;
        this.idCarnet = idCarnet;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}
