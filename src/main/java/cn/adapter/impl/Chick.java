package cn.adapter.impl;

import cn.adapter.interfaces.ChickInterfaces;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 15:09
 */
public class Chick implements ChickInterfaces{
    @Override
    public String name() {
        return "我是鸡同鸭讲的 >>鸡<< ";
    }

    @Override
    public void ge() {
        System.out.println("小鸡咯咯叫");
    }
}
