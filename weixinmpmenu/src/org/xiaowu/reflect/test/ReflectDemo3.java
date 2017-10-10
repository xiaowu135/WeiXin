package org.xiaowu.reflect.test;

import java.lang.reflect.Field;

public class ReflectDemo3 {
	  public static void main(String[] args){
	        try {
	            Class c = Class.forName("org.xiaowu.reflect.test.Person");
	            //获取成员变量
	            Field field = c.getDeclaredField("msg"); //因为msg变量是private的，所以不能用getField方法
	            Object o = c.newInstance();
	            field.setAccessible(true);//设置是否允许访问，因为该变量是private的，所以要手动设置允许访问，如果msg是public的就不需要这行了。
	            Object msg = field.get(o);
	            System.out.println(msg);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
}
