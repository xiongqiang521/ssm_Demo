package builder.builder;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 9:29
 */
public class Coke extends Drink {
    @Override
    public String getName() {
        return "可口可乐";
    }

    @Override
    public double getPrice() {
        return 8;
    }
}
