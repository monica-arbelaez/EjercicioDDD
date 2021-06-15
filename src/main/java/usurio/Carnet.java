package usurio;

import co.com.sofka.domain.generic.Entity;
import usurio.values.FechaDeVencimiento;
import usurio.values.IdCarnet;

public class Carnet extends Entity<IdCarnet> {

    private FechaDeVencimiento fechaDeVencimiento;

    public Carnet(IdCarnet entityId, FechaDeVencimiento fechaDeVencimiento) {
        super(entityId);
    }
}
