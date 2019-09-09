package cn.simpleFactory.test;

import cn.simpleFactory.impl.Shape_im_1;
import cn.simpleFactory.interfaces.Shape;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 15:53
 */
public class TestFactory implements Cloneable {
    private int id = 1;
    private String name = "123";
    private Shape shape = new Shape_im_1();

    public static void main(String[] args) throws CloneNotSupportedException {
        TestFactory test = new TestFactory();
        TestFactory clone = (TestFactory) test.clone();

        if (clone.shape == test.shape) {

            System.out.println("相同");
        } else {
            System.out.println("bu相同");

        }

        // ShapeFactory factory=new ShapeFactory();
        // Shape shape = factory.getShape("1");
        // shape.run();


    }
}


/*
优化：
    1、将对象方法，换成静态方法
    2、其他人使用时不知道需要填入的参数，枚举类型，防止建对象时出错
 */
