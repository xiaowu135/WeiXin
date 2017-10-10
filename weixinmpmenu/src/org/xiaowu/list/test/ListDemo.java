package org.xiaowu.list.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListDemo {

	/**
	 * length/length()/size()三者的区别
	 * 
	 */
	@Test
	public void Test() {
		String[] list = { "ma", "cao", "yuan" };
		String a = "macaoyuan";
		System.out.println(list.length);// 不带有括号,展示的是属性
		System.out.println(a.length());// 带有括号,展示的是方法
		List<Object> array = new ArrayList<>();
		array.add(a);
		System.out.println(array.size());
	}

	/**
	 * 判断下面字符串中每个字符出现的次数
	 * 
	 */
	@Test
	public void Test1() {
		String str = "abcdeaaadfec53543543253@!#@!#$$@@!@#@!#!@3";
		Boolean flag;
		int count;
		for (int i = 0; i < str.length(); i++) {
			flag = true;
			count = 0;
			for (int k = 0; k < i; k++) {
				// 这一行代码的含义是当一个字符串第N次出现(N>1)相同的字符的时候,不进行打印输出次数的操作
				if (str.charAt(i) == str.charAt(k))
					flag = false;
			}
			if (flag == true) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				System.out.println(str.charAt(i) + "出现" + count + "次");
			}
		}
	}


	
	
	@Test
	public void Test2() {
		List<String> list = new ArrayList<String>(2);
		list.add("guan");
		list.add("bao");
		String[] array = new String[list.size()];
		array = list.toArray(array);
		System.out.println("array:" + array);
		System.out.println("array:" + array[0]);
		System.out.println("array:" + array[1]);
		System.out.println("array:" + array[2]);
	}


	
	
	@Test
	public void Test3() {
		List<String> a = new ArrayList<String>();
		a.add("1");
		a.add("2");
		for (String temp : a) {
			if ("2".equals(temp)) {
				a.remove(temp);
			}
		}
	}

}
