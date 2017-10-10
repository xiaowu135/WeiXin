package com.xiaowu.demo;

/**
 * 给一个不多于5位的正整数，要求：①求它是几位数；②逆序打印出各位数字。
 * 
 * 
 * @author WQ
 *
 */
public class Demo23 {
	public static void main(String[] args) {
        f(123789);
    }

    public static void f(long l) {
        String s = Long.toString(l);
        char[] c = s.toCharArray();
        int j = c.length;
        System.out.println(l + "是一个" + j + "位数。");
        System.out.print(l +"按逆序输出是：");
        for (int i = j - 1; i >= 0; i--) {
            System.out.print(c[i]);
        }
    }
}
