package com.xiaowu.demo;


/**
 * 判断101-2000之间有多少个素数，并输出所有素数。
 * 
 * @author WQ
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		prime();
	}

	public static void prime() {
		int count = 0;
		for (int i = 101; i < 2000; i += 2) {
			boolean flag = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}
			if (flag) {
				count++;
				System.out.print(i + " ");
				if (count % 10 == 0) {
					System.out.println();//显示换行处理
				}
			}
		}
		System.out.println("\n共有" + count + "个素数。");
	}
}
