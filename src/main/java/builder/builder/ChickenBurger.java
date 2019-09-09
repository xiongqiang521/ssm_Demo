package builder.builder;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 9:28
 */
public class ChickenBurger extends Burger {
    @Override
    public String getName() {
        return "鸡肉堡";
    }

    @Override
    public double getPrice() {
        return 30.0;
    }
}
