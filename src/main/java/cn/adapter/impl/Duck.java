package cn.adapter.impl;

import cn.adapter.interfaces.DuckInterfaces;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 15:08
 */
public class Duck implements DuckInterfaces {
    @Override
    public String name() {
        return "我是鸡同鸭讲的 >>鸭<< ";
    }

    @Override
    public void gu() {
        System.out.println("小鸭咕咕叫");
    }
}
