package org.xiaowu.singleton;

/**
 * 单例模式：懒汉式,线程安全
 * 
 * 
 * @author WQ
 *
 */
public class SingletonDemo1 {
	private static SingletonDemo1 instance;

	private SingletonDemo1() {
	}

	public static synchronized SingletonDemo1 getInstance() {
		if (instance == null) {
			instance = new SingletonDemo1();
		}
		return instance;
	}
}
