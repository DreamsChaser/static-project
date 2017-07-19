package cn.com.leon.staticProject;

import org.junit.Test;

/**
 * Created by wangDi on 2017/7/18.
 *
 * 1、静态变量:static修饰的成员变量成为静态变量，所有类的实例共享同一变量
 * 类在加载时只分配一块存储空间(不能修饰局部变量)
 *
 */
public class StaticVariable {

    static int temp = 10;

    /**
     * 每次让temp值加1以此来验证所有的实例共享同一static变量
     */
    public void addTemp(){
        temp++;
    }

    @Test
    public void testStaticVariable(){
        StaticVariable sv1 = new StaticVariable();
        StaticVariable sv2 = new StaticVariable();
        System.out.println("SV.temp:"+StaticVariable.temp+" sv1.temp:"+sv1.temp+" sv2.temp:"+sv2.temp);
        sv1.addTemp();
        System.out.println("SV.temp:"+StaticVariable.temp+" sv1.temp:"+sv1.temp+" sv2.temp:"+sv2.temp);
        sv2.addTemp();
        System.out.println("SV.temp:"+StaticVariable.temp+" sv1.temp:"+sv1.temp+" sv2.temp:"+sv2.temp);
        sv1.temp = 1;
        System.out.println("SV.temp:"+StaticVariable.temp+" sv1.temp:"+sv1.temp+" sv2.temp:"+sv2.temp);
    }
}
