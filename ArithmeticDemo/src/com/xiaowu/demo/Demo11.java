package com.xiaowu.demo;


/**
 * 有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 * 
 * 
 * @author WQ
 *
 */
public class Demo11 {
	public static void main(String[] args) {
        number();
    }

    public static void number() {
        int count = 0;
        for (int x = 1; x < 5; x++) {
            for (int y = 1; y < 5; y++) {
                for (int z = 1; z < 5; z++) {
                    if (x != y && y != z && x != z) {
                        int number = x * 100 + y * 10 + z;
                        System.out.print(number + "\t");
                        count++;
                        if (count % 10 == 0) {
                            System.out.println();
                        }
                    }
                }
            }
        }
        System.out.println("\n共有" + count + "个三位数");
    }
}
