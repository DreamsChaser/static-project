package cn.com.leon.staticProject;

import org.junit.Test;

/**
 * Created by wangDi on 2017/7/19.
 * 静态代码块、构造方法、构造代码块、普通代码块
 *
 */
public class StaticCodeBlock {
    public StaticCodeBlock(){
        System.out.println("构造方法");
    }
    {
        System.out.println("构造代码块");
    }
    static {
        System.out.println("静态代码块");
    }

    @Test
    public void testStaticCodeBlock(){
    }
}
