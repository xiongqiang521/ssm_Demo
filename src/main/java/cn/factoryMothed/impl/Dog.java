package cn.factoryMothed.impl;

import cn.factoryMothed.interfaces.Animal;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 19:24
 */
public class Dog implements Animal {
    public Dog() {
        System.out.println("狗类创建");
    }

    @Override
    public void run() {
        System.out.println("狗在跑");
    }
}
