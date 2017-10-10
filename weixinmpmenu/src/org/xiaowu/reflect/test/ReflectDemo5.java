package org.xiaowu.reflect.test;

import java.lang.reflect.Constructor;


/**
 * 执行一个带参的构造函数
 * 
 * @author WQ
 *
 */
public class ReflectDemo5 {
	public static void main(String[] args){
        try {
            Class c = Class.forName("org.xiaowu.reflect.test.Person");
            //获取构造函数
            Constructor constructor = c.getDeclaredConstructor(String.class);
            constructor.setAccessible(true);//设置是否允许访问，因为该构造器是private的，所以要手动设置允许访问，如果构造器是public的就不需要这行了。
            constructor.newInstance("tengj");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
