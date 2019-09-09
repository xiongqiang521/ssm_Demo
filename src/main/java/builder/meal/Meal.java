package builder.meal;

import builder.interfaces.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 9:33
 */
public class Meal {
    private List<Item> items = new ArrayList<>();

    public void add( Item item){
        boolean add = items.add(item);
    }

    public double getPrices(){
        double p=0.0;
        for (Item item : items) {
            p = p + item.getPrice();
        }
        return p;
    }

    public void show(){
        items.forEach(item -> {
            System.out.print("\t商品名称: "+ item.getName());
            System.out.print("\t商品包装: "+ item.getPacking().packing());
            System.out.print("\t商品价格: "+ item.getPrice());
            System.out.println();
        });
    }

}
