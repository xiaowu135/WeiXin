package com.xiaowu.demo;


/**
 * 将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
 * 
 * 
 * @author WQ
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		f(100);
	}

	public static void f(int n) {
		int k = 2;
		System.out.print(n + "=");
		while (k <= n) {
			if (k == n) {
				System.out.println(n);
				break;
			} else if (n % k == 0) {
				System.out.print(k + "*");
				n = n / k;
			} else
				k++;
		}
	}
}
