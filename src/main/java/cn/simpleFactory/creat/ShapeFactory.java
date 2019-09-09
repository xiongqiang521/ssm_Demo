package cn.simpleFactory.creat;

import cn.simpleFactory.impl.Shape_im_1;
import cn.simpleFactory.impl.Shape_im_2;
import cn.simpleFactory.impl.Shape_im_3;
import cn.simpleFactory.interfaces.Shape;

/**
 * Shape的工厂类，创建Shape接口的实现类
 * @author Mechrevo
 * @version v1.0
 * 2019/9/2 15:43
 */
public class ShapeFactory {
    public final static String ShapeIm1= Shape_im_1.class.getName();
    public final static String ShapeIm2= Shape_im_2.class.getName();
    public final static String ShapeIm3= Shape_im_3.class.getName();

    public static Shape getShape(String classname){
        if (classname == null) {
            System.out.println("输入classname为null，返回值为null");
            return null;
        }

        try {
            return (Shape)Class.forName(classname).newInstance();
        }  catch (Exception e) {
            System.out.println("通过反射获取"+classname+"类失败");
        }


        if (classname.equalsIgnoreCase("1") ) {
            return new Shape_im_1();
        }else if( classname.equalsIgnoreCase("Shape_im_2")){
            return new Shape_im_2();
        }else if(classname.equalsIgnoreCase("Shape_im_2")){
            return new Shape_im_3();
        }else {
            System.out.println("输入classname有误，返回值为null");
            return null;
        }
    }



}
