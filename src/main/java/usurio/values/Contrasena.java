package usurio.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Contrasena implements ValueObject <String>{
    private final String value;

    public Contrasena(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException(" debe tener una contraseña");

        }
    }

    public String value(){
        return null;
    }
}
