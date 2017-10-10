package com.xiaowu.demo;

/**
 * 完全平方即用一个整数乘以自己例如1*1，2*2，3*3等，依此类推。若一个数能表示成某个整数的平方的形式，则称这个数为完全平方数。
 * 完全平方数是非负数，而一个完全平方数的项有两个。注意不要与完全平方式所混淆。
 * 
 * 
 * 一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
 * 
 * @author WQ
 *
 */
public class Demo13 {
	public static void main(String[] args) {
		number();
	}

	public static void number() {
		for (int x = 1; x < 100000; x++) {
			if (Math.sqrt(x + 100) % 1 == 0 && Math.sqrt(x + 268) % 1 == 0) {
				System.out.println(x + "加100是一个完全平方数，再加168又是一个完全平方数");
			}
		}
	}
}
