package com.xiaowu.demo;

/**
 * 利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 
 * 
 * @author WQ
 *
 */
public class Demo5 {
	public static void main(String[] args) {
		score(90);
	}

	public static void score(int n) {
		char s = n >= 90 ? 'A' : (n < 60 ? 'C' : 'B');
		System.out.println("该成绩等级为：" + s);
	}
}
