package builder.interfaces;

/**
 * 例子：华莱士--套餐--包含不同汉堡，饮料 -- 汉堡和饮料采用不同的包装
 *                      汉堡 -- 鸡肉堡 、 蔬菜堡
 *                      饮料 -- 可乐 、 百事
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 19:57
 */
public interface Item {

    String getName();
    Packing getPacking();
    double getPrice();

}
