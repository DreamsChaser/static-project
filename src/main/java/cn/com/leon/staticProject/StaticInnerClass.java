package cn.com.leon.staticProject;

import org.junit.Test;

/**
 * Created by wangDi on 2017/7/19.
 * 静态内部类
 */
public class StaticInnerClass {

    private String msg = "外部类成员变量";
    private static int staticTemp = 0;


    public void outerMethod() {
        Inner inner = new Inner();
        System.out.println(inner.innerTemp);
        System.out.println(StaticInner.staticInnerTemp);
    }

    public class Inner {
        int innerTemp = 2;
        //        static int staticTemp = 2; 非静态内部类中不能定义静态变量
        public void commonInnerMethod() {
            System.out.println(msg);
            System.out.println(staticTemp);
        }
    }

    public static class StaticInner {
        static int staticInnerTemp = 3;
        public void staticInnerMethod() {
//            System.out.println(msg); 静态内部类不能调用外部非静态变量
            System.out.println(staticTemp);
        }
    }
}