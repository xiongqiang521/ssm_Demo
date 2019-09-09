package builder.builder;

import builder.interfaces.Item;
import builder.interfaces.Packing;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 8:57
 */
public abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return new Wrapper();
    }


}
