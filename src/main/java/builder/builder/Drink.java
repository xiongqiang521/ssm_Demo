package builder.builder;

import builder.interfaces.Item;
import builder.interfaces.Packing;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 9:01
 */
public abstract class Drink implements Item {
    @Override
    public Packing getPacking() {
        return new Bottle();
    }
}
