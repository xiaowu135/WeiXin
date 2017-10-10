package org.xiaowu.reflect.test;

import java.lang.reflect.Method;

public class ReflectDemo2 {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("org.xiaowu.reflect.test.Person");
			Method[] methods = c.getMethods();
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
