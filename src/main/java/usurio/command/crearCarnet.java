package usurio.command;

import co.com.sofka.domain.generic.Command;
import usurio.values.FechaDeVencimiento;
import usurio.values.IdCarnet;
import usurio.values.IdUsuario;

public class crearCarnet implements Command {
    private final IdUsuario entityid;
    private final FechaDeVencimiento fechaDeVencimiento;
    private final IdCarnet idCarnet;

    public crearCarnet(IdUsuario entityid, IdCarnet idCarnet, FechaDeVencimiento fechaDeVencimiento){
        this.entityid =entityid;
        this.idCarnet = idCarnet;
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}
