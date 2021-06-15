package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.FechaDeVencimiento;
import usurio.values.IdCarnet;

public class CarnetModificado extends DomainEvent {
    private final FechaDeVencimiento fechaDeVencimiento;

    public CarnetModificado(IdCarnet entityId, FechaDeVencimiento fechaDeVencimiento) {
        super("sofka.usuario.carnetmodificado");
        this.fechaDeVencimiento = fechaDeVencimiento;
    }
}
