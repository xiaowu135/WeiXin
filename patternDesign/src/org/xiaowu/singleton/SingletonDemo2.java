package org.xiaowu.singleton;

/**
 * 单例模式：饿汉式 
 * 
 * @author WQ
 *
 */
public class SingletonDemo2 {
	private static SingletonDemo2 instance = new SingletonDemo2();

	private SingletonDemo2() {
	}

	public static SingletonDemo2 getInstance() {
		return instance;
	}
}
