package cn.simpleFactory.impl;

import cn.simpleFactory.interfaces.Shape;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 15:39
 */
public class Shape_im_2 implements Shape {
    @Override
    public void run() {
        System.out.println("Shape_im_2 对象执行domain方法");
    }
}
