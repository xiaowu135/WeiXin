package org.xiaowu.reflect.test;

import java.lang.reflect.Method;

public class ReflectDemo {
	
	
	public static void main(String[] args){
        try {
            Class c = Class.forName("org.xiaowu.reflect.test.Person");
            Object o = c.newInstance();
            Method method = c.getMethod("fun", String.class, int.class);
            method.invoke(o, "tengj", 10);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	
	
	 /*public static void main(String[] args){
	        try {
	            Class c = Class.forName("org.xiaowu.reflect.test.Person");
	            Field[] fields = c.getDeclaredFields();
	            for(Field field :fields){
	                System.out.println(field.getName());
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }*/
	
}
