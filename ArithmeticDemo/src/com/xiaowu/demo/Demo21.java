package com.xiaowu.demo;

//求1+2!+3!+...+20!的和。
public class Demo21 {
	public static void main(String[] args) {
		sum(20);
	}

	public static void sum(int n) {
		long sum = 0;
		long fac = 1;
		for (int i = 1; i <= n; i++) {
			fac *= i;
			sum += fac;
		}
		System.out.println("1!到" + n + "!相加的和是： " + sum);
	}
}
