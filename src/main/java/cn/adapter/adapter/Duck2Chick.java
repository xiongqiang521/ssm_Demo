package cn.adapter.adapter;

import cn.adapter.impl.Chick;
import cn.adapter.impl.Duck;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/3 15:13
 */
public class Duck2Chick extends Chick {
    Duck duck=new Duck();

    @Override
    public void ge() {
        duck.gu();
    }
}
