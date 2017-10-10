package org.xiaowu.reflect.test;

import java.lang.reflect.Method;




/**
 * 
 * 		public Field getDeclaredField(String name) // 获得该类自身声明的所有变量，不包括其父类的变量
		public Field getField(String name) // 获得该类自所有的public成员变量，包括其父类变量
 * 
 * 
 * @author WQ
 *
 */
public class ReflectDemo1 {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("org.xiaowu.reflect.test.Person");
			Method[] methods = c.getDeclaredMethods();
			for (Method m : methods) {
				String methodName = m.getName();
				System.out.println(methodName);

				/**
				 * 
				 * getName setName getAge setAge fun fun
				 * 
				 * 
				 */
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
