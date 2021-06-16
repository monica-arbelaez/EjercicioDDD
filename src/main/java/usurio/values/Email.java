package usurio.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sun.nio.sctp.IllegalReceiveException;

import java.util.Objects;

public class Email implements ValueObject <String> {
    private final String value;

    public Email(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("debes de tener una correo electromico");

        }
        if(!value.matches( "/^([w-]+(?:.[w-]+)*)@((?:[w-]+.)*w[w-]{0,66}).([com net org]{3}(?:.[a-z]{6})?)$/")){
            throw new IllegalReceiveException("El email no es valido");
        }
    }

    public String value(){
        return null;
    }
}
