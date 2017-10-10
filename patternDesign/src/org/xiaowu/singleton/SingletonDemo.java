package org.xiaowu.singleton;

/**
 * 单例模式:懒汉式,线程不安全
 * 
 * @author WQ
 *
 */
public class SingletonDemo {
	private static SingletonDemo instance;

	private SingletonDemo() {
	}

	public static SingletonDemo getInstance() {
		if (instance == null) {
			instance = new SingletonDemo();
		}
		return instance;
	}
}
