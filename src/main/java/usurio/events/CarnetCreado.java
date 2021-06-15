package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.FechaDeVencimiento;
import usurio.values.IdCarnet;

public class CarnetCreado extends DomainEvent {
    private final FechaDeVencimiento fechaDeVencimiento;

    public CarnetCreado(IdCarnet entityId, FechaDeVencimiento fechaDeVencimiento) {
        super("sofka.usuario.carnetcreado");
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}
