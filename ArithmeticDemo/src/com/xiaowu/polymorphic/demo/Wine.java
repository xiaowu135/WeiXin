package com.xiaowu.polymorphic.demo;

/**
 * 父类  --- 酒
 * 
 * 
 * @author WQ
 *
 */
public class Wine {
	public void fun1() {
		System.out.println("Wine 的Fun.....");
		fun2();
	}

	public void fun2() {
		System.out.println("Wine 的Fun2...");
	}
}
