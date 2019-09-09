package cn.factoryMothed.impl;

import cn.factoryMothed.interfaces.Animal;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 19:24
 */
public class Pig implements Animal {
    public Pig() {
        System.out.println("猪类创建");
    }

    @Override
    public void run() {
        System.out.println("猪在跑");
    }
}
