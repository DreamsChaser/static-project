package cn.com.leon.staticProject;

import org.junit.Test;

/**
 * Created by wangDi on 2017/7/19.
 * 静态方法
 * 只能调用static方法
 * 只能调用static变量
 * 不能引用this super
 */
public class StaticMethod {

    static int staticTemp = 1;//静态变量
    int commonTemp = 2;//非静态变量

    public static void staticMethod(){
        System.out.println(staticTemp);
    }

    public static void print(String s){
        System.out.println(s);
    }

    public void commonMethod(){
        System.out.println(staticTemp);
        System.out.println(commonTemp);
        staticMethod();
    }

    @Test
    public void testStaticMethod(){
        staticMethod();//静态方法
        commonMethod();//非静态方法
        StaticMethod.staticMethod();//无需实例化就可以直接调用静态方法
    }
}
