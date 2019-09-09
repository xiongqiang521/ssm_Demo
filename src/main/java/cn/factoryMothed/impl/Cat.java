package cn.factoryMothed.impl;

import cn.factoryMothed.interfaces.Animal;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 19:24
 */
public class Cat implements Animal {
    public Cat() {
        System.out.println("猫类创建");
    }

    @Override
    public void run() {
        System.out.println("猫在跑");
    }
}
