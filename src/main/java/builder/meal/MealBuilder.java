package builder.meal;

import builder.builder.ChickenBurger;
import builder.builder.Coke;
import builder.builder.Pepsi;
import builder.builder.VerBurger;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 9:37
 */
public class MealBuilder {
    public static void main(String[] args) {
        MealBuilder builder =new MealBuilder();
        builder.meal01();
        builder.meal02();
    }

    private void meal01(){
        Meal meal =new Meal();
        meal.add(new ChickenBurger());
        meal.add(new Coke());
        System.out.println("套餐一 ： \t总价："+ meal.getPrices());
        meal.show();
    }
    private void meal02(){
        Meal meal =new Meal();
        meal.add(new VerBurger());
        meal.add(new Pepsi());
        System.out.println("套餐二 ：\t总价："+ meal.getPrices());
        meal.show();
    }


}
