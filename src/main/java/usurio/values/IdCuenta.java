package usurio.values;

import co.com.sofka.domain.generic.Identity;

public class IdCuenta extends Identity {

    public IdCuenta(){
    }
    private IdCuenta(String id){
        super(id);
    }
    public static IdCuenta of(String  id){
        return new IdCuenta(id);
    }

}
