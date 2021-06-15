package usurio.events;

import co.com.sofka.domain.generic.DomainEvent;
import usurio.values.FechaDeVencimiento;
import usurio.values.IdCarnet;

public class CarnetModificado extends DomainEvent {
    private final FechaDeVencimiento fechaDeVencimiento;
    private final IdCarnet idCarnet;

    public CarnetModificado(IdCarnet idCarnet, FechaDeVencimiento fechaDeVencimiento) {
        super("sofka.usuario.carnetmodificado");
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.idCarnet =idCarnet;
    }

    public FechaDeVencimiento getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public IdCarnet getIdCarnet() {
        return idCarnet;
    }
}
