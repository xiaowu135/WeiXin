package org.xiaowu.singleton;

public class SingletonDemo3 {
	private volatile static SingletonDemo3 singleton;

	private SingletonDemo3() {
	}

	public static SingletonDemo3 getSingleton() {
		if (singleton == null) {
			synchronized (SingletonDemo3.class) {
				if (singleton == null) {
					singleton = new SingletonDemo3();
				}
			}
		}
		return singleton;
	}
}
