package usurio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cedula implements ValueObject<String> {
    private final String value;

    public Cedula(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException(" no puede estar la cedula vacia ");

        }

    }

    public String value(){
        return null;
    }
}
