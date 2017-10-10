package org.xiaowu.singleton;

public class SingletonDemo4 {
	private static class SingletonHolder {
		private static final SingletonDemo4 INSTANCE = new SingletonDemo4();
	}

	private SingletonDemo4() {
	}

	public static final SingletonDemo4 getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
