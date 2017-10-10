package com.xiaowu.demo;

/**
 * 输入两个正整数m和n，求其最大公约数和最小公倍数。
 * 
 * @author WQ
 *
 */
public class Demo6 {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int max = f(a, b);
		int min = a * b / max;
		System.out.println("最大公约数：" + max + " 最小公倍数：" + min);
	}

	public static int f(int x, int y) {
		int t;
		if (x < y) {
			t = x;
			x = y;
			y = t;
		}
		while (y != 0) {
			if (x == y) {
				return x;
			} else {
				int k = x % y;
				x = y;
				y = k;
			}
		}
		return x;
	}
}
