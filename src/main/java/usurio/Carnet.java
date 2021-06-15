package usurio;

import co.com.sofka.domain.generic.Entity;
import usurio.values.Email;
import usurio.values.FechaDeVencimiento;
import usurio.values.IdCarnet;

import java.util.Objects;

public class Carnet extends Entity<IdCarnet> {

    private FechaDeVencimiento fechaDeVencimiento;

    public Carnet(IdCarnet entityId, FechaDeVencimiento fechaDeVencimiento) {

        super(entityId);
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
    public void ActualizarFechaDeVencimiento(FechaDeVencimiento fechaDeVencimiento) {
        this.fechaDeVencimiento = Objects.requireNonNull(fechaDeVencimiento);

    }
}
