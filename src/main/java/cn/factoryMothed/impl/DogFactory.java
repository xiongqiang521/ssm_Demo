package cn.factoryMothed.impl;

import cn.factoryMothed.interfaces.Animal;
import cn.factoryMothed.interfaces.AnimalFactory;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 19:28
 */
public class DogFactory implements AnimalFactory {
    @Override
    public Animal creatAnimal() {
        return new Dog();
    }
}
