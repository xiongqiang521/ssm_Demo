package cn.adapter.test;

import cn.adapter.adapter.Duck2Chick;
import cn.adapter.impl.Chick;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 15:15
 */
public class TestAdapter {
    public static void main(String[] args) {
        Chick chick=new Duck2Chick();
        chick.ge();
        System.out.println(chick.name());
    }
}
