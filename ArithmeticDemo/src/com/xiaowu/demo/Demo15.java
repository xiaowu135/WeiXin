package com.xiaowu.demo;

/**
 * 
 * 输入三个整数x，y，z，请把这三个数由小到大输出。
 * 
 * @author WQ
 *
 */
public class Demo15 {
	public static void main(String[] args) {
		sort(15, 10, 5);
	}

	//定义临时变量进行数字的移位操作
	public static void sort(int x, int y, int z) {
		if (x > y) {
			int t = x;
			x = y;
			y = t;
		}
		if (x > z) {
			int t = x;
			x = z;
			z = t;
		}
		if (y > z) {
			int t = y;
			y = z;
			z = t;
		}
		System.out.println("三个数字由小到大排列为： " + x + " " + y + " " + z);
	}
}
