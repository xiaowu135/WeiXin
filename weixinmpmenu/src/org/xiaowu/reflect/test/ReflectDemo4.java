package org.xiaowu.reflect.test;

import java.lang.reflect.Field;

/**
 * 获取该类的所有的属性名称
 * 
 * 
 * @author WQ
 *
 */
public class ReflectDemo4 {
	public static void main(String[] args){
        try {
            Class c = Class.forName("org.xiaowu.reflect.test.Person");
            Field[] fields = c.getDeclaredFields();
            for(Field field :fields){
                System.out.println(field.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
