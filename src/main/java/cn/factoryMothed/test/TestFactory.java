package cn.factoryMothed.test;

import cn.factoryMothed.impl.CatFactory;
import cn.factoryMothed.interfaces.Animal;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 19:30
 */
public class TestFactory {
    public static void main(String[] args) {

        Animal animal =  new CatFactory().creatAnimal();
        animal.run();

    }
}
