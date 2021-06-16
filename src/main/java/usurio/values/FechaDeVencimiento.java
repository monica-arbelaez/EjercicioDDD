package usurio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Date;
import java.util.Objects;

public class FechaDeVencimiento implements ValueObject <Date> {

    private final Date value;

    public FechaDeVencimiento(Date value){
        this.value = Objects.requireNonNull(value);

    }

        public Date value(){
            return null;
        }
}
