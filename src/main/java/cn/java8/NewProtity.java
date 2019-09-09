package cn.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mechrevo
 * @version v1.0
 * 2019/9/9 8:52
 */
public interface NewProtity {

    static void method(){
        List<String> stringList=new ArrayList<>();
        stringList.add("1");
        stringList.add("2");
        stringList.add("1");
        stringList.add("3");
        stringList.add("4");

        stringList.stream().distinct().forEach(str -> System.out.println(str));
    }

    public static void main(String[] args) {
        NewProtity.method();
    }
}
