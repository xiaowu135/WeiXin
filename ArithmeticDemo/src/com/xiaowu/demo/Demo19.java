package com.xiaowu.demo;

/**
 * 
 * 
 打印出如下图案（菱形）

 *
 * 
 * 
 * @author WQ
 *
 */
public class Demo19 {
	public static void main(String[] args) {
		display(5);
	}

	public static void display(int h) {
		for (int i = 0; i < (h + 1) / 2; i++) {
			for (int j = 0; j < h / 2 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < (i + 1) * 2; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i <= h / 2; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < h - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
