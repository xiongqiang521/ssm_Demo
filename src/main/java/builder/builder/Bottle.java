package builder.builder;

import builder.interfaces.Packing;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 8:51
 */
public class Bottle implements Packing {
    @Override
    public String packing() {
        return "瓶";
    }
}
