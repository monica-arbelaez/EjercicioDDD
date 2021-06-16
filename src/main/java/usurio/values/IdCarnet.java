package usurio.values;

import co.com.sofka.domain.generic.Identity;

public class IdCarnet extends Identity {

    public IdCarnet(){
    }
    private IdCarnet(String id){
        super(id);
    }
    public static IdCarnet of(String  id){
        return new IdCarnet(id);
    }
}
