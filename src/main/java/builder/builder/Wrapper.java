package builder.builder;

import builder.interfaces.Packing;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 8:53
 */
public class Wrapper implements Packing {
    @Override
    public String packing() {
        return "袋装";
    }
}
