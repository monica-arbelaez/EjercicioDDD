package usurio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Direccion implements ValueObject <String>{

    private final String value;

    public Direccion(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("debes de tener una dirección ");

        }

    }
    public String value(){

        return null;
    }
}
